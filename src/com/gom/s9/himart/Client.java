package com.gom.s9.himart;

public class Client {

	int money;
	int point;
	//메소드명이 같은데 매개변수가 틀려
	
	
	
	
	public void buy(Product p) {
		this.money = this.money-p.price;
		this.point = this.point + p.point;
		System.out.println("최종금액 : "+this.money);
		System.out.println("최종 포인트 : "+this.point);
	}
//	public void buy(Computer p) {
//		this.money = this.money-p.price;
//		this.point = this.point + p.point;
//		System.out.println("최종금액 : "+this.money);
//		System.out.println("최종 포인트 : "+this.point);
//	}
//	public void buy(Phone p) {
//		this.money = this.money-p.price;
//		this.point = this.point + p.point;
//		System.out.println("최종금액 : "+this.money);
//		System.out.println("최종 포인트 : "+this.point);
//	}
	//어떻게하면 변수 하나를 선언해서 금액과 포인트를 받아 올 수 있을까
	
}
