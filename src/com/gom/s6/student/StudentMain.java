package com.gom.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		
		//StudentDTO studentDTO = new StudentDTO();
		StudentDTOSecond ss = new StudentDTOSecond();
		StudentDTOThird st = new StudentDTOThird();
		ss.kor=10;
		ss.eng=30;
		ss.math=20;
		ss.history=30;
		ss.setTotal();
		st.kor=10;
		st.eng=30;
		st.math=20;
		st.physics=40;
		st.setTotal();
	}
	
	
}
