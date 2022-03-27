package com.greatlearning.superdepartment;

public class HrDepartment extends SuperDepartment {
	
	String departmentName()
	{
		
		return "Welcome to HR Department ";
		
	}
	
	String getTodaysWork()
	{
		
		return "Fill today's timesheet and mark your attendance";
		
	}
	
	String getWorkDeadline()
	{
		
		return "Complete by EOD ";
		//super.isTodayHoliday();
	}
	
	String doActivity()
	{
		
		return "team Lunch";
		
	}
	
	public String isTodayHoliday()
	{
		
		return super.isTodayAHoliday();
		
	}

}
