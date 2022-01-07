package com.gom.s6.student;

public class StudentDTOThird extends StudentDTO{

	int physics;

	@Override//annotation(설명+행동)
	public int setTotal(){
		this.total= this.kor+ this.eng+this.math+this.physics;
		System.out.println(this.total);
		return this.total;
	}		
}
