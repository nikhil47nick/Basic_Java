package com.bridgelabz.Day3;

public class SecondLargestNum {

    public static void main(String[] args) {
        int array_one[] = new int[]{55, 22, 33, 44, 11, 66, 77, 88, 99};
        int min = array_one[0];
        int secondMin = array_one[1];
        for (int j = 0; j < array_one.length; j++) {

            if (array_one[j] < min) {
                secondMin = min;
                min = array_one[j];
            }
        }

            for (int k = 0; k < array_one.length; k++){
                if (array_one[k] < secondMin && array_one[k] != min) {
                    secondMin = array_one[k];
                }
        }
            System.out.println("Second Minimum" + secondMin);

    }
}
