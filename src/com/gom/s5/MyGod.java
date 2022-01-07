package com.gom.s5;

public class MyGod {
	
	private static MyGod myGod;
	
	private MyGod() {}
	
	public static MyGod makeGod() {		
		if(myGod==null) {
			myGod= new MyGod();
					}		
		return myGod;
	}
	
}
