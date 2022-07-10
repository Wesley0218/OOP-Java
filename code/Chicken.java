package com.mycompany.mavenproject1;

public class Chicken extends Animal {
	
	public Chicken(String name) {
		super(name);
}
	public String talk() {
		return(getAnimal()+ " the chicken says fuck fuck fuck fuckkkk");
	}
	public String toString() {
		return(talk() + ".\n");
	}
}
