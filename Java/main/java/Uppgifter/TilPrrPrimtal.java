/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Uppgifter;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * @author Arvid
 */
public class TilPrrPrimtal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Creating a variable to be used in while loops that determine if input is valid or the loop should run again
        boolean invalid = true;
        int numberOfNumbers=0;
        //While loop that makes sure input and takes a new one if it is'nt
        while (invalid){
            //Try and catch to stop the program from crashing after an exception is thrown by an invalid input
            try{
                numberOfNumbers = scan.nextInt();
                invalid = false;
                //If an exception is'nt thown invalid is set to false and the loop ends
            } catch(InputMismatchException e){
                // InputMismatchExcepton is thown if the input  cant be interpreted as an integer, this catches that, clears the line and prompts user to try again
                scan.nextLine();
                System.out.println("Something went wrong, try again");
            }
        }
        invalid = true; //Resets invalid to true to be used again in the next loop, I dont know if this is the best way but my thought is that less memory is used compared to creating a new variable
        int[] numbers = new int[numberOfNumbers]; //Creates empty integer array with length of numberOfNumbers
        //Same as while loop above
        while (invalid){
            try{
                for(int i = 0; i<numberOfNumbers;i++){
                    numbers[i]=scan.nextInt();//works similarly to above but now uses a for loop to iterate over multiple numbers ading them to the array, possible improvement is making so that only one number needs to be rewritten on wrong input
                }
                invalid = false;
            }
            catch(InputMismatchException e){
                //Same as above
                scan.nextLine();
                System.out.println("Something went wrong, try again");
            }
        }
        invalid = true;
        System.out.println("Do you want to use a faster method or one with easier to read code? write \"fast\" or \"reliable\"");//Made two functions so everyone is happy :)
        while (invalid){
            String method = scan.nextLine().toLowerCase();//probably a flawed way because its very sensitive to wrong inputs, toLowerCase makes all characters in string lowercase to reduce errors
            //.equals checks if the contents of two strings match each other
            if("fast".equals(method)){
                for(int i = 0; i<numberOfNumbers;i++){//loops though all objects in the array and checks if they are prime
                System.out.println(numbers[i]+" is "+(checkPrimeFast(numbers[i])?"":"not ")+"a prime number");//the if inside adds "not" if the number is not a prime number, looks and works neat without needing multiple ifs and prints
                }
                invalid = false;
            } else if("reliable".equals(method)){
                for(int i = 0; i<numberOfNumbers;i++){
                    System.out.println(numbers[i]+" is "+(checkPrime(numbers[i])?"":"not ")+"a prime number");
                }
                invalid = false;
            } else{
                //Lets the user make a new input if they wrote something that didn't match
                System.out.println("Input didn't match, make shure to not include anything other than the word fast or the world reliable");
            }
        }
        
    }
    public static boolean checkPrime(int number){
        //basic check to make sure the number could be a prime
        if (number <= 1){
            return false;
        }
        //check for 2 and 3, because the next modulo would return them as not primes otherwise
        else if(number == 2 || number == 3){
            return true;
        }
        //speeds up the function by removing all even numbers and numbers divisible by three before the loop so that the loop doesn't check them over and over again spending unececarry time on it
        else if(number % 2 == 0||number % 3 == 0){
            return false;
        }
        /*The loop that checks all numbers not divisible by 2 or 3 
        only checks factors up to the square root of the number, this is because all factors over the square root have to be multiplied by a factor lower than the root to get to the number and that pairing has therefor already been checked
        iterates by 6 and checks i and i+2 because numbers not divisible by 2 or 3 come in a pattern where the numbers not covered by theme have first 3 spaces then 1 then three, so every sixth and sixth plus 2 are checked
        */
        for (int i = 5; i <= Math.sqrt(number); i = i+6){
            if (number%i == 0 || (number)%(i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPrimeFast(int number){
        //basic check to make sure the number could be a prime
        if (number <= 1){
            return false;
        }
        //check for 2, 3 and 5, because the next modulo would return them as not primes otherwise
        else if(number == 2 || number == 3 || number == 5){
            return true;
        }
        //speeds up the function by removing all even numbers and numbers divisible by 3 and 5 before the loop so that the loop doesn't check them over and over again spending unececarry time on it
        else if(number % 2 == 0||number % 3 == 0|| number % 5 == 0){
            return false;
        }
        /*similar to the function above but the checks are fewer because numbers divisible by 5 and not 2 or 3 are also ignored, for example 25
        because of the 5 the pattern only repeats every 30 (3*2*5) which nececitates 8 if statements, this looks a little bit cluttered but saves processor time, a sacrifice i think is worth it
        the loop starts with i = 7 to avoid redundant checks
        */
        for (int i = 7; i <= Math.sqrt(number); i = i+30){
            if (number%i == 0 || number%(i+4) == 0|| number%(i+6) == 0|| number%(i+10) == 0|| number%(i+12) == 0 || number%(i+16) == 0|| number%(i+22) == 0|| number%(i+24) == 0){
                return false;
            }
        }
        return true;
    }
}
