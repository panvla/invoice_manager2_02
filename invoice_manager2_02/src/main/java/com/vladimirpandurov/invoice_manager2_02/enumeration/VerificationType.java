package com.vladimirpandurov.invoice_manager2_02.enumeration;

public enum VerificationType {
    ACCOUNT("ACCOUNT"),
    PASSWORD("PASSWORD");

    private final String type;

    VerificationType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type.toLowerCase();
    }
}
