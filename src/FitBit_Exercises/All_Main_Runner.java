package FitBit_Exercises;

/**
 * Created by B on 8/7/2017.
 */
public class All_Main_Runner {

    public static void main(String []args){
        All_Main_Runner runner = new All_Main_Runner();

        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Reverse String: Hello World!");
        System.out.println(runner.reverseString("Hello World!"));
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Print odd numbers from 1-99");
        runner.printOddNumbersFrom1to99();
        System.out.println();System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Find largest value in array");
        int[] array = {-55,-1,0,1,-400};
        System.out.println("Largest value in array = "+runner.largestValueInArray(array));


    }

    /************************************Question 1********************************************* /
/*  Question 1:   Write a function to reverse a string. (should take them 10 minutes)
    i.  Example output for “Hello World!” -> “!dlroW olleH”
 */

    public String reverseString(String s){
        if(s == null){
            return "ERROR string passed in is null";
        }
        if(s.isEmpty()){
            return "";
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

/* I would test this by;
1. passing in a empty string and making sure it returned an empty string
2. passing in a null value to make sure the program threw an error
3. pass in a valid string such as "Hello!#$%" with special characters
*/

/************************************Question 2*********************************************/

    /* Question 2:  Write function to print the odd numbers from 1 to 99.
    i.  Example output: 1 3 5 7 …. 99
    */

    public void printOddNumbersFrom1to99(){
        for(int i=1; i<=99; i++){
            if(!(i%2 == 0)){//if it is not divisible by 2 then it is an odd number
                System.out.print(i+" ");
            }///end if
        }//end for
    } //end function
/*comment: I would test this by;
1. I would setup a test suite that verified the strings outputed were odd integer values from 1 - 99
using the String.parseInt();
*/

/************************************Question 3*********************************************/
    /* Question 2b:  Write a function that finds the largest int value in an int array.
    i.  Example output for [10, 50, 20, 1, 3] -> 50
    */

    public int largestValueInArray(int[] array){
        if(array == null || array.length == 0){
            System.out.println("**ERROR array is null or empty**");
            System.out.println("Returning Integer.MIN_VALUE");
            return Integer.MIN_VALUE;
        }
        int largestValue = Integer.MIN_VALUE;
        for(int i = 0; i<array.length; i++){
            if(array[i] > largestValue){
                largestValue = array[i];
            }
        }
        return largestValue;
    }

}
