package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Story {
	static int interval;
	static Timer timer;
	private static final int setInterval() {
		if (interval == 1)
			timer.cancel();
		return --interval;
	}

	public static Person assign() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a name for the person: ");
		String name = scan.next();
		return(new User(name));
	}

	public static Animal assign2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select a Animal");
		System.out.println("A = Dog");
		System.out.println("B = Chicken");
		System.out.println("C = Cow");
		String ans = scan.next();
		
		if (ans.equalsIgnoreCase("A")) {
			System.out.print("Enter the name of the Dog: ");
			String dogName = scan.next();
			return(new Dog(dogName));
		}
		else if(ans.equalsIgnoreCase("B")){
			System.out.print("Enter the name of the Chicken: ");
			String chickenName = scan.next();
			return(new Chicken(chickenName));
		}
		else { 
			System.out.print("Enter the name of the Cow: ");
			String cowName = scan.next();
			return(new Cow(cowName));
		}

	}
	public static Vehicle assign3(){	
		String car = "Car: p*tang inaaaa.";
		for (int a=1;a==1;a++);
		return (new Car(car));
				
	}
	public static Vehicle assign4(){	
		String jeep = "Jeepney: p*tang inaaaa.";
		for (int a=1;a==1;a++);
		return (new Jeepney(jeep));
				
	}
	public static Vehicle assign5(){	
		String bus = "Bus: p*tang inaaaa.";
		for (int a=1;a==1;a++);
		return (new Bus(bus));
				
	}
	public static Vehicle assign6(){	
		String policeCar = "Police Car: weeeeeeee weeeeeeee.";
		for (int a=1;a==1;a++);
		return (new PoliceCar(policeCar));
				
	}
	public static void main(String[] args) {
		TrafficEnforcer t = new TrafficEnforcer();
		TrafficLight l = new TrafficLight();
		StoryEvents play,play1;
		Scanner scan = new Scanner(System.in);
		Person run;
		Animal run1,run2,run3;
		Vehicle car,jeep,bus,policeCar;
		run = assign();
		run1 = assign2();
		run2 = assign2();
		run3 = assign2();
		car = assign3();
		jeep = assign4();
		bus = assign5();
		policeCar = assign6();
		System.out.println("\n" +run1 + "" + run2 + "" + run3+ "\n");
		System.out.println("Choose a animal that you want take out for a Public Walk.");
		System.out.println("A = Go out Alone.");
		System.out.println("B = Dog.");
		System.out.println("C = Chicken.");
		System.out.println("D = Cow.");
		String ans = scan.next();
		
			if(ans.equalsIgnoreCase("b")) {
				play = new StoryEvents(run,run1);
				play.begin(); //play the person and animal
		
			}
			else if(ans.equalsIgnoreCase("c")) {
				play = new StoryEvents(run,run2);
				play.begin(); //play the person and animal
		
			}
			else if(ans.equalsIgnoreCase("d")) {
				play = new StoryEvents(run,run3);
				play.begin(); //play the person and animal

			}
			else{
				play = new StoryEvents(run);
				play.begin1();
			}
			t.talk();
			l.signal();
			play1 = new StoryEvents(car,jeep,bus,policeCar);
			play1.begin2();
			System.out.print("Type ''green'' to cross the pedestrian: ");
			String answer = scan.nextLine();
			while (!answer.equalsIgnoreCase("green")) {
				
				if (answer == "") {

				}
				else {
					t.talk();
					l.signal();
					play1 = new StoryEvents(car,jeep,bus,policeCar);
					play1.begin2();
				}
				System.out.print("\nType ''green'' to cross the pedestrian: ");
				answer = scan.nextLine();
			}
			t.talk1();
			l.signal1();
			
			System.out.println("Do you want to continue your walk: Yes / No ");
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
		    String get = scan.nextLine();
		    while (!get.equalsIgnoreCase("no")) {
		    if (get == "") {
		    	}
		    else {
		    }
		    secs = "3";
		    delay = 1000;
		    period = 1000;
		    timer = new Timer();
		    interval = Integer.parseInt(secs);
		    System.out.println(secs);
		    timer.scheduleAtFixedRate(new TimerTask() {

		        public void run() {
		            System.out.println(setInterval());

		        }
		    }, delay, period);
		    System.out.println("Do you want to continue your walk: Yes / No ");
		    get = scan.nextLine();
		    }
		    System.out.println("Do you want to take a bus to go home: Yes / No");
		    String home = scan.nextLine();
		    while(!home.equalsIgnoreCase("Yes")) {
		    	if(ans.equalsIgnoreCase("b")) {
					play = new StoryEvents(run,run1);
					play.begin(); //play the person and animal
			
				}
				else if(ans.equalsIgnoreCase("c")) {
					play = new StoryEvents(run,run2);
					play.begin(); //play the person and animal
			
				}
				else if(ans.equalsIgnoreCase("d")) {
					play = new StoryEvents(run,run3);
					play.begin(); //play the person and animal

				}
				else{
					play = new StoryEvents(run);
					play.begin1();
					}
		    	System.out.println("You are now at home.");
		    	home = scan.nextLine();
		    }
		    
		    if(ans.equalsIgnoreCase("b")) {
		    	Bus cap = new Bus(null);
		    	cap.Capacity(2);
		    	
			}
			else if(ans.equalsIgnoreCase("c")) {
				Bus cap = new Bus(null);
				cap.Capacity(2);
		
			}
			else if(ans.equalsIgnoreCase("d")) {
				Bus cap = new Bus(null);
				cap.Capacity(2);

			}
			else{
				Bus cap = new Bus(null);
				cap.Capacity(1);
		    }
	}
	}
		
			
			
		
	
