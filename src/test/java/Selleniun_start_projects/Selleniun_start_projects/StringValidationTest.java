package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringValidationTest {

    @Test
    public void testValidValueSevenDigits() {
        assertEquals("Valid Value", StringValidator.validateString("7654321"));
    }

    @Test
    public void testInvalidValueEmpty() {
        assertEquals("Invalid Value", StringValidator.validateString(""));
    }

    @Test
    public void testValidValueAlphanumeric() {
        assertEquals("Valid Value", StringValidator.validateString("wE3W32F"));
    }

    @Test
    public void testInvalidValueSpecialCharacters() {
        assertEquals("Invalid Value", StringValidator.validateString("WEc4O9@"));
    }
}
