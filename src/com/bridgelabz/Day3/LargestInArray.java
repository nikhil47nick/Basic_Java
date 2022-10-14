package com.bridgelabz.Day3;

public class LargestInArray {

    public static void main(String[] args) {
        int array_one[] = new int[]{55, 22, 33, 44, 55, 66, 77, 22, 33, 44, 55};
        int max=array_one[0];
        for (int i = 0;i<array_one.length;i++)
        {
            if (max < array_one[i]){
                 max = array_one[i];
                }
        }
        System.out.println("Maximum Value"+max);
    }
}
