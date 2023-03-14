package com.gl.gradedproject2;

import com.gl.gradedproject2.AdminDepartment;
import com.gl.gradedproject2.HrDepartment;
import com.gl.gradedproject2.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment adminDept = new AdminDepartment("Admin Departemnt");
		HrDepartment hrDept = new HrDepartment("Hr Department");
		TechDepartment techDept = new TechDepartment("Tech Department");
		//Prints Admin Department Information 
		System.out.println("Welcome to " + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		//Prints HR Department Information
		System.out.println("Welcome to " + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		//Prints Tech Department Information
		System.out.println("Welcome to " + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(adminDept.isTodayAHoliday());
	}

}


