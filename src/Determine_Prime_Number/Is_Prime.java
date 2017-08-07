package Determine_Prime_Number;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by B on 8/7/2017.
 */
public class Is_Prime {

    public static void main(String []args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program will let you know if an integer is prime or not. ");
        do {
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
            System.out.println("Please enter a number and the program will print all primes up until to the number provided.");
            System.out.println("Or enter a letter to end the program.");
            System.out.print("Number: ");
            String input = reader.readLine();
            if(input.matches("[a-zA-Z]")){
                break;
            }
            int userInt = Integer.parseInt(input);
            printAllPrimes1toParam(userInt);
        }while (true);
        System.out.println("Program Ending...");
    }

    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        if(n == 2 || n == 3)
            return true;
        if (n%2 == 0)
            return false;
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printAllPrimes1toParam(int param){
        if(! (param > 1)){ //if it's not greater than 1
            System.out.print("Your number must be larger than 1");
            return;
        }
        for(int i=2; i<=param; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


}
