package com.project;

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name:");
		String sname = sc.next();
		System.out.println("enter student age");
		int v=sc.nextInt();
		System.out.println("enter grade for math");
		float a = sc.nextFloat();
		
		
		
		System.out.println("enter grade for science");
		float b = sc.nextFloat();
		System.out.println("enter grade for english");
		float c = sc.nextFloat();
		
		float res= (a+b+c)/3;
		System.out.println("student name: "+sname);
		System.out.println("age: "+v);
		System.out.println("math grade: "+a);
		System.out.println("science grade: "+b);
		System.out.println("english grade: "+c);
		System.out.println("average score: "+res);
		if (res>=80 && res<=100) {
			System.out.println("grade Classification: first class with distance");
		}
		else if(res>=65 && res<=79) {
			System.out.println("grade Classification: first class");
			
		}
		else {
			
			System.out.println("grade Classification: second class ");
		}
		
		
	}

}
