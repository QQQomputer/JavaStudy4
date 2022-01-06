package com.gom.s3.member;

public class Member {

	private String name;
	private String email;
	private double kg;
	private double cm;
	private int age;
	
	public void setAge(int age) {
		this.age=20;
		if(age>0 && age<200) {
			this.age = age;			
		}		
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
	
}
