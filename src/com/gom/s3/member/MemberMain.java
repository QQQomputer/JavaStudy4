package com.gom.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member();
		
//		member.name="iu";
//		member.email="iu@gmail.com";
//		member.kg=96.3;
//		member.cm=179.3;//0 이상 4 이하
//		member.age=40;//0살이상 200
		
//		if(age>0 &&age<200) {
//			member.age=age;
//		}
		
		
		
		member.setAge(40);
		
		System.out.println(member.getAge());
		
		
		
		
		member.info();
		
		
		
		
		

	}

}
