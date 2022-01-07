package com.gom.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
		Knight k1 = new Knight();
		Magition m1 = new Magition();
		int num = 10;
		
		m1.name="간달프";
		m1.hp=100;
		m1.mp=50;
		
		Character c1 =m1;
		System.out.println(c1.name);
		System.out.println(c1.hp);
		//System.out.println(c1.mp);
		
		m1 = (Magition)c1;
		
		System.out.println(m1.name);
		System.out.println(m1.hp);
		System.out.println(m1.mp);
		
//		
//		Character c1= m1;
//		c1 =k1;
//		
//		k1=(Knight)c1;
		
//		k1.attack();
//		k1.move();
//		m1.attack();
		
		
	}
}
