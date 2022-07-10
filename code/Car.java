package com.mycompany.mavenproject1;

public class Car extends Vehicle {

	public Car(String honk) {
		super(honk);
	}
	public String honk() {
		return(getHonk());
	}
	public String toString() {
		return(honk() + ".\n");
	}
}
