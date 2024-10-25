package com.example.lab8;

import static org.junit.Assert.assertEquals;

import com.example.lab8.City;
import com.example.lab8.CustomList;

import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    // Method to initialize the mock list
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    // Test method for addCity
    @Test
    public void addCityTest() {
        list = MockCityList(); // Initialize mock list here directly
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

}