package com.n11.homework.service;

import com.n11.homework.entity.House;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {

    private List<House> houses;

    public HouseService(List<House> houses) {
        this.houses = houses;
    }

    public int getTotalPriceForType(int type) {
        int totalPrice = 0;
        for (House house : houses) {
            if (house.getType()==type) {
                totalPrice += house.getPrice();
            }
        }
        return totalPrice;
    }

    public int getAllTotalPrice() {
        int totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public double getAverageAreaForType(int type) {
        int totalArea = 0;
        int houseCount = 0;
        for (House house : houses) {
            if (house.getType()==type) {
                totalArea += house.getArea();
                houseCount++;
            }
        }
        return houseCount == 0 ? 0 : (double) totalArea / houseCount;
    }

    public double getOverallAverageArea() {
        if (houses.isEmpty()) {
            return 0;
        }

        int totalArea = 0;
        for (House house : houses) {
            totalArea += house.getArea();
        }
        return (double) totalArea / houses.size();
    }

    public List<House> filterByRoomAndLivingRoomCount(int roomCount, int livingRoomCount) {
        List<House> filteredList = new ArrayList<>();
        for (House house : houses) {
            if (house.getRooms() == roomCount && house.getLivingRooms() == livingRoomCount) {
                filteredList.add(house);
            }
        }
        return filteredList;
    }
}
