package air_ticket_reservation;
import java.util.Random;


public class Time_Class {
	Random random = new Random(60);
	Flight_Class FL_Cl = new Flight_Class();
	
	private int hour[] = new int[16];
	private int minute[] = new int[16];
	private int second[] = new int[16];
	private int loop;
	
	
	
	public final void set_Departure_time(int loop_start,int loop_end)
	{
		int hr,min,sec;
		this.loop = loop_end;
		for(int a = loop_start; a<loop_end ; a++)
		{
			hr=10+random.nextInt(a+10);
			min=2+random.nextInt(a+5);
			sec =4+random.nextInt(15);
			
			hour[a] = (hr>= 0 && hr<24)? hr:0;
			minute[a] = (min>=0 && min<60) ?min:0;
			second[a] = (sec>=0 && sec<60) ? sec:0;
		}
		
	}
	public final String get_Departure_time(int loop_value)
	{
		for(int a = 0 ; a<=loop; a++)
		{
		if(a == loop_value)
		{return String.format("%02d:%02d:%02d GMT",hour[a],minute[a],second[a]);}
		}
		return null;
	}
	public final String get_Arrival_time(int loop_value)
	{
		for(int a = 0 ; a<=loop; a++)
		{
		if(a == loop_value)
		{
			if(a == 0)
			{
				return String.format("%02d:%02d:%02d GMT",13+hour[a],25+minute[a],second[a]);	
			}
			if(a == 1)
			{
				return String.format("%02d:%02d:%02d GMT",12+hour[a],10+minute[a],second[a]);	
			}
			if(a == 2)
			{
				return String.format("%02d:%02d:%02d GMT",19+hour[a],35+minute[a],second[a]);	
			}
			if(a == 3)
			{
				return String.format("%02d:%02d:%02d GMT",15+hour[a],10+minute[a],second[a]);	
			}
			if(a == 4)
			{
				return String.format("%02d:%02d:%02d GMT",12+hour[a],10+minute[a],second[a]);	
			}
			if(a == 5)
			{
				return String.format("%02d:%02d:%02d GMT",18+hour[a],35+minute[a],second[a]);	
			}
			if(a == 6)
			{
				return String.format("%02d:%02d:%02d GMT",12+hour[a],25+minute[a],second[a]);	
			}
			if(a == 7)
			{
				return String.format("%02d:%02d:%02d GMT",17+hour[a],35+minute[a],second[a]);	
			}
			
		}
		}
		return null;
	}

}
