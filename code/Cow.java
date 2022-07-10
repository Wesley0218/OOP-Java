package com.mycompany.mavenproject1;

public class Cow extends Animal {
	
	public Cow(String name) {
		super(name);
}
	public String talk() {
		return(getAnimal()+ " the cow says ina Moo Moo Moo. ");
	}
	public String ringBell() {
		return("RingBell: Ring ring ina mo.");
	}
	public String toString() {
		return(talk() + ringBell() + ".\n");
	}
}
