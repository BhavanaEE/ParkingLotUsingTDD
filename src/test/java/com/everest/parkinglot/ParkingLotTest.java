package com.everest.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    private String parkingId;
    private int noOfFloors=2;
    private int slotsInEachFloor=6;
    ParkingLot parkingLot;
    @Test
    void checkNoOfFloorsTest(){
        int expected=parkingLot.getNoOfFloors();
        assertEquals(expected,noOfFloors);
    }
}