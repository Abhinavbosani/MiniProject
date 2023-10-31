package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestStringConcat {
	

	@Test
	void test() {
		DailyTasks dailyTasks=new DailyTasks();
		String string=dailyTasks.doStringConcat("Abhi","nav");
		assertEquals("Abhinav", string);

	}
	
}
