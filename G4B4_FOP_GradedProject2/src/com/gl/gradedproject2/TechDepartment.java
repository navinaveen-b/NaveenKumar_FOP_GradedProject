package com.gl.gradedproject2;

public class TechDepartment extends SuperDepartment{
	private String todaysWork;
	private String workDeadLine;
	public TechDepartment() {
		super();
	}
	public TechDepartment(String deptName) {
		super(deptName);
	}
	public String getTodaysWork() {
		todaysWork = "Complete coding of module 1";
		return(todaysWork);
	}
	public String getWorkDeadline() {
		workDeadLine = "Complete by EOD";
		return(workDeadLine);
	}
	public String getTechStackInformation() {
		return("core java");
	}

}
