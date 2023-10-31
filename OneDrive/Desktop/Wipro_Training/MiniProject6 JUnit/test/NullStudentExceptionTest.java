package com.mile1.test;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

//import java.lang.reflect.Executable;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import com.wipro.task.NullNameException;
import com.wipro.task.NullStudentObjectException;
import com.wipro.task.Student;
import com.wipro.task.StudentReport;
import org.junit.jupiter.api.function.Executable;


class NullStudentExceptionTest {

//	@Test
//	void test() {
//		Student student=null;
//		StudentReport sReport=new StudentReport();
////		NullStudentObjectException exception=new NullStudentObjectException();
//		assertThrowsExactly(NullStudentObjectException.class,()->sReport.validate(student));
//		
//		//fail("Not yet implemented");
//	}
	private static final Executable ex=null;
	@Test
	public void testStudentIsNull() {
		assertThrows(NullStudentObjectException.class,new Executable() {
			@Override
			public void execute() throws Throwable{
				StudentReport sReport=new StudentReport();
				Student student=null;
				
				sReport.validate(student);
			}
		});

}
}
