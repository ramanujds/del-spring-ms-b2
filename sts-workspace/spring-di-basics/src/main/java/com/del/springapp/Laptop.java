package com.del.springapp;

public class Laptop {

	private InternetConnection connection;
	
	public Laptop() {
		System.out.println("Laptop Object Created..");
	}
	
	public void setConnection(InternetConnection connection) {
		this.connection = connection;
	}

	public void joinMeeting() {
		connection.connect();
		System.out.println("Meeting Joined");
	}
	
}
