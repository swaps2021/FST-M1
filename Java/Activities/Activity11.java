package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> color_Map = new HashMap<Integer,String>();
        color_Map.put(1,"Yellow");
        color_Map.put(2,"Red");
        color_Map.put(3,"Blue");
        color_Map.put(4,"Orange");
        color_Map.put(5,"Green");
        color_Map.put(6,"White");

        System.out.println("The Map colors are : "+ color_Map);
        color_Map.remove(5);
        System.out.println("Colours remaining after removing Green = " + color_Map);

        if(color_Map.containsValue("Green")) {
            System.out.println("Green Exists");
        }
        else
        {
            System.out.println("Green Doesn't exist");
        }

        System.out.println("Number of Colours in the Map : "+color_Map.size());
    }

}
