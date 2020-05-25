package com.example.demo.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectToJsonConverter {

    public String convertToJson(Object obj) throws JsonSerializationException {
        try {
            checkIfSerializable(obj);
            initializeObject(obj);
            return getJsonString(obj);
        } catch (Exception ex) {
            throw new JsonSerializationException(ex.getMessage());
        }
    }

    private String getJsonString(Object obj) throws IllegalAccessException {

        Class<?> clazz = obj.getClass();
        Map<String, String> jsonElementMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(RamJsonElement.class)) {
                field.setAccessible(true);
                jsonElementMap.put(getKey(field), (String) field.get(obj));
            }
        }

        String jsonString = jsonElementMap.entrySet().stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }

    private String getKey(Field field) {

        String value = field.getAnnotation(RamJsonElement.class).keyName();
        return value.isEmpty() ? field.getName() : value;
    }

    private void initializeObject(Object obj) throws InvocationTargetException, IllegalAccessException {

        Class<?> clazz = obj.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RamInit.class)) {
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }

    private void checkIfSerializable(Object obj) {

        if (Objects.isNull(obj)) {
            throw new JsonSerializationException("Can't serialize a null object");
        }

        Class<?> clazz = obj.getClass();
        if (!clazz.isAnnotationPresent(RamJsonSerializable.class)) {
            throw new JsonSerializationException("The class " + clazz.getSimpleName() + " is not annotated with JsonSerializable");
        }
    }
}
