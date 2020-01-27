
import java.util.Scanner;
import static project2.Project2.doSelectionSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasmin
 */
public class selectionsort {
     public static void main(String a[]){
         int r;
         Scanner m=new Scanner(System.in);
         System.out.println("Enter the length of the array :" + "\n");
         r=m.nextInt();
        int[] arr1 = new int[r];
        System.out.println("Enter the  the array :" + "\n");
        for(int i=0;i<r;i++){
         arr1[i]=m.nextInt();
        }
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
