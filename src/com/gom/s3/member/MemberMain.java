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
		member.setName("asd");
		member.setEmail("qweasd@gmail.com");
		member.setKg(45.5);	
		member.setCm(179.5);
		member.setAge(40);

		String a = member.getName();
		System.out.println(a);
		a = member.getEmail();
		System.out.println(a);
		double b = member.getKg();
		System.out.println(b);
		b = member.getCm();
		System.out.println(b);
		int c = member.getAge();		
		System.out.println(c);
		
		
		
		
		//member.info();
		
		
		
		
		

	}

}
