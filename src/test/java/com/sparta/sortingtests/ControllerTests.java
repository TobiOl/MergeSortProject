package com.sparta.sortingtests;

import com.sparta.sortmanager.controller.SortManagerController;
import com.sparta.sortmanager.model.GenerateArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ControllerTests {
    @Test
    public void testValuesStored(){
        SortManagerController smc = new SortManagerController();
        smc.setChoice1("BubbleSort");
        smc.setChoice2(20);
        smc.setUnsortedArray(GenerateArray.generateIntArray(20));
        assertTrue(smc.getChoice1().equals("BubbleSort") && smc.getChoice2() == 20);
    }

    @Test
    public void testRandomArrayGenerated(){
        SortManagerController smc = new SortManagerController();
        smc.setChoice1("BubbleSort");
        smc.setChoice2(20);
        assertTrue(smc.getChoice1().equals("BubbleSort") && smc.getChoice2() == 20);
    }
}
