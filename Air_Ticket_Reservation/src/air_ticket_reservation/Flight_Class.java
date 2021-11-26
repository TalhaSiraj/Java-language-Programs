package air_ticket_reservation;

import java.util.Random;

public class Flight_Class {
Random seat = new Random(100);
	
private int num =0 ;	
protected int [] Stay = new int[8];
protected int [] Seat_num = new int[26];
protected static String [] Departure_Date  = new String [8];
protected String [] Departure_Airport = new String[8];
protected String [] Departure_City = {"Karachi","Lahore","Islamabad"};
protected String [] Arrival_Airport = new String[8];
protected String [] Arrival_City = {"NewYork", "Istanbul","Calgary","Paris","Malaysia","California","London","Sydney"};


public final void set_Airport_Departure(int loop_start,int loop_end,String City)
{ num = loop_end;

int b;
	//Check which Airport
	
for(b = loop_start ; b< loop_end ; b++)
{if(Departure_City[0].equalsIgnoreCase(City))
	{Departure_Airport[b] = "Jinnah International Airport";}
	if(Departure_City[1].equalsIgnoreCase(City))
	{Departure_Airport[b] = "Allama Iqbal International Airport";}
	if(Departure_City[2].equalsIgnoreCase(City))
	{Departure_Airport[b] = "Islamabad International Airport";}
}
}

public final void set_Airport_Arrival(int loop_start,int loop_end,String City[])
{
	//Here num_of_members use for a count of how many places we save same airport name.
	int a,b=0;
for(a = 0 ; a<8 ; a++)
{
	if(Arrival_City[0].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "John F Kennedy Airport";}}
	if(Arrival_City[1].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Atatork Airport";}
	}
	if(Arrival_City[2].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Calgary International Airport";}
	}
	if(Arrival_City[3].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Charles de Gaulle Airport";}
	}
	if(Arrival_City[4].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Kuala Lumpur Airport";}
	}
	if(Arrival_City[5].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Los Angeles International";}
	}
	if(Arrival_City[6].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Heathrow Airport";}
	}
	if(Arrival_City[7].equalsIgnoreCase(City[a]))
	{for(b = loop_start ; b<loop_end ; b++)
		{Arrival_Airport[b] = "Kingsford Smith Airport";}
	}
	
}
}

public final String get_airport_departure_name(int loop_number)
{for(int a = 0 ; a<=num ; a++)
	{if(a == loop_number)
		{return Departure_Airport[a];}
	}return null;	
}
public final String get_airport_arrival_name(int loop_number)
{for(int a = 0 ; a<=num ; a++)
	{if(a == loop_number)
		{return Arrival_Airport[a];}}
	return null;
}
public final void set_stay(int loop_start,int loop_end,int stay [])
{
    int a ;
    for(a = loop_start; a<loop_end ; a++)
    { Stay[a] = stay[a];
    }

}
public final int get_Stay( int loop_number)
{
    for(int a = 0 ; a<num ; a++)
    {
        if(a == loop_number)
        {
            
        if(Stay[a] == 0)
        {
            return 0;
        }
        else{
            return Stay[a];
        }
        }
    }
    return 404;
}

public final String get_City(int loop_number)
{
	for(int a = 0 ; a<3 ; a++)
	{if(a == loop_number)
		{return Departure_City[a];}
	}return null;	
	
}

public void set_seats(int loop_start , int loop_end)
{
	for(int a = loop_start ; a<loop_end;a++)
	{
		Seat_num[a]=25+seat.nextInt(65);
	}
	
}
public int get_seat_number(int loop_number)
{
	for(int a=0; a<num ; a++)
	{
		if(a == loop_number)
		{
			return Seat_num[a];
		}
		
	}
	
	return 404;
}



}
