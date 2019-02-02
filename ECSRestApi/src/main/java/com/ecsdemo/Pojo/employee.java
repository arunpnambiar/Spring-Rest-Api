package com.ecsdemo.Pojo;

public class employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private String experience;
	
	public employee(int employeeId, String employeeName, String department, String experience) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.experience = experience;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
}
