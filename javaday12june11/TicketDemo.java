package com.hcltech.javaday12june11;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TicketDemo {

	public static void main(String[] args, ModeofTravel ModeofTravel) {
		//create queue
		 Queue T1 = new PriorityQueue();
		 //create bus ticket
		Ticket B1=new Busticket();
		Ticket B3 =new Busticket();
		B1.bookticket();
		B3.bookticket();
		Ticket b2 = new Trainticket();
		Ticket b4 = new Trainticket();
		b2.bookticket();
		b4.bookticket();
		B1.setTicket_id("1Ec");
		b2.setTicket_id("13ed");
		B3.setTicket_id("67td");
		b4.setTicket_id("89if");
	   
		
		//add objects to the collections 
		T1.add(B1);
		T1.add(b2);
		T1.add(B3);
		T1.add(b4);
		
		Iterator itr =T1.iterator();
		while(itr.hasNext())
		{
			Ticket t1 = (Ticket)itr.next();
			System.out.println(t1);
		}
		System.out.println(T1);

	}

}
