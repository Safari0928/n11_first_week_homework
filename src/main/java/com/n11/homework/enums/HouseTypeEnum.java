package com.n11.homework.enums;

public enum HouseTypeEnum {

    EV(1, "Ev"),
    VILLA(2, "Villa"),
    YAZLIK(3, "Yazlık");

    private final int code;
    private final String msg;
    HouseTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public static String getNameByCode(int code) {
        for (HouseTypeEnum houseType : HouseTypeEnum.values()) {
            if (houseType.getCode() == code) {
                return houseType.getMsg();
            }
        }
        return null;
    }
}
