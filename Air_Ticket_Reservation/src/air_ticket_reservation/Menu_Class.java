package air_ticket_reservation;

import java.util.Scanner;


public class Menu_Class {
    Payment PAY_Cl = new Payment();
	Flight_Schedule F_S = new Flight_Schedule();
	Time_Class T_C = new Time_Class();
	Date_Class D_C = new Date_Class();
	Booking ob1 = new Booking();
	Passenger ob = new Passenger();
	Flight_Class FLC = new Flight_Class();
	String Customer_Name[] = new String[8];
	String Customer_Email[] = new String[8];
	String [] Customer_contact = new String[8];
	String[] No_of_way = new String[8];
	String[] Ticket_Class = new String [8];
	String [] Primary_Destination = new String [8];
	String Secondary_Destination;
	String [] Primary_Departure = new String [8];
    int []stay = new int[8];
    String Secondary_Departure;
    int Secondary_Date,Secondary_Month,Secondary_Year,id,cycle = 0 ;
     
	
    int menu = 0;
    
    Scanner input = new Scanner(System.in);
    
    public final int Show_menu()
    {
        System.out.println("\n\tMenu: ");
        System.out.println("\tOption 1 : Flight Reservation ");
        System.out.println("\tOption 2 : View Reservation ");
        System.out.println("\tOption 3 : Flight Schedule ");
        System.out.println("\tOption 4 : Re-issues Ticket");
        System.out.println("\tOption 5 : Exit System\n");
   	 	System.out.print("Please Enter Option Number : ");
        menu = input.nextInt();
                
        
        
        return menu;
    }
    
 public final void user_info(){
	 System.out.print("Please enter required information");

System.out.print("\nTo : ");
Secondary_Destination =input.next();

System.out.print("From : ");
Secondary_Departure =input.next();
        
int a ;
for(a = cycle ; a<(cycle+1); a++)
{
Primary_Destination[a]=Secondary_Destination;
Primary_Departure[a] =Secondary_Departure;
    
System.out.print("Name : ");
Customer_Name [a]=input.next();
	
System.out.print("Email : ");
Customer_Email[a]=input.next();
	
System.out.print("Contact : ");
Customer_contact[a]=input.next();                        
	
System.out.print("Choose one way ticket or return ticket by typing 'O' or 'R' : ");
No_of_way[a] = input.next();

if(No_of_way[a].equalsIgnoreCase("R"))
{
  System.out.print("How many Days you want to stay : ");  
  stay[a] = input.nextInt();
  System.out.print("You will receive your confirm 'RETRUN' ticket in 24 Hour\n");
}
else
{
  stay[a] = 0;  
}
	
System.out.print("Choose Ticket class Bussiness or Economy by typing 'B' or 'E' : ");
Ticket_Class[a]=input.next();
}
System.out.print("Enter date in DD/MM/YY : ");
Secondary_Date = input.nextInt();
Secondary_Month = input.nextInt();
Secondary_Year = input.nextInt();
PAY_Cl.getCard();
System.out.println("\nYour Reservation has been confirmed and ticket has been sent to your email.\nThankyou for using our services\n");

//Passenger Class
ob.put_info_Customer( cycle, Customer_Name, Customer_Email,a,Customer_contact);
//Booking Class
ob1.Combine(No_of_way,cycle,a,Ticket_Class,Primary_Destination);
//Flight Class
FLC.set_Airport_Departure(cycle,a,Secondary_Departure);
//Flight Class
FLC.set_Airport_Arrival(cycle,a,Primary_Destination);
//Flight Class
FLC.set_stay(cycle,a,stay);
//Flight Class
FLC.set_seats(cycle, a);
//Date Class
D_C.set_date(Secondary_Date,Secondary_Month,Secondary_Year,cycle,a);
T_C.set_Departure_time(cycle,a);


int num = ob.Customer_ID[cycle];
ShowTicket(num);
cycle = a;
}
    
    public final void display_user_info()
    {
        
        System.out.print("Enter id : ");
		id = input.nextInt();
		System.out.println("\n****************************************************************************");
		System.out.print("\t\tThe enterned information");
		System.out.println("\n\t\t************************");
		System.out.println("\nTicket number is : "+ob.get_Customer_Ticket_Number(id));
                System.out.println("Name : "+ob.get_Customer_Name(id));
		System.out.println("Email : "+ob.get_Customer_Email(id));
		System.out.println("Contact : "+ob.get_Customer_contact(id));
		
		
		//This array number will pass to get flight name.
		int array_number = Passenger.get_array_number(id);
		System.out.println("Departure Date "+D_C.get_date(array_number));
		System.out.println("Departure Time "+T_C.get_Departure_time(array_number));
                System.out.println("Departure Airport : "+FLC.get_airport_departure_name(array_number));
		System.out.println("Arrival Airport : "+FLC.get_airport_arrival_name(array_number));
		
                int check_Stay ;
                check_Stay=FLC.get_Stay(array_number);
                if(check_Stay != 0)
                {
                System.out.println("Stay : "+check_Stay);
                }else{}
                System.out.println("Arrival Date "+D_C.get_arrival_date(array_number));
                System.out.println("Arrival Time "+T_C.get_Arrival_time(array_number));
               

		System.out.println("Ticket Class "+ob1.get_ticket_cls(array_number));
		System.out.println("Ticket Type "+ob1.get_return_type(array_number)+"\n");
		System.out.println("\n****************************************************************************");
		
        
    }
    public void ShowTicket(int customer_id){
    int array_number = Passenger.get_array_number(customer_id);     
    	
    System.out.println("\n*************************************************** ");
    System.out.println(" \t\tKazat Airlines ");
    System.out.println("**************************************************** ");
    System.out.println(" \t\tFLIGHT TICKET "); 

    System.out.println("Name: "+ob.get_Customer_Name(customer_id));
    System.out.println("Flight: KAT Air");	
    System.out.println("Ticket number: "+ob.get_Customer_Ticket_Number(customer_id));
    System.out.println("Departure : "+FLC.get_City(array_number)+"\t"+D_C.get_date(array_number)+"\t"+T_C.get_Departure_time(array_number));
    System.out.println("Arrival : "+ob1.get_Arri_City(array_number)+"\t"+D_C.get_arrival_date(array_number)+"\t"+T_C.get_Arrival_time(array_number));
    System.out.println("Class : "+ob1.get_ticket_cls(array_number)+"\nSeat Number\t"+FLC.get_seat_number(array_number));
	System.out.println("Ticket State : "+ob1.get_return_type(array_number)+"\n");
	System.out.println("****************************************************\n ");	
        
        }
    

}
