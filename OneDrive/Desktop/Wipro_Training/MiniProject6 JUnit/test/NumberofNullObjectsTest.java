package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.Student;
import com.wipro.task.StudentService;

class NumberofNullObjectsTest {

	@Test
	void test() {
		Student[] d=new Student[3];
		d[0]=null;
		d[1]=new Student(null,new int[] {34,56,78});
		d[2]=new Student(null,new int[] {34,65,78});
	
		StudentService service=new StudentService();
		int a=service.findNumberOfNullObjects(d);
		assertEquals(1, a);
		//fail("Not yet implemented");
	}

}
