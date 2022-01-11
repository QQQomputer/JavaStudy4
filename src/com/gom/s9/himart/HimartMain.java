package com.gom.s9.himart;

import com.gom.s8.rpg.*;

public class HimartMain {

	public static void main(String[] args) {
		Magition magition;
		Magition magition2;
		Knight knight;
		
		
		
		com.gom.s9.himart.Magition magition3;
		//Tv, Computer, Phone 정보 입력
		
		Computer cm = new Computer();
		cm.company="Samsug";
		cm.cpu="i7";
		cm.price=200;
		cm.point=2;
		
		Phone ph = new Phone();
		ph.company="Apple";
		ph.brand="iphone13 mini";
		ph.pixel=100;
		ph.price=150;
		ph.point=5;
		
		Tv tv = new Tv();
		tv.company="LG";
		tv.brand="오브제";
		tv.size=100;
		tv.price=300;
		tv.point=10;
		
		
		Client iu = new Client();
		iu.money=1000;
		iu.point=0;
		iu.buy(tv);
		
		

	}

}
