package com.gl.depatmentservice;

public class HRDepartment extends SuperDepartment {
	
	@Override
	
	public String departmentName()
	{
		return "HRDepartment";
	}
	@Override
public String gettodaysWork()
{
	return "Fill today’s worksheet and mark your attendan";
}
	@Override	
public String getWorkDeadline()
{
return "Complete by EOD";
}
@Override	

public String IsTodayAHoliday()
{
return "team Lunch";
}

}
	





