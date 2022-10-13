package com.bridgelabz.Day1;

import java.util.*;

public class DemoStaticmethodblock16{
	static int a = 10;
	
	{
		System.out.println("Running Blocks ");
	}
	
	public void Demomehod(){
		System.out.println("Demo Method");
	}
	
	public static void main(String[] args)
	{
	DemoStaticmethodblock16 dm = new DemoStaticmethodblock16();
	dm.Demomehod();
	System.out.println("static int value"+a);
	
	}
}