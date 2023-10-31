package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.Student;
import com.wipro.task.StudentReport;

class FgradeTest {

	@Test
	void test() {
		Student student=new Student("Abhi",new int[] {33,38,40});
		StudentReport sReport=new StudentReport();
		
		String aString=sReport.findGrades(student);
		assertEquals("F", aString);
		
		//fail("Not yet implemented");
	}

}
