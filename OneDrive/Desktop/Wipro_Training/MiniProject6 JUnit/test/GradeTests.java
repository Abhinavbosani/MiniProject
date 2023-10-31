package com.mile1.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AgradeTest.class, DgradeTest.class, FgradeTest.class })
public class GradeTests {

}
