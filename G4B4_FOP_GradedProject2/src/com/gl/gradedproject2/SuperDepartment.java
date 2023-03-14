package com.gl.gradedproject2;

public class SuperDepartment {
	private String deptName;
	private String todaysWork;
	private String workDeadLine;
	public SuperDepartment() {
		this.deptName = null;
	}
	public SuperDepartment(String deptName) {
		this.deptName = deptName;
	}
	public String departmentName() {
		return deptName;
	}
	public String getTodaysWork() {
		todaysWork = "No work as of Now";
		return(todaysWork);
	}
	public String getWorkDeadline() {
		workDeadLine = "Nil";
		return(workDeadLine);
	}
	public String isTodayAHoliday() {
		return("Today is not a Holiday");
	}


}
