package org.practice.Annotations;

@Info(priority = Info.Importancy.CRITICAL, values = {"this is Class", "Importan class "} )
public class InfoUser {
	@Info(priority = Info.Importancy.LOW, values = {"this is Private field", "Field value "} )
	private String fname;
	@Info(priority = Info.Importancy.LOW, values = {"this is Private field", "Field value "} )
	private String lname;
	
	@Info(priority = Info.Importancy.CRITICAL, values = {"this is Default Constructor", "Method value "} )
	public InfoUser() {
	}

	@Info(priority = Info.Importancy.HIGH, values = {"this is parametrized Constructor", "Method value "} )
	public InfoUser(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	@Info(priority = Info.Importancy.MEDIUM, values = {"this is public method", "Method value "} )
	public String getFname() {
		return fname;
	}
	@Info(priority = Info.Importancy.HIGH, values = {"this is public method", "Method value "} )
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Info(priority = Info.Importancy.MEDIUM, values = {"this is public method", "Method value "} )
	public String getLname() {
		return lname;
	}
	@Info(priority = Info.Importancy.HIGH, values = {"this is public method", "Method value "} )
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Info(priority = Info.Importancy.CRITICAL, values = {"this is Very necesssary method", "Method value "} )
	public String getFullName() {
		return fname + " " + lname;

	}

}
