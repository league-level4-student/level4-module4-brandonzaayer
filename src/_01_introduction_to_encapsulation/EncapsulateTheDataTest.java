package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class EncapsulateTheDataTest {

    EncapsulateTheData testData = new EncapsulateTheData();

  
    @Test
    void itemsReceivedGetterSetter() {

        int randomPositiveNum = new Random().nextInt(100 + 1);

        testData.setItemsReceived(randomPositiveNum);

        assertEquals(randomPositiveNum, testData.getItemsReceived());

    }

    @Test
    void itemsReceivedNotNegative() {

        int randomNegativeNum = new Random().nextInt(100) - 100;

        testData.setItemsReceived(randomNegativeNum);

        assertEquals(0, testData.getItemsReceived());

    }

  

    @Test
    void degreesTurnedGetterSetter() {

        float randomPositiveNum = new Random().nextFloat() * 360;

        testData.setDegreesTurned(randomPositiveNum);

        assertEquals(randomPositiveNum, testData.getDegreesTurned());

    }

    @Test
    void degreesTurnedNotOutsideBounds() {

        float randomNumOutsideBounds = new Random().nextFloat() * 360;

        if (randomNumOutsideBounds >= 180) {
            randomNumOutsideBounds += 360;
        } else {
            randomNumOutsideBounds -= 360;
        }

        testData.setDegreesTurned(randomNumOutsideBounds);

        double boundedNum = testData.getDegreesTurned();

        assertTrue(boundedNum >= 0 && boundedNum <= 360);

    }

  

    @Test
    void nomenclatureGetterSetter() {

        String randomString = new Random().nextInt() + "";

        testData.setNomenclature(randomString);

        assertEquals(randomString, testData.getNomenclature());

    }

    @Test
    void nomenclatureNotBlank() {

        String blankString = "";

        testData.setNomenclature(blankString);

        assertEquals(" ", testData.getNomenclature());

    }

 

    @Test
    void memberObjGetterSetter() {

        Object randomObject = new Object();

        testData.setMemberObj(randomObject);

        assertEquals(randomObject, testData.getMemberObj());

    }

    @Test
    void memberObjNotString() {

        String blankString = "";

        testData.setMemberObj(blankString);

        assertFalse(testData.getMemberObj() instanceof String);

    }

  

}