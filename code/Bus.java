package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Bus extends Vehicle {
	static int interval;
	static Timer timer;
	private static final int setInterval() {
		if (interval == 1)
			timer.cancel();
		return --interval;
	}
	public Bus(String honk) {
		super(honk);
	}
	public String honk() {
		return(getHonk());
	}
	public String toString() {
		return(honk() + ".\n");
	}
	public void Capacity(int user) {
		Scanner scan = new Scanner(System.in);
		int cap = 5;
		int sum = cap + user;
		System.out.println("No. of Passenger of Bus: " +cap);
		System.out.print("Press Enter:");
		String click = scan.nextLine();
		if (click == ""){
			System.out.println("You are now inside the Bus:");
		}
		else {
			System.out.println("You are now inside the Bus:");
		}

		System.out.println("No. of Passenger of Bus: "+sum);
		System.out.println("Press Enter:");
		String ans = scan.nextLine();
		while(!ans.equalsIgnoreCase("Yes")) {
		System.out.println("You are now near at your home. Do you want to go out? Yes / No:");
		String secs = "3";
	    int delay = 1000;
	    int period = 1000;
	    timer = new Timer();
	    interval = Integer.parseInt(secs);
	    System.out.println(secs);
	    timer.scheduleAtFixedRate(new TimerTask() {

	        public void run() {
	            System.out.println(setInterval());

	        }
	    }, delay, period);
	    
	    ans = scan.nextLine();
		}
		int end = sum - user;
		System.out.println("No. of Passenger of bus: "+end);
		System.out.println("You are now at home.");
	}
	}


