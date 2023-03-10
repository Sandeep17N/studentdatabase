package com.jspiders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customException.StudentNotFoundException;
import customException.InvalidChoiceException;

public class StudentManagementSystemImpl implements StudentMangementSystem{
	Map<String,Student>db=new LinkedHashMap();
	Scanner scanner=new Scanner(System.in);

	@Override
	public void addStudnet() {
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter age");
		int age=scanner.nextInt();
		System.out.println("enter marks");
		double marks=scanner.nextDouble();

		Student s=new Student(age,name,marks);
		db.put(s.getId(), s);
		System.out.println("Student record inserted succesfully");
		System.out.println("the Student id is "+s.getId());

	}

	@Override
	public void DisplayStudent() {
		System.out.println("enter student id;");
		String id=scanner.next();
		id =id.toUpperCase();
		if(db.containsKey(id)) {
			Student obj=db.get(id);
			System.out.println("id: "+obj.getId());
			System.out.println("Name: "+obj.getName());
			System.out.println("Age: "+obj.getAge());
			System.out.println("Marks: "+obj.getMarks());
		}
		else {
			try {
				throw new StudentNotFoundException("Entered Student id record are not Avaliable");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}

	@Override
	public void DisplayAllStudent() {
		Set<String >keys=db.keySet();
		System.out.println("Student Records are fallows");
		System.out.println("--------");
		if(db.size()!=0) {
			for(String key:keys) {
				System.out.println(db.get(key));
			}
		}
		else {
			try {
				throw new StudentNotFoundException("Student Records not Available to display");
			}
			catch(Exception e) {

				System.out.println(e.getMessage());

			}
		}
	}	


	@Override
	public void RemoveStudent() {
		//Accept the id->String
		//uppercase
		//containkey()
		//remove()
		//else->Snfe->handle
		String id=scanner.next().toUpperCase();
		//id=id.toUpperCase();
		if(db.containsKey(id)) {
			db.remove(id);
			System.out.println("Student Record Deleted Succesfully");
		}
		else {
			//Eception and Handle
			try {
			throw new StudentNotFoundException("Student record not found");
		}
			catch(Exception e){
				String message =e.getMessage();
				System.out.println(message);
				
			}
		}
	}

	@Override
	public void RemoveAllStudent() {
		System.out.println(db.size());
		db.clear();
		System.out.println("all Student record deleted Succesfully");
	}

	@Override
	public void UpdateStudent() {
		System.out.println("enter Student id");
		String id=scanner.next().toUpperCase();
		if(db.containsKey(id)) {
			Student std=db.get(id);
			System.out.println("1:updateName\n2:UpdtaeAge\n3:UpdateMarks");
			System.out.println("enter choice");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter name");
				String name=scanner.next();
				std.setName(name);
				System.out.println("name updated succesfully");
			case 2:
				System.out.println("enter age");
				int age=scanner.nextInt();
				std.setAge(age);
				System.out.println("age updated succesfully");//std.setAge(scanner.nextInt());
			case 3:
				System.out.println("enter the marks");
				std.setMarks(scanner.nextDouble());
				System.out.println("marks updarted succesfully");
				default:
					try {
						throw new InvalidChoiceException("invaild choice");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
			
			}
		}
		else {
			try {
				throw new StudentNotFoundException("Student record not found!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}


	}

	@Override
	public void countStudent() {
		System.out.println(db.size());

	}

	@Override
	public void sortStudent() {
		// TODO Auto-generated method stub

	}

}
