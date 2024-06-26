package com.hcltech.javaday7june4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ticket{
	void Showdisplay()
	{
	 int Ticket_id;
	 boolean Ticket_Status;	 
	 
	}
	
}

class Bus_Ticket extends Ticket{
	void BusTicketStatus()
	{

	 String Bus_No;
	 int Bus_Service;
}
}

class Train_Ticket extends Ticket{
	void TrainTicketStatus()
	{
	
	 int Train_PNRNo;
	 boolean Quota;
}
}


public class Ticket_Demo {

	public static void main(String[] args) {
	BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
	Ticket t1 = new Bus_Ticket();
	t1.Showdisplay();



	}

}
