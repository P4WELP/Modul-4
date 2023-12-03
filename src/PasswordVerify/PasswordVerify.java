package PasswordVerify;

public class PasswordVerify {
    public boolean verifyPassword(String password) {
        return hasGoodLength(password) &&
                hasNoWhiteSpaces(password) &&
                hasNoRepetitions(password) &&
                hasNumbers(password) &&
                hasSpecialCharacter(password);
    }

    public boolean hasGoodLength(String password) {
        return password.length() >= 12;
    }

    public boolean hasNoWhiteSpaces(String password) {
        return !password.contains(" ");
    }

    public boolean hasNoRepetitions(String password) {
        for (int i = 0; i < password.length() - 1; i++) {
            char currentChar = password.charAt(i);
            char nextChar = password.charAt(i + 1);

            if (Character.isLetterOrDigit(currentChar) &&
                    Character.isLetterOrDigit(nextChar) &&
                    currentChar == nextChar) {
                return false;
            }
        }
        return true;
    }

    public boolean hasNumbers(String password) {
        return password.matches(".*\\d.*");
    }

    public boolean hasSpecialCharacter(String password) {
        return password.matches(".*[!@\\-;\"(){}\\[\\]]|\\?.*");
    }
}