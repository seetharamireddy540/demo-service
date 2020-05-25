package com.example.demo.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectToJsonConverterTest {

    @Test
    public void givenObjectNotSerializedThenExceptionThrown() throws JsonSerializationException {
        Object object = new Object();
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        assertThrows(JsonSerializationException.class, () -> {
            serializer.convertToJson(object);
        });
    }

    @Test
    void convertToJson() {
        Object personObject = new Person("ram", "mittala", "98");

        ObjectToJsonConverter objectToJsonConverter = new ObjectToJsonConverter();

        String jsonString = objectToJsonConverter.convertToJson(personObject);

        System.out.println(jsonString);
    }
}