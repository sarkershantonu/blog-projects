package com.Target;

public enum Week {
SATRUDAY("Saturday"),SUNDAY("Sunday"),MONDAY("Monday"),
TUESDAY("Tuesday"),WEDNESDAY("Wednesdayday"),THURSDAY("Thursday"),FRIDAY("Fridayday");
	private final String day;	
	Week(String day){
		this.day = day;
	}
	public String getDay(){
		return day;
	}
}
