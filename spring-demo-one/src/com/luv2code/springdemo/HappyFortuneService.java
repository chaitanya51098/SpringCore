package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortune= {"Today is your lucky day !","Good Morning !","Have a great day !"};
		Random random=new Random();
		int randomNumber=random.nextInt(fortune.length);
		return fortune[randomNumber];
	}

}
