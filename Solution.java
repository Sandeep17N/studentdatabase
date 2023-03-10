package com.jspiders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import customException.InvalidChoiceException;

public class Solution {
	public static void main(String[] args) {
		//Map<String,Student>db=new LinkedHashMap();
		Scanner scanner=new Scanner(System.in);
		StudentMangementSystem sms=new StudentManagementSystemImpl();
		
		System.out.println("welcome to Student database project");
		System.out.println("-----------");
		while(true) {
			System.out.println("1.addStudent\n2.displayStudent\n3.displayAllStudent\n4.removeStudent\n5.removeAllStudent"+
		"\n6.updateStudent\n7.countStudent\n8.sortStudent");
			System.out.println("9.Exit\nEnter Choice");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				sms.addStudnet();
				break;
			case 2:
				sms.DisplayStudent();
				break;
			case 3:
				sms.DisplayAllStudent();
				break;
			case 4:
				sms.RemoveStudent();
				break;
			case 5:
				sms.RemoveAllStudent();
				break;
				
			case 6:
				sms.UpdateStudent();
				break;
			case 7:
				sms.countStudent();
				break;
			case 8:
				sms.sortStudent();
				break;
			case 9:
				System.out.println("Thanks you");
				System.exit(0);
				break;
				default:
					try {
						throw new InvalidChoiceException("please enter the valid choice");
					}
				catch(Exception e) {
					System.out.println(e.getMessage());
					
				}
			}
			System.out.println("--------------------");//after Switch Statement
		}

	}
}
