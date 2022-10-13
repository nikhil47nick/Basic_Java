package com.bridgelabz.Day1;

import java.util.Random;

public class CoinFlip {

public static void main(String[] args)
	{
Random random = new Random();
int ran = random.nextInt(1,3);
if (ran == 1)
{
System.out.println("Head");
}
else
{
System.out.println("Tail");
}
switch (ran)
{
case 1:System.out.println("Head");
break;
default:System.out.println("Tail");
break;
}

}
	}