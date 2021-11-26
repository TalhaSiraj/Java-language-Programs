import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Ticket {
	
	static ArrayList<String> reservation= new ArrayList<>();
	static String[] arguments;
	private static BufferedReader b;
    
	public static void generateTicket(Flight reservedFlight, String lastName, String firstName, int rowSeat, char colSeat)  
    {
		File ticket = new File("FlightTicket.txt");
		Ticket.check();
		
        PrintWriter reader;
		try {
			reader = new PrintWriter(new FileWriter(ticket, true));
            reader.println("----------------------------------------------------------------------------------");
            String tempString = "Kazat Airlines";
            int fieldWidth1 = 40+tempString.length()/2;
            int fieldWidth2 = 40-tempString.length()/2;
            String arg = "|%" + Integer.toString(fieldWidth1) + "s%" + Integer.toString(fieldWidth2) + "s|%n";
            reader.printf(arg, tempString, "");
            tempString = "FLIGHT TICKET";
            fieldWidth1 = 40+tempString.length()/2;
            fieldWidth2 = 40-tempString.length()/2;
            arg = "|%" + Integer.toString(fieldWidth1) + "s%" + Integer.toString(fieldWidth2) + "s|%n";
            reader.printf(arg, tempString, "");
            reader.println("|                                                                                |");
            tempString = lastName.toUpperCase() + ", " + firstName.toUpperCase();
            reader.printf("|%-15s%-65s|%n","NAME:", tempString);
            reader.printf("|%-15s%-49s%Ta %<td %<Tb %<tY |%n","FLIGHT:", reservedFlight.getAirlines().toUpperCase(), reservedFlight.getDepartureDate());
            reader.printf("|%-15s%-50s  %td %<Tb %5s |%n","DEPARTURE:", reservedFlight.getFrom().toUpperCase(), reservedFlight.getDepartureDate(), reservedFlight.getDepartureTime());
            reader.printf("|%-15s%-50s  %td %<Tb %5s |%n","ARRIVAL:", reservedFlight.getTo().toUpperCase(), reservedFlight.getArrivalDate(), reservedFlight.getArrivalTime());
            reader.printf("|%-15s%02d-%s%-60s |%n","SEAT: ", (rowSeat+1), Character.toString(colSeat).toUpperCase(), "");
            reader.printf("|%-15s%-65s|%n"," ", "RESERVATION CONFIRMED");
            reader.println("|                                                                                |");
            reader.println("----------------------------------------------------------------------------------");
            reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        
        System.out.print("\nCongradulation your ticket has been created at Ticket.txt.");
        System.out.print("\nThank you for using our servies");
        System.out.print("\nYou will now be returning to the main menu.\n");
        try {
			TimeUnit.SECONDS.sleep(7);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
        
        Main.main(arguments);
       
    }
	
	   
	  public static void cancelFlights() 
	  {
		  File ticket = new File("FlightTicket.txt");
	        try {
	            PrintWriter reader = new PrintWriter(ticket);
	            reader.print("There is no reservation.");
	            reader.close();
	        } catch (FileNotFoundException e) {
	        	e.printStackTrace();
	        }
	        
	        System.out.print("\nYour reservaton has been cancelled.");
	    	System.out.print("\nYou have been issued a refund.");
	    	System.out.print("\nThank you for using our services");
	    	System.out.print("\nYou will now be returning to the main menu.\n\n\n");
	    	 
	        try {
				TimeUnit.SECONDS.sleep(6);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	        
	        Main.main(arguments);
	       
	  }
	  
	  public static void back() 
	  {
		  
	    	System.out.print("\nThank you for using our system!");
	    	System.out.print("\nYou will now be returning to the main menu.\n\n\n");
	    	 
	        try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	        
	        Main.main(arguments);
	       
	  }
	  
	  public static void read() {

	        try {

	            File f = new File("FlightTicket.txt");

	            b = new BufferedReader(new FileReader(f));

	            String readLine = "";
	            String red = new String ("There is no reservation.");

	            System.out.println("\n\n\t\t\t\tReservation Menu\n\n");

	            while ((readLine = b.readLine()) != null) {
	                System.out.println(readLine);
	                
	                if(readLine.equals(red)) {
	                try {
	         				TimeUnit.SECONDS.sleep(4);
	         			} catch (InterruptedException e) {	
	         				e.printStackTrace();
	         			}
	                
	                   Main.main(arguments);
	                }
	        
	            }
	            

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
	  
	  public static void check() {

	            File ticket = new File("FlightTicket.txt");
	            String readLine = "";
	            String red = new String ("There is no reservation.");
	            
	            try {
					b = new BufferedReader(new FileReader(ticket));
					try {
						while ((readLine = b.readLine()) != null) {
						    
						    if(readLine.equals(red)) {
						    	try {
						            PrintWriter reader = new PrintWriter(ticket);
						            reader.print("");
						            reader.close();
						        } catch (FileNotFoundException e) {
						        	e.printStackTrace();
						        }
						    }
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}	                
	       
	         }
	   	  
}
