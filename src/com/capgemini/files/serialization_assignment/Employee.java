package com.capgemini.files.serialization_assignment;

import java.io.Serializable;

public class Employee implements Serializable {

	private int employeeId;
	private String employeename;
	private long employeesalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeename, long employeesalary) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public long getEmployeesalary() {
		return employeesalary;
	}

	public void setEmployeesalary(long employeesalary) {
		this.employeesalary = employeesalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeename == null) ? 0 : employeename.hashCode());
		result = prime * result + (int) (employeesalary ^ (employeesalary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeename == null) {
			if (other.employeename != null)
				return false;
		} else if (!employeename.equals(other.employeename))
			return false;
		if (employeesalary != other.employeesalary)
			return false;
		return true;
	}

}