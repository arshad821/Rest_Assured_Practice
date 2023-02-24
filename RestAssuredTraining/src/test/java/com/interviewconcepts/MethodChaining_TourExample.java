package com.interviewconcepts;

public class MethodChaining_TourExample {
	
	String place;
	String modeoftransport;

	public String getPlace() {
		return place;
	}


	public MethodChaining_TourExample setPlace(String place) {
		this.place = place;
		return this;
	}


	public String getModeoftransport() {
		return modeoftransport;
	}


	public MethodChaining_TourExample setModeoftransport(String modeoftransport) {
		this.modeoftransport = modeoftransport;
		return this;
	}
	
	public void Whereareyougoing() {
		
		System.out.println(getPlace());
		System.out.println("O!Jolly ah " + getModeoftransport() + " la u are going to " + getPlace()+ " ahhh!");
	}
	
	
	public static void main(String[] args) {
		
		MethodChaining_TourExample chaining_TourExample = new MethodChaining_TourExample();
		chaining_TourExample.setModeoftransport("Car");
		chaining_TourExample.setPlace("Ooty");
		chaining_TourExample.Whereareyougoing();
		
		chaining_TourExample.setModeoftransport("Bike").setPlace("Ladaakh").Whereareyougoing();
	}



}
