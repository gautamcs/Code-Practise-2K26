package com.gautam.main;

import java.util.Date;

public class ImmutableOfDate {
	public static void main(String[] args) {
		
		DateImmutableExample ex = new DateImmutableExample("Date of Joining", new Date());
		System.out.println(" Original Data: "+ex);	
		// Need to Update the date data 
		System.out.println(" Updated Data: "+ex);
		
		
	}
}

final class DateImmutableExample {
	private final String event;
	private final Date date; 
	
	public DateImmutableExample (String event, Date date) {
		this.event = event; 
		this.date = date; 
	}
	
	public String getEvent() {
		return event;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String toString() {
		return "[event = "+event+" , Date = "+date+"]";
	}
}
