package exception_handling;
// checked vs unchecked. AKA getDouble() from system.in is a String or other type.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws NegativeInputException {
        File inputFile = new File("numbers.txt");
        File outputFile = new File("output.txt");
        // Scanner fileReader = null; added to try-with resources
        try(
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter((outputFile));
                ){

            while(fileReader.hasNext()){
               fileWriter.println(fileReader.nextDouble()); // unchecked
            }
        }catch(FileNotFoundException  | InputMismatchException e){
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(calculatePay(30,45));
        System.out.println(calculatePay(41,22));
        /*
            CUSTOM THROW
         */


//        not needed with try with resources
//        } finally {
//            fileReader.close();
//        }

        // can use pipes to add to one catch block   |

//        try{
//            file.createNewFile();
//        }catch(IOException e){ // IOException, use multiple or a super class of the exception
//            System.out.println("Something done messed up: "  + e.getMessage());
//            e.printStackTrace();
//        }
//

    }
    // Custom exceptions
    public static double calculatePay(double hours, double payRate) throws NegativeInputException{
        if(hours > 40){
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        }
        if(hours < 0 || payRate < 0){
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
}
