package com.gom.s8.rpg;

public class Magition extends Character implements Act {

	//마법사 is a 캐릭터 => 상속
	//마법사 has a 캐릭터 => 멤버변수 선언
	int mp;
	
	private void spel() {
		System.out.println("마법공격");
	}

//	@Override
//	public void attack() {
//		this.spel();
//		
//	}
//
//	@Override
//	public void move() {
//		System.out.println("걸어다니기");
//		
//	}
	
	
	
}
