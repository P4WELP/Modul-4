package PasswordVerify;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PasswordVerifyTest {

    @Test
    public void PasswordVerify() {
        PasswordVerify verifier = new PasswordVerify();

        assertTrue(verifier.verifyPassword("Pawel123456789!"));
        assertFalse(verifier.verifyPassword("P@wwel123456789"));
        assertFalse(verifier.verifyPassword("Pawel1"));
        assertFalse(verifier.verifyPassword("P@wel 123456789"));
        assertFalse(verifier.verifyPassword("Pawel !12345"));
    }

    @Test
    public void testHasGoodLength() {
        PasswordVerify verifier = new PasswordVerify();
        assertTrue(verifier.hasGoodLength("P@wel123456789"));
        assertFalse(verifier.hasGoodLength("Pawel1"));
    }

    @Test
    public void testHasNoWhiteSpaces() {
        PasswordVerify verifier = new PasswordVerify();
        assertTrue(verifier.hasNoWhiteSpaces("P@wel123456789"));
        assertFalse(verifier.hasNoWhiteSpaces("P@wel 123456789"));
    }

    @Test
    public void testHasNoRepetitions() {
        PasswordVerify verifier = new PasswordVerify();
        assertTrue(verifier.hasNoRepetitions("P@wel123456789"));
        assertFalse(verifier.hasNoRepetitions("P@wwel123456789"));
    }

    @Test
    public void testHasNumbers() {
        PasswordVerify verifier = new PasswordVerify();
        assertTrue(verifier.hasNumbers("P@wel123456789!"));
        assertFalse(verifier.hasNumbers("P@wel.!@#$%^&*"));
    }

    @Test
    public void testHasSpecialCharacter() {
        PasswordVerify verifier = new PasswordVerify();
        assertTrue(verifier.hasSpecialCharacter("Pawel123456789!"));
        assertFalse(verifier.hasSpecialCharacter("Pawel123456789"));
    }
}