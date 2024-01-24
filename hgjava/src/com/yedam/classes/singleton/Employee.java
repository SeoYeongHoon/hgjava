package com.yedam.classes.singleton;

public class Employee {
	private int empId; // 사원번호
	private String empName; // 사원이름
	private int deptId; // 부서번호(10: 인사, 20: 개발, 30: 영업, 영업이 기본적인 부서)
	private String deptName; // 부서이름
	private int empSal; // 급여

	// 생성자(필드값 초기화)
	public Employee(int empId, String empName, int empSal, int deptId) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.deptId = deptId;

		if (deptId == 10) {
			deptName = "인사";
		} else if (deptId == 20) {
			deptName = "개발";
		} else {
			deptName = "영업";
		}
	}

	public Employee(int empId, String empName, int empSal) {
		this(empId, empName, empSal, 30);
		// 기본 생성자 호출
	}

	// Getter Setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public void showInfo() {
		System.out.println(empId + " " + empName + " " + empSal);
	}
}
