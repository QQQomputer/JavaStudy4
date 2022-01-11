package com.gom.s4;

public class Square {

	public static final int SERO=1;
	final int GARO_SIZE;
	
	public Square (){
		this.GARO_SIZE=5;
	}

	
	static {
		Square.sero=3;
	}
	
	
	
	public static void info(){
		System.out.println("Class Method");	
//		System.out.println(this.garo);// error
		System.out.println(Square.sero);
//		this.info2();//error
	}
	
	public void info2() {
		this.garo=6;
		System.out.println("Instance Method");
		System.out.println(this.garo);
		System.out.println(Square.sero);
		Square.info();
	}
	
	
	
	
}
