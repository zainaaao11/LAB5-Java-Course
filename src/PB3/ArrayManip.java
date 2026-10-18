package PB3;

import java.util.Scanner;

public class ArrayManip {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Type the number of desired integers: ");
        int userInt=scan.nextInt();
        int[] inputs= new int[userInt];
        System.out.println("Enter the values one by one:");
        for (int i=0; i<userInt; i++){
            inputs[i]=scan.nextInt();
        }
        //print the array of ints
        System.out.print("Array= ");
        for (int v:inputs){
            System.out.print(v+" ");
        }
        System.out.println();
        //now reverse the array
        int start=0;
        int end=inputs.length-1;
        int tempVar;
        while (start<end){
            tempVar=inputs[start];
            inputs[start]=inputs[end];
            inputs[end]=tempVar;
            start++;
            end--;
        }
        //print the reversed array
        System.out.print("The reversed array= ");
        for (int v:inputs){
            System.out.print(v+" ");
        }
    }
}
