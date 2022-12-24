package algorithms.recursion;

public class Recursion {
    /**
     * Recursion: takes number and multiplies it by number - 1 until 1 0 is hit.
     * @param number value to get factorial
     * @return factorial value
     */
    public static int factorial(int number){
        if(number == 0){
            return 1;
        }
        return factorial(number -1) * number;
    }

    /**
     * Iterative version of factorial
     * @param number
     * @return value
     */
    public static int iFactorial(int number){
       if(number == 0){
           return 1;
       }
       int factorial = 1; //
       for(int i = 1;i <=number; i++){
           factorial *= i;
       }
        return factorial;
    }
}
