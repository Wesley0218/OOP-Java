package com.mycompany.mavenproject1;

public class Jeepney extends Vehicle {
	public Jeepney(String honk) {
		super(honk);
	}
	public String honk() {
		return(getHonk());
	}
	public String toString() {
		return(honk() + ".\n");
	}
}
