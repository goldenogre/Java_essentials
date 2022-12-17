package algorithms.string;

public class ValidateString {
    /**
     * Checks for all matches in a string
     * @param s
     * @return
     */
    public static boolean isUpperCase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }
    public static boolean isLowerCase(String s){
        // s.chars().noneMatch(Character::isUpperCase); // opposite
        return s.chars().allMatch(Character::isLowerCase);
    }

    /***
     * Checks to see if string has any match
     * @param s the password
     * @return true or false
     */
    public static boolean isPasswordComplex(String s){
       return s.chars().anyMatch(Character::isUpperCase) &&
               s.chars().anyMatch(Character::isLowerCase) &&
               s.chars().anyMatch(Character::isDigit);

    }
    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",", "");
    }
    public static void main(String[] args) {
        String n = "Damian";
        System.out.println(n.contains("ami"));
    }
}
