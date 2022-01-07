package com.gom.s5;

public class MyGodMain {

	public static void main(String[] args) {

		MyGod myGod = new MyGod; // 어떻게해야 불러올수있을까
		//SingleTone // Classmethod 가 힌트 = 객체를 생성하지 않고 사용 가능
		
		mygod이라는 객체가 딱 한개만 나올 수 있어야하고
		하나 만들어지면 더이상 하나더 안만들어져야함
		
		class는 선언은 가능함
		마이갓 객체에 담아서 어디서 프린트를 하든 주소는 같아야함 그럼 싱글톤이 만들어진다.
	}

}
