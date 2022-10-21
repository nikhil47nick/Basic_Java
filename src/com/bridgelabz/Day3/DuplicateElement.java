package com.bridgelabz.Day3;
import java.util.*;

public class DuplicateElement {

    public static void main(String[] args){
        int array_one[] =new int[]{55,22,33,44,55,66,77,22,33,44,55};

        for (int i = 0; i<array_one.length;i++){
            int count = 1;
            for (int j = i+1 ; j<array_one.length-1;j++){
                if (array_one[i] == array_one[j]){
                    System.out.println("Repeated Number"+array_one[i]);
                }
            }
        }

    }


}
