package activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args){
        int[] numArray = {10,77,10,54,-11,10};
        System.out.println("Original Array = "+ Arrays.toString(numArray));

        int search = 10;
        int fixedSum = 30;

        System.out.println("Result = "+result(numArray,search,fixedSum));
            }
            public static boolean result(int[] numbers,int search,int fixedSum){
        int temp_Sum=0;
        for(int number:numbers)
        {
            if(number==search)
            {
                temp_Sum +=search;
            }
            if(temp_Sum > fixedSum)
            {
                break;
            }
        }
                return temp_Sum==fixedSum;


            }
}
