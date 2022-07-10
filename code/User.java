package com.mycompany.mavenproject1;


public class User extends Person {
		
	public User(String name) {
		super(name);
	}
	public String talk() {
		return("\n"+getUser() + " let's go for a walk.");
	}

}
