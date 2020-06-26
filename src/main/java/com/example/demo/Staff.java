package com.example.demo;

import java.util.Map;

public class Staff {

    private Map<String, IamRoleArns> iamRoleArnsMap; //  Map

    public Staff() {
    }

    public Map<String, IamRoleArns> getIamRoleArnsMap() {
        return iamRoleArnsMap;
    }

    public void setIamRoleArnsMap(Map<String, IamRoleArns> iamRoleArnsMap) {
        this.iamRoleArnsMap = iamRoleArnsMap;
    }
}
