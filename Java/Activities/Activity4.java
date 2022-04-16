package activities;
import java.util.Arrays;

public class Activity4 {
     static void ascendingSort(int arr[]) {
         int size = arr.length;
         int i;

         for (i = 1; i < size; i++) {
             int key = arr[i];
             int j = i - 1;

             while (j >= 0 && key < arr[j]) {
                 arr[j + 1] = arr[j];
                 --j;
             }
             arr[j + 1] = key;
         }
     }
            public static void main(String[] args)
            {
                int[] data = {9, 5, 1, 4, 3};
                ascendingSort(data);
                System.out.println("Sorted Array in Ascending Order: ");
                System.out.println(Arrays.toString(data));
            }
        }

