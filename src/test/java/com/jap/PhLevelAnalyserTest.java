package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhLevelAnalyserTest {
    PhLevelAnalyser object;

    @Before
    public void setUp()  {
        object = new PhLevelAnalyser();
    }
    @Test
    public void getPhValurOfWaterForInputPhSeven(){
        String actual = object.getPhValueOfWater(7);
        assertEquals("pH value is fine",actual);
    }

    @Test
    public void getPhValurOfWaterForInputPhEight(){
        String actual = object.getPhValueOfWater(8);
        assertEquals("pH value is fine",actual);
    }

    @Test
    public void getPhValurOfWaterForInputPhTen(){
        String actual = object.getPhValueOfWater(10);
        assertEquals("pH value is high, partial water change required",actual);
    }
    @After
    public void tearDown()  {
        object=null;
    }
}