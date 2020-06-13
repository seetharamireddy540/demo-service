package com.example.demo;

import java.util.HashSet;

public class IamRoleArns {
    private final String stage;

    private final HashSet<Arn> arns;

    public IamRoleArns(String stage, HashSet<Arn> arns) {
        this.stage = stage;
        this.arns = arns;
    }

    public String getStage() {
        return stage;
    }

    public HashSet<Arn> getArns() {
        return arns;
    }
}
