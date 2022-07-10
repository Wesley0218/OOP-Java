package com.mycompany.mavenproject1;

abstract class Animal {
String names;
	
	public Animal(String name) {
		names = name;
}
	public String getAnimal(){
		return(names);
		}
	
	abstract String talk();
	}
