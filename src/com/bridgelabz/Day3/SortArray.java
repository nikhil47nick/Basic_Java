package com.bridgelabz.Day3;

public class SortArray {

    public static void main(String[] args) {
        int array_one[] = new int[]{55, 22, 33, 44, 11, 66, 77, 88, 99};
        int temp = 0;

        for (int i = 0; i < array_one.length; i++) {
            for (int j = 0; j < array_one.length; j++) {

                if (array_one[i] < array_one[j]) {
                    temp = array_one[i];
                    array_one[i] = array_one[j];
                    array_one[j] = temp;
                                                    }
                                                        }
                                }
        for (int i =0;i<array_one.length;i++){
            System.out.println(""+array_one[i]);
        }
    }
}
