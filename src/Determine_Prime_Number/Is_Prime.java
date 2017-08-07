package Determine_Prime_Number;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by B on 8/7/2017.
 */
public class Is_Prime {

    public static void main(String []args) throws Exception{
        boolean goAgain = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-------------------------------");
        System.out.println("This program will let you know if an integer is prime or not. ");
        do {
            System.out.println("Please enter a number to determine if it is prime and hit ENTER.");
            System.out.println("Or enter a letter to end the program.");
            System.out.print("Number: ");
            String input = reader.readLine();
            if(input.matches("[a-zA-Z]")){
                break;
            }
            int userInt = Integer.parseInt(input);
            if(isPrime(userInt)){
                System.out.println(userInt+" is prime");
            } else {
                System.out.println(userInt+" is NOT prime");
            }

        }while (true);
    }

    public static boolean isPrime(int n){
        if (n < 0)
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

}
