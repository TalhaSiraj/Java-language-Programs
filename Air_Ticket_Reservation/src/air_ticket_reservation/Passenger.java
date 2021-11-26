package air_ticket_reservation;

import java.util.Random;

public class Passenger {
	Random random = new Random(10000000);
	
	
	
	protected String [] Customer_Name = new String[8];
	protected String [] Customer_Email = new String[8];
	protected String [] Customer_contact = new String[8];
	protected static int [] Customer_ID= new int[8];
	protected int [] ticket_number = new int[8];
	protected int Customer_Member = 0;
	public static int loop_value = 0;
	
	
	
	//Input customer info 
	public final void put_info_Customer(int loop_start,String [] Customer_Name,String [] Customer_Email, int loop_end,String [] Customer_contact)
	{  //I use loop value to get info mention after this method in passenger class.
	int a;
	
	for( a = loop_start ; a<loop_end; a++)
	 {
		 loop_value = loop_end;		 
	
	 this.Customer_Name[a] =Customer_Name[a];
	 this.Customer_Email[a] =Customer_Email[a];
	 this.Customer_contact [a]=Customer_contact [a];
	 	if(a == 0)
		{Customer_ID [a] =50*random.nextInt(15);}
		if(a == 1)
		{Customer_ID [a] =1+Customer_ID [0];}
		if(a == 2)
		{Customer_ID [a] =1+Customer_ID [1];}
		if(a == 3)
		{Customer_ID [a] =1+Customer_ID [2];}
		if(a == 4)
		{Customer_ID [a] =1+Customer_ID [3];}
		if(a == 5)
		{Customer_ID [a] =1+Customer_ID [4];}
		if(a == 6)
		{Customer_ID [a] =1+Customer_ID [5];}
        if(a == 7)
		{Customer_ID [a] =1+Customer_ID [6];}
        if(a == 8)
		{Customer_ID [a] =1+Customer_ID [7];}
	 
        if(a == 0)
		{ticket_number[a] =(a+25)+420*random.nextInt(25);}
		if(a == 1)
		{ticket_number[a] =1+ticket_number[0];}
		if(a == 2)
		{ticket_number[a] =1+ticket_number[1];}
		if(a == 3)
		{ticket_number[a] =1+ticket_number[2];}
		if(a == 4)
		{ticket_number[a] =1+ticket_number[3];}
		if(a == 5)
		{ticket_number[a] =1+ticket_number[4];}
        if(a == 6)
		{ticket_number[a] =1+ticket_number[5];}
        if(a == 7)
		{ticket_number[a] =1+ticket_number[6];}
        if(a == 8)
		{ticket_number[a] =1+ticket_number[7];} 
	 } 

	}
	
	
	//Required Methods For getting info.
	public static final int get_array_number(int customer_ID2)
	{for(int a = 0 ; a<loop_value;a++)
	{if(Customer_ID[a] == customer_ID2)
	{return a;}
	}
	return 0;
	}
	
	public void get_customer_id()
	{
		for(int a = 0 ; a<loop_value;a++)
		{
			System.out.println(Customer_ID[a]);
		}
		
		
	}
	
	public final String get_Customer_Name (int customer_ID2)
	{for(int a = 0 ; a<loop_value;a++)
		{if(Customer_ID[a] == customer_ID2)
			{return Customer_Name[a];}
		}return null;
	}
	public final String get_Customer_Email(int customer_ID2)
	{for(int a = 0 ; a<loop_value;a++)
		{if(Customer_ID[a] == customer_ID2)
			{return Customer_Email[a];}
		}return null;
	}
	public final String get_Customer_contact (int customer_ID2)
	{for(int a = 0 ; a<loop_value;a++)
		{if(Customer_ID[a] == customer_ID2)
			{return Customer_contact[a];}
		}return null;
	}
	public final int get_Customer_Ticket_Number (int customer_ID2)
	{
		for(int a = 0 ; a<loop_value;a++)
		{if(Customer_ID[a] == customer_ID2)
			{return ticket_number[a];}
		}return 0;
	}

}
