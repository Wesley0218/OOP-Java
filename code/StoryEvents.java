package com.mycompany.mavenproject1;

public class StoryEvents {
		
		//for person and animal
		private String play;
		private String me;
		private Animal solo;
		private Person user;

		//for vehicles honk
		private Vehicle jeep;
		private Vehicle policeCar;
		private Vehicle bus;
		private Vehicle car;
		private String je; //for jeepney
		private String ca; //for car
		private String bu; //for bus
		private String po; // for policeCar
		
		public StoryEvents(Person a) { //for the user or person only
			user = a;
			me = user.talk();
		}
		public StoryEvents(Person a,Animal s) { //the user and 1 animal
			solo = s;
			user = a;
			me = user.talk();
			play= solo.talk();
		}
		public StoryEvents(Vehicle c, Vehicle j,Vehicle b, Vehicle p){ //for the vehicles to honk
			car = c;
			jeep = j;
			bus = b;
			policeCar = p;
			
			ca=car.honk();
			je=jeep.honk();
			bu=bus.honk();
			po=policeCar.honk();
		}
		
		public void begin1() { //run for solo person
			System.out.println(me);
		}
		
		public void begin() { // run for person and animal 
			System.out.println(me);
			System.out.println(play);
		}

		public void begin2(){
			System.out.println("\n"+ca);
			System.out.println(je);
			System.out.println(bu);
			System.out.println(po);
		}
	}


