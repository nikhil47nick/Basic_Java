package com.bridgelabz.Day1;

import java.util.*;
import java.util.Scanner;

public class WhileExa{
	
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("Enter Number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
	while(num != 0)
	{
		num = num/10;
		count++;
		
	}
	System.out.println(count);
	}
}