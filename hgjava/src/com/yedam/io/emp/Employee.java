package com.yedam.io.emp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Serializable {
	private int empNo;
	private String empName;
	private String email;
	private Date hireDate;
	private int salary;

	public Employee(int empNo, String empName, String email, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		return "사원번호: " + empNo + ", 이름: " + empName + ", 이메일: " + 
				email + ", 입사일자: " + sdf.format(hireDate) + ", 급여: " + salary;
	}
}
