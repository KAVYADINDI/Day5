package capgemini.day_5.java;

import java.util.Scanner;

import capgemini.day_5.exceptions.AgeNotWithinRangeException;
import capgemini.day_5.exceptions.NameNotValidException;

public class Student {
	private long rollnumber;
	private String name;
	private int age;
	private String course;
	public Student() {
		super();
	}
	public Student(long rollnumber, String name, int age, String course) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public long getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(long rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public boolean checkInput() {
	try {
		inputValidation(this.age,this.name);
		return true;
	}
	catch(NameNotValidException | AgeNotWithinRangeException e){
		System.out.println(e.getMessage());
	}
		return false;
	}
	private void inputValidation(int age, String name) throws NameNotValidException, AgeNotWithinRangeException{
		for(int i=0;i<=name.length()-1;i++)
		{
			int a=(int)name.charAt(i);
			if((a>=65 && a<=90)||(a>=97 && a<=122))
				continue;
			else
				throw new NameNotValidException	("Name entered has an integer or a special charecter");
		}
		if(age<15 || age>21)
	throw new AgeNotWithinRangeException ("Entered age is not within the specified range");
	}
}
