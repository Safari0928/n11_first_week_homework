package com.n11.homework.entity;

import lombok.Data;

@Data
public class House {
    /*
   1=Ev,2=Villa,3=Yalzık
     */
    private int type;
    private int area;
    private int price;
    private int rooms;
    private int livingRooms;

    public House(int type, int area, int price, int rooms, int livingRooms) {
        this.type = type;
        this.area = area;
        this.price = price;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

}
