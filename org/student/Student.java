package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name is Shobha");
		
	}
	public void studentDept() {
		System.out.println("My dept is E & C");
		
	}
	public void studentId() {
		System.out.println("student id is 2SA0034");
	}

	public static void main(String[] args) {
	
		Student Call = new Student();
		Call.collegeCode();
		Call.collegeName();
		Call.collegeRank();
		Call.deptName();
		Call.studentDept();
		Call.studentName();
		Call.studentId();
	}
	

}
