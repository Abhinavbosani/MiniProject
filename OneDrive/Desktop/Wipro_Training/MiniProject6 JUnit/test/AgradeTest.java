package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.Student;
import com.wipro.task.StudentReport;

class AgradeTest {

	@Test
	void test1() {
		Student student1=new Student("Abhi",new int[] {85,76,98});
		StudentReport sReport=new StudentReport();
		
		String aString=sReport.findGrades(student1);
		assertEquals("A", aString);
		
		//fail("Not yet implemented");
	}
	

}
