package com.yedam.collection.emp;

import java.text.SimpleDateFormat;
import java.util.Date;

// empNo, empName, hireDate, salary
public class Employee {
	private int empNo;
	private String empName;
	private Date hireDate;
	private int salary;

	public Employee(int empNo, String empName, Date hireDate, int salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일");
		return "사원번호: " + empNo + " 이름: " + empName + " 입사일자: " + sdf.format(hireDate) + " 급여 : " + salary + "만원";
	}

	public Date getHireDate() {
		return hireDate;
	}
}
