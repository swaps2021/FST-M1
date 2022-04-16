package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Jan");
        hs.add("Feb");
        hs.add("Mar");
        hs.add("Apr");
        hs.add("May");
        hs.add("Jun");

        System.out.print("The original hashset is : "+hs);
        System.out.println("Size of hashset is : "+hs.size());
        System.out.println("Removing Mar from hashset"+hs.remove("Mar"));
        if(hs.remove("Apr")){
            System.out.println("Apr removed from the hashset");}
            else{
                System.out.println("Apr is not present in the hashset");
        }
            System.out.println("Checking if Feb is present: "+hs.contains("Feb"));
            System.out.println("Updated Hashset : "+hs);
    }
}
