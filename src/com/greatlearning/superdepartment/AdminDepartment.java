package com.greatlearning.superdepartment;

public class AdminDepartment extends SuperDepartment {
	
	String departmentName()
	{
		
		return "Welcome to Admin Department ";
		
	}
	
	String getTodaysWork()
	{
		
		return "Complete your documents submission";
		
	}
	
	String getWorkDeadline()
	{
		
		return "Complete by EOD ";
		//super.isTodayHoliday();
	}
	
	public String isTodayHoliday()
	{
		
		return super.isTodayAHoliday();
		
	}
	
}
