package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestSuite {
	@Test
	void test1() {
		DailyTasks dailyTasks=new DailyTasks();
		String string=dailyTasks.doStringConcat("Abhi","nav");
		assertEquals("Abhinav", string);
		
	}
	@Test
	void test2() {
		DailyTasks dailyTasks=new DailyTasks();
		int[] arr=dailyTasks.sortValues(new int[] {1,3,2,6});
       	assertArrayEquals(new int[] {1,2,3,6},arr);
		
	}
	@Test
	void test3() {
		DailyTasks dailyTasks=new DailyTasks();
		boolean a=dailyTasks.checkPresence("Abhinav","v");
		assertTrue(a);
		
	}

}
