package com.sparta.sortingtests;

import com.sparta.sortmanager.controller.SortManagerController;
import com.sparta.sortmanager.model.GenerateArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerTests {
    @Test
    public void testValuesStored(){
        SortManagerController smc = new SortManagerController();
        smc.setUserSortChoice("BubbleSort");
        smc.setUserArraySize(20);
        smc.setUnsortedArray(GenerateArray.generateIntArray(20));
        assertTrue(smc.getUserSortChoice().equals("BubbleSort"));
        assertTrue(smc.getUserArraySize() == 20);
    }

    @Test
    public void testRandomArrayGenerated(){
        SortManagerController smc = new SortManagerController();
        smc.setUserSortChoice("BubbleSort");
        smc.setUserArraySize(20);
        assertTrue(smc.getUserSortChoice().equals("BubbleSort") && smc.getUserArraySize() == 20);
    }

    //alter code for random generation and do a test for that
}
