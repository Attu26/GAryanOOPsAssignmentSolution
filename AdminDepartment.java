package com.gl.depatmentservice;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment()
	{
		
	}
	@Override
	
	public String departmentName()
	{
		return "Super Department";
	}
	@Override
public String gettodaysWork()
{
	return "No Work as of Now";
}
	@Override	
public String getWorkDeadline()
{
return "Nil";
}
@Override	

public String IsTodayAHoliday()
{
return "Today is not a hoiliday";
}


}
