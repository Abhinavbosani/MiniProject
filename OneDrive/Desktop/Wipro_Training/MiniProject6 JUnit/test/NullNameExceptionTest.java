package com.mile1.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.wipro.task.NullMarksArrayException;
import com.wipro.task.NullNameException;
import com.wipro.task.NullStudentObjectException;
import com.wipro.task.Student;
import com.wipro.task.StudentReport;

class NullNameExceptionTest {

	private static final Executable ex=null;
	@Test
	public void testStudentIsNull() {
		assertThrows(NullNameException.class,new Executable() {
			@Override
			public void execute() throws Throwable{
				StudentReport sReport=new StudentReport();
				Student student=new Student();
				student=new Student(null,new int[] {34,45,67});
				
				sReport.validate(student);
			}
		});

}
}
