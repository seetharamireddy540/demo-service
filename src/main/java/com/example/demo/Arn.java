package com.example.demo;

public class Arn {
    private String targetIamRoleArn;
    private String sourceAwsAccountId;

    public Arn(String sourceAwsAccountId, String targetIamRoleArn) {
        this.targetIamRoleArn = targetIamRoleArn;
        this.sourceAwsAccountId = sourceAwsAccountId;
    }

    public String getTargetIamRoleArn() {
        return targetIamRoleArn;
    }

    public void setTargetIamRoleArn(String targetIamRoleArn) {
        this.targetIamRoleArn = targetIamRoleArn;
    }

    public String getSourceAwsAccountId() {
        return sourceAwsAccountId;
    }

    public void setSourceAwsAccountId(String sourceAwsAccountId) {
        this.sourceAwsAccountId = sourceAwsAccountId;
    }
}
