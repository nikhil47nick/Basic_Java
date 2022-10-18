package com.bridgelabz.Day3;

public class FreqecyOfElement {

    public static void main(String[] args){
        int array_one[] =new int[]{55,22,33,44,55,66,77,22,33,44,55};
        int fre[] = new int[array_one.length];
        int visited = -1;

                for (int i = 0; i<array_one.length;i++){
                    int count = 1;
                    for (int j = i + 1; j<array_one.length;j++){
                        if (array_one[i] == array_one[j]){
                         count++;
                         fre[i] = visited;

                        }
                    }
                    if (fre[i] != visited){
                            fre[i] = count;
                    }
                }
                for (int k = 0;k<fre.length;k++){
                    if(fre[k] != visited){
                        System.out.println(""+array_one[k]+"  "+fre[k]);
                    }

                }
    }
}
