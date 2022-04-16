package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Honda");
        nameList.add("Maruti");
        nameList.add("BMW");
        nameList.add("Toyota");
        nameList.add(2,"Ford");
        nameList.add(3,"Skoda");

        System.out.println("The names are : ");
        for(String n :  nameList){
            System.out.println(n);
        }
        System.out.println("4th Name is :  " +nameList.get(3));
        if(nameList.contains("Ford")){
            System.out.println("Ford is present in the list");
        }
        else
        {
            System.out.println("Ford is not present in the list");
        }
        System.out.println("Size of the list is " +nameList.size());
    }
}
