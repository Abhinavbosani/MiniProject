package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.Student;
import com.wipro.task.StudentReport;

class DgradeTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
			Student student=new Student("Abhi",new int[] {36,38,40});
			StudentReport sReport=new StudentReport();
			
			String aString=sReport.findGrades(student);
			assertEquals("D", aString);
			
		
	}

}
