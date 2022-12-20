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

    /**
     * Use StringBuilder class to custom build a reverse string
     * @param s the string to reverse
     * @return reversed string
     */
    public static String reverse(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        StringBuilder reversed = new StringBuilder();
        for(int i = s.length()-1; i >=0;i--){
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }
    /**
     * Use StringBuilder class to custom build a reverse string
     * @param s the string to reverse
     * @return reversed string
     */
    public static String reverseWithSB(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        StringBuilder reversed = new StringBuilder(s); // put string insdie
        // Instead of using a loop, use the build in method to revers

        return reversed.reverse().toString(); // all in one! Don't reinvent the wheel
    }

    /**
     * Challenge: To reverse words in a sentance. Keep all punctuation and space is the seperator.
     * @param s a complete sentence
     * @return string with sentence but words are reversed
     */
    public static String reverseWords(String s){
        if(s==null || s.isEmpty()){
            return s;
        }
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < split.length; i++){
            sb.append(reverse(split[i]));
            if(i != split.length-1){
                sb.append(" ");
            }

        }


        return sb.toString();
    }
    public static void main(String[] args) {
        String n = "Damian";
        System.out.println(n.contains("ami"));
    }
}
