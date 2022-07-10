package com.mycompany.mavenproject1;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
}
	public String talk() {
		return(getAnimal()+ " the dog says Aw Aw Aw yametee");
	}
	public String toString() {
		return(talk() + ".\n");
	}
	}
