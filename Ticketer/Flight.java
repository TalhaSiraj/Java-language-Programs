import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Flight {
	private String to;
    private String from;
    private Date departureDate;
    private Date arrivalDate;
    private char[][] seats;
    private Time departureTime;
    private Time arrivalTime;
    private String airlines;
    private int capacity;
    private int bookedSeats;
    private double cost;
    static String[] arguments;

    public String getAirlines() {
        return airlines;
    }

    private class Time {
        private int hour;
        private int minutes;

        public Time(int hour, int minutes) {
            this.hour = hour;
            this.minutes = minutes;
        }

        public int getHour() {
            return hour;
        }

        public int getMinutes() {
            return minutes;
        }


        public void printTime() {
            System.out.printf("%02d:%02d", hour, minutes);
        }

    }
    
    
    public Flight(int number, String from, String to, String departureDateText, String departureTime, String arrivalDateText,String arrivalTime, double cost, String airlines, int capacity) 
    {
    	this.to = to;
        this.from = from;

        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
        try 
        {
            this.departureDate = sdt.parse(departureDateText);

            this.arrivalDate = sdt.parse(arrivalDateText);
        }
        
       catch (ParseException e) 
        {
            System.out.println("Unparseable using " + sdt);

        }

        String[] parts = departureTime.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        this.departureTime = new Time(hour, minutes);

        parts = arrivalTime.split(":");
        hour = Integer.parseInt(parts[0]);
        minutes = Integer.parseInt(parts[1]);
        this.arrivalTime = new Time(hour, minutes);


        this.cost = cost;
        this.airlines = airlines;
        this.capacity = capacity;
        this.bookedSeats=0;

        seats = new char[10][7];
        
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 7; j++)
            	if (((rand.nextInt(10))%3)==0) seats[i][j] = 'R';
            	else seats[i][j] = '_';
    }

    public String getTo() 
     {
        return to;
     }
    
    public String getFrom() 
     {
        return from;
     }
    
    public Date getDepartureDate() 
     {
        return departureDate;
     }
    
    public Date getArrivalDate() 
     {
        return arrivalDate;
     }
    
    public String getDepartureTime() 
     {
        String time = departureTime.getHour()+":"+departureTime.getMinutes();
        return time;
     }
    
    public String getArrivalTime() 
     {
        String time = arrivalTime.getHour()+":"+arrivalTime.getMinutes();
        return time;
     }
    
    public int getBookedSeats()
     {
        return bookedSeats;
     }
    
    public int getAvailableSeats()
     {
        return capacity-bookedSeats;
     }
    
    
    public void reserveSeats(int row, char col) 
     {
    
        this.bookedSeats--;
        if(seats[row][(int)Character.toUpperCase(col)-65]=='R') {
            System.out.println("Error: This seat is reserved. You will need to rebook your flight. \n\n" );
     
            try {
    			TimeUnit.SECONDS.sleep(5);
    		} catch (InterruptedException e) {

    			e.printStackTrace();
    		}
            
            Main.main(arguments);
         }
        else 
        {
            seats[row][(int)Character.toUpperCase(col)-65] ='R';
            printSeats();
        }
     }
    
    public void display() 
     {
        System.out.printf("%-20s | %-5s  %tB %<te, %<tY ",airlines, from, departureDate);
        departureTime.printTime();
        System.out.printf(" \t-->\t%-5s  %tB %<te, %<tY ", to, arrivalDate);
        arrivalTime.printTime();
        System.out.printf("\t%.2f Rs%n", cost);
     }
    
    public void printSeats() {
        System.out.println("\n\t\tRESERVED SEAT");
        System.out.print("\n\t       A B   C D E   F G\n\t");
        for(int i = 0; i < 10; i++) {
            System.out.printf("   %2d  ",(i+1));
            for(int j = 0; j < 7; j++) {
                if(j == 2 || j == 5)
                    System.out.print("  ");
                System.out.print(seats[i][j] + " ");
            }
            System.out.print("\n\t");
        }
        System.out.println("\nNote: R is designated as seat reserved for a passenger.");
        System.out.println("\nDisclaimer: Kazat Airlines reserves the right to overbook the flight. \n            Final seating will be assigned at check-in.");
        System.out.printf("%n%n");
    } 
 }
