package com.bridgelabz.Day1;

import java.util.Random;

public class RandomNum {

public static void main(String[] args)
	{
Random random = new Random();
int ran = random.nextInt(35,75);
System.out.println(ran);

for(int i=0;i< args.length;i++)
  {
System.out.println(args[i]);
   }
	}
	}