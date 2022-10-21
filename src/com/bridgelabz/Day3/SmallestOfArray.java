package com.bridgelabz.Day3;

public class SmallestOfArray {
    public static void main(String[] args) {
        int array_one[] = new int[]{55, 22, 33, 44, 55, 66, 77, 22, 33, 44, 55};
        int min=array_one[0];
        for (int i = 0;i<array_one.length;i++)
        {
            if (min > array_one[i]){
                min = array_one[i];
            }
        }
        System.out.println("Smallest Value"+min);
    }
}
