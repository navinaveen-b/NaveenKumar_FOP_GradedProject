package com.gl.gradedproject2;

public class HrDepartment extends SuperDepartment{
	private String todaysWork;
	private String workDeadLine;
	public HrDepartment() {
		super();
	}
	public HrDepartment(String deptName) {
		super(deptName);
	}
	public String getTodaysWork() {
		todaysWork = "Fill today's timesheet and mark your attendance";
		return(todaysWork);
	}
	public String getWorkDeadline() {
		workDeadLine = "Complete by EOD";
		return(workDeadLine);
	}
	public String doActivity() {
		return("team Lunch");
	}

}
