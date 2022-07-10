package com.mycompany.mavenproject1;

abstract class Vehicle {
	String honk;
	
	public Vehicle(String h) {
		honk = h;
}
public String getHonk(){
	return(honk);
	}
	abstract String honk();
	
}
