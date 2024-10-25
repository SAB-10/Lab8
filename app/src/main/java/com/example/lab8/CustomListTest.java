package com.example.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Calgary", "AB");
//test
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList(); // Initializes an empty list
        City city = new City("Calgary", "AB");
        list.addCity(city); // Add city to the list

        list.hasCity(city); // Check that the city exists (if using void hasCity)

        list.deleteCity(city); // Attempt to delete city

        list.hasCity(city); // Check that the city no longer exists
    }

}