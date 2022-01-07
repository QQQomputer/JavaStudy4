package com.gom.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		
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
		iu.buy(ph);
		
		

	}

}
