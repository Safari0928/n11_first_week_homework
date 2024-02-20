package com.n11.homework;

import com.n11.homework.entity.House;
import com.n11.homework.enums.HouseTypeEnum;
import com.n11.homework.service.HouseService;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<House> houseList = new ArrayList<>();
        //Not:1=Ev,2=Villa,3=Yalzık
        houseList.add(new House(1, 147, 110000, 3, 1));
        houseList.add(new House(2, 321, 575000, 5, 2));
        houseList.add(new House(3, 80, 99999, 2, 1));
        houseList.add(new House(2, 400, 600000, 6, 3));
        houseList.add(new House(1, 120, 120000, 4, 1));
        houseList.add(new House(3, 96, 90000, 3, 1));

        HouseService houseService = new HouseService(houseList);

        System.out.println("1.Evlerin toplam fiyatlarını dönen bir metot: " + houseService.getTotalPriceForType(1));
        System.out.println("2.Villaların toplam fiyatlarını dönen bir metot: " + houseService.getTotalPriceForType(2));
        System.out.println("3.Yazlıkların toplam fiyatlarını dönen metot:" + houseService.getTotalPriceForType(3));
        System.out.println("4.Tüm tipteki evlerin toplam fiyatını dönen metot:" + houseService.getAllTotalPrice());

        System.out.println("5.Evlerin ortalama metrekaresini dönen bir metot:" + houseService.getAverageAreaForType(1));
        System.out.println("6.Villaların ortalama metrekaresini dönen bir metot: " + houseService.getAverageAreaForType(2));
        System.out.println("7.Yazlıkların ortalama metrekaresini dönen metot: " + houseService.getAverageAreaForType(3));
        System.out.println("8.Tüm tipteki evlerin ortalama metrekaresini dönen metot: " + houseService.getOverallAverageArea());

        System.out.println("9.Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot:");
        List<House> filteredList = houseService.filterByRoomAndLivingRoomCount(3, 1);
        for (House house : filteredList) {
            System.out.println("Type: " + HouseTypeEnum.getNameByCode(house.getType()) + ", Area: " + house.getArea() +
                    ", Price: " + house.getPrice() + ", Rooms: " + house.getRooms() +
                    ", Living Rooms: " + house.getLivingRooms());
        }
    }
}
