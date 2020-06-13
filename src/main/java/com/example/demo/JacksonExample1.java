package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class JacksonExample1 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Staff staff = createStaff();
        try {

            // Java objects to JSON file
            mapper.writeValue(new File("/Users/mittalas/Desktop/demo/src/main/resources/config/staff.json"), staff);

            // Java objects to JSON string - compact-print
            String jsonString = mapper.writeValueAsString(staff);

            System.out.println(jsonString);

            // Java objects to JSON string - pretty-print
            String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);

            System.out.println(jsonInString2);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Staff createStaff() {

        Staff staff = new Staff();

        Map<String, IamRoleArns> iamRoleArnsMap = new HashMap<>();
        HashSet<Arn> arns = new HashSet<Arn>();
        arns.add(new Arn("229391549784", "arn:aws:iam::135153913813:role/OrcaNawsHerdEngineCanaryServiceAlpahRole"));
        arns.add(new Arn("229391549785", "arn:aws:iam::135153913813:role/OrcaNawsHerdEngineCanaryServiceAlpahRole"));

        IamRoleArns iamRoleArns = new IamRoleArns("alpha", arns);

        iamRoleArnsMap.put("alpah",iamRoleArns );
        iamRoleArnsMap.put("beta",iamRoleArns );
        staff.setIamRoleArnsMap(iamRoleArnsMap);

        return staff;

    }
}
