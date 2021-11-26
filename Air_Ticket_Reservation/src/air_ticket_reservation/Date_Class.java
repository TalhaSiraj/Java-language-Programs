package air_ticket_reservation;
//Done
public class Date_Class {
protected int day [] = new int[16];
protected int month [] = new int[16];
protected int year [] = new int[16];

int loop;



public void set_date(int Day , int Month, int Year,int loop_start,int loop_end)
{this.loop = loop_end;
	//To set date on particular array number
	for(int a = loop_start ; a< loop_end; a++)
	{
	 day[a] =(Day>=1 && Day<=31) ? Day : 1;	
	 month[a] =(Month>=1 && Month<=12) ? Month : 1;
	 year[a] = (Year>=2018 && Year<=2100)?Year : 2018;
	 
	 }
}

public String get_date(int loop_number)
{
	for(int a = 0 ; a< loop ; a++)
	{
		if(a == loop_number)
		{
			return String.format("%02d/%02d/%02d", day[a],month[a],year[a]);	
		}
		
	}
	
	return null;
}

public String get_arrival_date(int loop_number)
{
	for(int a = 0 ; a< loop ; a++)
	{
		if(a == loop_number)
		{
			if(day[a] != 31)
			{return String.format("%02d/%02d/%02d", 1+day[a],month[a],year[a]);}
			if(day[a] == 31)
			{return String.format("%02d/%02d/%02d", day[a],1+month[a],year[a]);}
		}
	}
	return null;
}

}
