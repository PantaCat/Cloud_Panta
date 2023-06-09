package org.panta.common.enums;

public enum SimpleDateFormatType {
    dateFormatYYYYMMDDHHmmss("yyyy-MM-dd HH:mm:ss"),
    dateFormatYYYYMMDD("yyyy-MM-dd");

    private String type;

    public String getType() {
        return type;
    }

    SimpleDateFormatType(String type){
        this.type=type;
    }
}
