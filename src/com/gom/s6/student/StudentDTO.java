package com.gom.s6.student;

public abstract class StudentDTO {
	//data	transfer object
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	
	
	public abstract void setTotal();
}