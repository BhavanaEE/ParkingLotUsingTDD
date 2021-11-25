package com.everest.displaystrategy;

import com.everest.display.Display;
import com.everest.parkinglot.ParkingLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DisplayCarStrategyTest {
    Display display;
    ParkingLot parkingLot;
    DisplayCarStrategy displayCarStrategy;
    @BeforeEach
    void setUp(){
        display=new Display();
        parkingLot=new ParkingLot("PR1234",2,6);
        displayCarStrategy=new DisplayCarStrategy();
    }
    @Test
    void checkDisplayFreeCount() {
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,3,parkingLot.getSlotsInEachFloor());
         int actual=3;
         assertEquals(expected.get(0).size(),actual);
    }
}