package com.example.java.stusent;

import java.util.Scanner;

public class Student_Name_Age {
	
	//Creating an Array for the accepting StudetName & StudentAge
	String [] name = new String [10];
	int [] age = new int [10];

	public static void main(String[] args) {
		
		Student_Name_Age student = new Student_Name_Age();

		student.Accept();
		student.Dispaly();
	}

	public void Accept()
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter Student Name: ");
			name[i] = sc.next();
			System.out.println("Enter Student Age: ");
			age[i] = sc.nextInt();
		}
		
		
		sc.close();
	}
	
	public void Dispaly()
	{
		
		for (int j = 0; j < 10; j++) {
		System.out.println("Dispaly Student Name:" +  name[j]);	
		System.out.println("Dispaly Student Age:" +  age[j]);	
		}
		
		
		
	}
	
}
