import java.io.*;
import java.text.*;
import java.util.*;
	
public class Airline {

	    static ArrayList<Flight> findFlights= new ArrayList<>();
        private static Scanner terminal;

	    static void populatefindFlights() {
	    	findFlights.clear();
	        String fileName = "Airline.txt";
	        File file = new File(fileName);
	        try {
	            terminal = new Scanner(file);

	            while(terminal.hasNext()) {
	                int number = terminal.nextInt();
	                String from = terminal.next();
	                String to = terminal.next();

	                String departureDateText = terminal.next();
	                String departureTime = terminal.next();
	                String arrivalDateText = terminal.next();
	                String arrivalTime = terminal.next();

	                double cost = terminal.nextDouble();
	                String airlines = terminal.next();

	                int capacity = terminal.nextInt();

	                Flight flight = new Flight(number, from, to, departureDateText,
	                        departureTime, arrivalDateText, arrivalTime, cost, airlines, capacity);
	                findFlights.add(flight);
	            }

	        } catch (FileNotFoundException e) {
	        	e.printStackTrace();
	        }
	      }
	    
	    public static final class SearchFlight extends Airline {
	        String from;
	        String to;
	        Date departureDate;
	        ArrayList<Flight> searchResults;
			private Scanner terminal;


	        public String getTo() {
	            return to;
	        }

	        public String getFrom() {
	            return from;
	        }


	        public Date getDepartureDate() {
	            return departureDate;
	        }

	        public ArrayList<Flight> getList() {
	            return searchResults;
	        }

	        public SearchFlight() {
	            System.out.println("\nList of all the flights in october 2018:\n");
	            System.out.println("FLIGHT NUMBER        | FROM   DEPARTURE DATE/TIME       -->     TO     ARRIVAL DATE/TIME        PRICE PER PASSENGER");
	        System.out.println("--------------------------------------------------------------------------------------------------------------------");

	        for(int i = 0; i < findFlights.size(); i++)
	            findFlights.get(i).display();
	        }

	        public void setFrom(String from) {
	            this.from = from;
	        }

	        public void setTo(String to) {
	            this.to = to;
	        }

	        public boolean setDepartureDate(String departureDateText) {
	            SimpleDateFormat sdt = new SimpleDateFormat("MM-dd-yyyy");
	            try {
	                this.departureDate = sdt.parse(departureDateText);
	                return true;
	            }
	            catch (ParseException e) {
	                System.err.println("ERROR: Invalid Date Format!");
	                return false;
	            }
	        }

	        public void getSearchData() {
	            terminal = new Scanner(System.in);
	            System.out.println("\n\n\t\tSEARCH FLIGHTS");
	            System.out.print("FROM: ");
	            from = terminal.next();
	            System.out.print("TO: ");
	            to = terminal.next();
	            System.out.print("DEPARTURE(MM-DD-YYYY): ");
	            String tempDate = terminal.next();
	            while(!setDepartureDate(tempDate)) {
	                System.out.print("DEPARTURE(MM-DD-YYYY): ");
	                tempDate = terminal.next();
	            }
	            
	        }

	        public boolean getSearchResults() {
	            searchResults = new ArrayList<>();

	            for(int i = 0; i < findFlights.size(); i++) {
	                if(findFlights.get(i).getFrom().equalsIgnoreCase(from) && findFlights.get(i).getTo().equalsIgnoreCase(to)) {
	                    if(findFlights.get(i).getDepartureDate().equals(departureDate)) {
	                        searchResults.add(findFlights.get(i));
	                    }
	                }
	            }

	            if(searchResults.isEmpty())
	                return false;
	            else
	                return true;
	        }


	        public void displayResults() {
	            for(int i = 0; i < searchResults.size(); i++) {
	                    System.out.print((i+1) + ". ");
	                    searchResults.get(i).display();
	            }
	        }
	    }
	    
	 

}
