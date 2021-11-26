package air_ticket_reservation;

public class Log_in {
	private String login_id = "TAZ";
	private int pass = 786;
	public final int check_login(String login_id,int pass)
	{
	    if(login_id.equals(login_id) && pass == 786)
	    {
	        return 1;
	    }
	    else
	    {	System.out.println("Invalid ID or Password.");	
	    	return 2;
	}


	}
}
