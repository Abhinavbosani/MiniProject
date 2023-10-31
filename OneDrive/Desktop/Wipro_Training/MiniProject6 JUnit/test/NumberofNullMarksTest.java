package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.Student;
import com.wipro.task.StudentService;

class NumberofNullMarksTest  {

	@Test
	void test() {
		Student[] d=new Student[3];
		d[0]=new Student("Akhil",new int[] {34,56,76});
		d[1]=new Student("Abhi",null);
		d[2]=new Student("Tharun",null);
	
		StudentService service=new StudentService();
		int a=service.findNumberOfNullMarks(d);	
				assertEquals(2, a);
		//fail("Not yet implemented");
	}

}
