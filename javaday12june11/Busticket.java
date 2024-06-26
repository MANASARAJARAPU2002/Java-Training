package com.hcltech.javaday12june11;

public class Busticket extends Ticket implements Comparable
{
	public void bookticket() {
		System.out.println("Book bus ticket");
	}
	

	@Override
	public int compareTo(Object o) {
//comapre the objects
		
		if(o instanceof Busticket) {
			Busticket b1=(Busticket) o;
			if(this.Ticket_id.equals( b1.getTicket_id())  && this.mode==b1.mode) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		return 0;
	}
	

}
