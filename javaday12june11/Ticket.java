package com.hcltech.javaday12june11;
public  abstract class Ticket{
	String Ticket_id;
	//create different types of methods so create enum for this one
	ModeofTravel mode;
	
	/**
	 * 
	 */
	public Ticket() {
		super();
	}

	/**
	 * @param ticket_id
	 * @param mode
	 */
	public Ticket(String ticket_id, ModeofTravel mode) {
		super();
		Ticket_id = ticket_id;
		this.mode = mode;
	}

	public String getTicket_id() {
		return Ticket_id;
	}

	public void setTicket_id(String ticket_id) {
		Ticket_id = ticket_id;
	}

	public ModeofTravel  getMode() {
		return mode;
	}

	public void setMode(ModeofTravel  s) {
		this.mode =s;
	}

	//write a method for booking ticket
	public abstract void bookticket();

}


