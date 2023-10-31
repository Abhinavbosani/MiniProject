package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.wipro.task.NullMarksArrayException;
import com.wipro.task.NullNameException;
import com.wipro.task.NullStudentObjectException;
import com.wipro.task.Student;
import com.wipro.task.StudentReport;

class NullMarksArrayExceptionTest {

	private static final Executable ex=null;
	@Test
	public void testMarksArrayIsNull() {
		assertThrows(NullMarksArrayException.class,new Executable() {
			@Override
			public void execute() throws Throwable{
				StudentReport sReport=new StudentReport();
				Student student=new Student();
				student=new Student("Abhinav",null);
				sReport.validate(student);
			}
		});

}

}
