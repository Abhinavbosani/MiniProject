package com.mile1.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({  NumberofNullMarksTest.class, NumberofNullNameTest.class,
		NumberofNullObjectsTest.class })
public class NumberTests {

}
