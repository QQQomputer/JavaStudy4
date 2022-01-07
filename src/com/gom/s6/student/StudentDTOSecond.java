package com.gom.s6.student;

public class StudentDTOSecond extends StudentDTO {

	
//	public StudentDTOSecond() {
//		super("iu");
//	}
	
	int history;
	
	public void setTotal() {		
		
		this.total= this.kor+ this.eng+this.math+this.history;
		System.out.println(this.total);
	}	
}
