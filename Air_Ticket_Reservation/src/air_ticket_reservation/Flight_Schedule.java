package air_ticket_reservation;


public class Flight_Schedule {
	Time_Class T_c = new Time_Class();
	Date_Class D_c = new Date_Class();
	Flight_Class Fl_Cls = new Flight_Class();
	
	
	protected String Airline_Avaiable_in_Karachi[] = {"KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     "};
	protected String Airline_Avaiable_in_Karachi_Duration[] = {"13h 25m+","12h 10m","19h 35m+","15h 10m+","12h 0m","18h 20min","12h 30m","17h 55m+"};
	protected String Airline_Code_Karachi[]={"KAT-01","KAT-02","KAT-03","KAT-04","KAT-05","KAT-06","KAT-07","KAT-08"};
	
	protected String Airline_Avaiable_in_Lahore[] = {"KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     "};
	protected String Airline_Avaiable_in_Lahore_Duration[] = {"14h 25m+","13h 10m","19h 35m+","14h 10m+","13h 0m","19h 20min","13h 30m","18h 55m+"};
	protected String Airline_Code_Lahore[]={"KAT-09","KAT-10","KAT-11","KAT-12","KAT-13","KAT-14","KAT-15","KAT-16"};
	
	protected String Airline_Avaiable_in_Islamabad[] = {"KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     ","KAZATAir     "};
	protected String Airline_Avaiable_in_Islamabad_Duration[] = {"13h 25m+","12h 10m","19h 35m+","15h 10m+","12h 0m","18h 20min","12h 30m","17h 55m+"};
	protected String Airline_Code_Islamabad[]={"KAT-17","KAT-18","KAT-19","KAT-20","KAT-21","KAT-22","KAT-23","KAT-24"};
	
	protected String [] Arrival_City = {"NewYork  ", "Istanbul ","Calgary  ","Paris    ","Malaysia ","California","London   ","Sydney   "};

	
	
	public final void flight_info(String City)
	{
		
		if(City.equalsIgnoreCase("Karachi"))	
		{for(int a = 0 ; a<8 ; a++)
			{System.out.println(""+Airline_Avaiable_in_Karachi[a]+"\t"+Airline_Code_Karachi[a]+"\tKarachi  "+"\t"+Arrival_City[a]+"\t"+Airline_Avaiable_in_Karachi_Duration[a]);}
		}
		if(City.equalsIgnoreCase("Lahore"))
		{for(int a = 0 ; a<8 ; a++)
			{System.out.println(""+Airline_Avaiable_in_Lahore[a]+"\t"+Airline_Code_Lahore[a]+"\tLahore   "+"\t"+Arrival_City[a]+"\t"+Airline_Avaiable_in_Lahore_Duration[a]);}
		}
		if(City.equalsIgnoreCase("Islamabad"))
			{for(int a = 0 ; a<8 ; a++)
			{System.out.println(""+Airline_Avaiable_in_Islamabad[a]+"\t"+Airline_Code_Islamabad[a]+"\tIslamabad "+"\t"+Arrival_City[a]+"\t"+Airline_Avaiable_in_Lahore_Duration[a]);}
		}
		
	}
	

}
