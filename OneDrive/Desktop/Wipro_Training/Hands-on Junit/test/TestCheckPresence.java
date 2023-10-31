package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestCheckPresence {
	DailyTasks dailyTasks=new DailyTasks();
	boolean a=dailyTasks.checkPresence("Abhinav","v");

	@Test
	void test1() {
//		DailyTasks dailyTasks=new DailyTasks();
//		boolean a=dailyTasks.checkPresence("Abhinav","v");
		assertTrue(a);

	}
	@Test
	void test2() {
		assertFalse(a);
	}

}
