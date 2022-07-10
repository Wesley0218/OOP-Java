package com.mycompany.mavenproject1;

public class PoliceCar extends Vehicle {
	public PoliceCar(String honk) {
		super(honk);
	}
	public String honk() {
		return(getHonk());
	}
	public String toString() {
		return(honk() + ".\n");
	}
}
