package air_ticket_reservation;

public class Booking {
private String ch1 = "O";
private String ch2 = "R";
private String ch3 = "B";
private String ch4 = "E";
protected  String[] No_of_way = new String[8];
protected  String[] Ticket_Class=new String[8];
protected  String[] Destination= new String[8];
protected String Error= "Invalid Selection";
protected int loop = 0;
String Destination_available [] = {"New York", "Istanbul","Calgary","Paris","Malaysia","California","London","Sydney"};


public final void Destination_Available()
{
    for(int a = 0 ; a<7 ; a++)
    {System.out.println(""+Destination_available [a]+"\n");}
}

public final void Combine(String[] No_ofway ,int loop_start,int loop_end,String[] Ticket_Cl,String [] Primary_Destination)
{   int a;
	loop = loop_end;
    
	for( a =loop_start ; a<loop_end ;  a++)
	{
		if( No_ofway[a].equalsIgnoreCase(ch1))
		{No_of_way[a]="One Way Ticket";}
		if(No_ofway[a].equalsIgnoreCase(ch2))
		{No_of_way[a]="Return Ticket";}
		else
		{No_of_way[a]="One Way Ticket";}
	}	
	for( a =loop_start ; a<loop_end ;  a++)
	{	
		if( Ticket_Cl[a].equalsIgnoreCase(ch3))
		{Ticket_Class[a]="Bussiness Class";}
		if( Ticket_Cl[a].equalsIgnoreCase(ch4))
		{Ticket_Class[a]="Economy Class";}
	}
	for( a =loop_start ; a<loop_end ;  a++)
	{
	
        if(this.Destination_available [0].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [1].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [2].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [3].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [4].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [5].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [6].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        if(this.Destination_available [7].equalsIgnoreCase(Primary_Destination [a]))
        {Destination[a] = Primary_Destination [a];}
        
        /*else{
        	Destination[a] = Error;
        }*/
	}
}
public final String get_return_type(int array_number)
{
	for(int a = 0 ; a<loop; a++)
	{
		if(a == array_number)
		{
			return No_of_way[a];
		}
		
	}
	return null;
}

public final String get_ticket_cls(int array_number)
{
	
	for(int a = 0 ; a<loop; a++)
	{if(a == array_number)
		{
			return Ticket_Class[a];
		}
		
	}
	return null;
}
public final String get_Arri_City(int loop_number)
{
	for(int a = 0 ; a<8 ; a++)
	{if(a == loop_number)
		{return Destination[a];}
	}return null;	
	
}
	
}
