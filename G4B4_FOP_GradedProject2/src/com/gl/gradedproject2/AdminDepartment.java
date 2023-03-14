package com.gl.gradedproject2;

public class AdminDepartment extends SuperDepartment{
	private String todaysWork;
	private String workDeadLine;
	public AdminDepartment() {
		//this.deptName = null;
		super();
	}
	public AdminDepartment(String deptName) {
		super(deptName);
	}
	
	public String getTodaysWork() {
		todaysWork = "Complete your documents Submission";
		return(todaysWork);
	}
	public String getWorkDeadline() {
		workDeadLine = "Complete by EOD";
		return(workDeadLine);
	}

}
