package com.everest.parkinglot;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    private String parkingId;
    private int noOfFloors=2;
    private int slotsInEachFloor=6;
    ParkingLot parkingLot;
    @BeforeEach
    public void setUp()
    {
        parkingLot = new ParkingLot("PR1234",2,6);
    }

    @Test
    void checkNoOfFloorsTest(){
        int expected=parkingLot.getNoOfFloors();
        assertEquals(expected,noOfFloors);
    }

    @Test
    void checkSlotsInEachFloor(){
        int expected=parkingLot.getSlotsInEachFloor();
        assertEquals(expected,slotsInEachFloor);
    }
}