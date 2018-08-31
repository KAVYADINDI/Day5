package capgemini.day_5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import capgemini.day_5.java.Student;

class StudentTest {
		Student student1;
		Student student2;
		Student student3;
		Student student4;
		Student student5;
		@BeforeEach
		void setUp()
		{
			student1=new Student (1234,"Sam",19,"Java");
			student2= new Student(434,"tom0",21,"english");
			student3= new Student(467,"t&om",25,"english");
			student4= new Student(434,"toM",5,"english");
			student5= new Student(467,"Tom",25,"Maths");
			
		}

			@Test
			void test() {
				assertEquals(true,student1.checkInput());
				assertEquals(false,student2.checkInput());
				assertEquals(false,student3.checkInput());
				assertEquals(false,student4.checkInput());
				assertEquals(false,student5.checkInput());

		}
	}


