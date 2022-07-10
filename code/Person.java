package com.mycompany.mavenproject1;

abstract class Person  {
String names;
	public Person(String name) {
		names = name;
		
}
	public String getUser(){ 
	return(names);
	}
	abstract String talk();
}