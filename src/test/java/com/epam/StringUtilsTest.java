package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void isPositiveNumberTest(){
        assertTrue(StringUtils.isPositiveNumber("220"));
        assertFalse(StringUtils.isPositiveNumber("-220"));
        assertTrue(StringUtils.isPositiveNumber("100"));
        assertTrue(StringUtils.isPositiveNumber("100"));
    }
}
