package com.mile1.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ NullMarksArrayExceptionTest.class, NullNameExceptionTest.class, NullStudentExceptionTest.class })
public class ExceptionTests {

}
