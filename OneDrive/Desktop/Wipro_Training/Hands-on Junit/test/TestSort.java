package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSort {

	@Test
	void test() {
		
		DailyTasks dailyTasks=new DailyTasks();
		int[] arr=dailyTasks.sortValues(new int[] {1,3,2,6});
       	assertArrayEquals(new int[] {1,2,3,6},arr);
	}

}
