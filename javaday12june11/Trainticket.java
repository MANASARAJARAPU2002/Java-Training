package com.hcltech.javaday12june11;

public class Trainticket extends Ticket implements Comparable {
	public void bookticket() {
	
System.out.println("Booking train the ticket");

	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Trainticket) {
			Trainticket b4=(Trainticket) o;
			if(this.Ticket_id.equals( b4.getTicket_id())  &&   this.mode==b4.mode) {
				return 1;
			}
			else {
				return 0;
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
