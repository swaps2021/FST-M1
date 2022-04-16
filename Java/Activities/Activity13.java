package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        Random num = new Random();

        System.out.println("Enter Integers Only : ");

        while (s1.hasNextInt()){
            numList.add(s1.nextInt());
        }
        Integer[] numArr = numList.toArray(new Integer[0]);
        int index = num.nextInt(numArr.length);
        System.out.println("New Number generated : "+index);
        System.out.println("Value in Array for index "+index+" is " +numArr[index]);

        s1.close();
    }
}
