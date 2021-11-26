import java.util.Scanner;

public class Main {
	
    private static Scanner terminal;
    
	public static void main(String[] args) {

	int number = -3;
	
	while(number < 1 || number > 3) 
     {
	 terminal = new Scanner(System.in);
	 System.out.println("\n\n\t\t\tWelcome to Kazat Airlines");
	 System.out.println("\n\tMenu: ");
	 System.out.println("\tOption 1: Schedule Reservation");
	 System.out.println("\tOption 2: View Reservation");
	 System.out.println("\tOption 3: Exit System");
	 System.out.print("\n\tPlease enter option number: ");
	 number = terminal.nextInt();
     }
	
	switch(number) {
	
	case 1:
        Airline.populatefindFlights();
        terminal = new Scanner(System.in);
        int num = 3;
        while(num != 0) {
            Airline.SearchFlight test = new Airline.SearchFlight();
            test.getSearchData();
            boolean found = test.getSearchResults();
            if(found) {
                System.out.println("\n\t\t\tSEARCH RESULTS\n");
                test.displayResults();
                
                System.out.print("Enter the number of Flight you wish to book (1-" + (test.getList().size())+ "): ");
                int index = terminal.nextInt()-1;

                if(index >= 0 && index < test.getList().size()) {
                    Flight reservedFlight = test.getList().get(index);

                    if(reservedFlight.getAvailableSeats() <= 0){
                        System.out.println("Sorry! Not enough seats.");
                        System.out.print("\nDo you want to search again?? (Enter 1 to try again): ");
                        num = terminal.nextInt();
                    }
                    else {
                        System.out.print("\nSELECTED Flight: "+(index+1)+". ");
                        reservedFlight.display();
                        System.out.println("\n\t\t\tENTER PASSENGER INFORMATION");
                        new Passenger.Person(reservedFlight);
                        num = 0;
                    }
                }
                else {
                    System.out.print("ERROR: invalid");
                    System.out.print("\nDo you want to search again?? (Enter 1 to try again): ");
                    num = terminal.nextInt();
                }
            }
            else
            {
                System.out.print("Sorry! There are no Flights flying from " + test.getFrom() + " to " + test.getTo() + " on ");
                System.out.printf("%tD%n", test.getDepartureDate());
                System.out.print("\nDo you want to search again?? (Enter 1 to try again): ");
                num = terminal.nextInt();
            }
        }
        System.exit(0);
        
	 
     case 2:
         int n = 1;
         Ticket.read();
         System.out.print("\nWould you like to cancel your reservation? Press 1 for Yes or 2 for No: ");
         int delete = terminal.nextInt();
         if(delete == n) {    	 
    	 Ticket.cancelFlights();
         }
         else
         Ticket.back();
         System.exit(0);
     
     case 3:
    	 System.out.print("\n\tThank you for using our services now please fuck yourself");
    	 System.out.print("\n\tYou have exited the program.\n\n\n");
    	 System.exit(0);
	 }
    }
  }
