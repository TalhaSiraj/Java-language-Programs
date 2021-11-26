package air_ticket_reservation;

import java.util.*;

public class Air_Ticket_Reservation {



        
	public static void main(String[] args) {
        Flight_Schedule Fl_Sc=new Flight_Schedule();
        Log_in lg_in = new Log_in();
        Scanner input= new Scanner(System.in);
        Menu_Class M_Cl = new Menu_Class();
        Passenger P_Cl = new Passenger();
        int check = 0,menu;
        System.out.println("****************************************************************************");
        System.out.println("\t\tWelcome to KAZAT Air Ticket Reservation System");
        System.out.println("****************************************************************************\n"); 
        
        
		do{
                    
            String login = null; 
            int pass=0;
                    
            System.out.print("Enter Login ID : ");
            login= input.next();
                    
            System.out.print("Enter password : ");
            pass= input.nextInt();
     
            check = lg_in.check_login(login, pass);
                    
            }while(check == 2);     
            
			while(true)
			{
			menu=M_Cl.Show_menu();
			if(menu == 1)
			{
			System.out.println("\n****************************************************************************");
			System.out.println("\t\t\tKAZAT Air Flight Schedule");
			System.out.println("****************************************************************************\n");
			System.out.println("Airline Name\tCode\tFrom\t\tTo\t\tDuration\n");
			Fl_Sc.flight_info("Karachi");
			Fl_Sc.flight_info("Lahore");
			Fl_Sc.flight_info("Islamabad");
			System.out.println("\n****************************************************************************\n"); 
			M_Cl.user_info();	
			}
			if(menu == 2)
			{
				System.out.println("\n**************************************************** ");
				System.out.println("Reserved Id's : ");
			P_Cl.get_customer_id();
			System.out.println("**************************************************** ");
			System.out.println();
			M_Cl.display_user_info();
			}
			if(menu == 3)
			{
				System.out.println("Enter City Name : ");
				String City_Name = input.next();
				System.out.println("\nAirline Name\tCode\tFrom\t\tTo\t\tDuration\n");
				Fl_Sc.flight_info(City_Name);
			}
			if(menu == 4)
			{
				int user_id;
				System.out.print("Enter user id : ");
				user_id = input.nextInt();
				M_Cl.ShowTicket(user_id);
				
			}
			if(menu == 5)
			{
				System.out.print("\n\tThank you for using our services.");
		    	 System.out.print("\n\tYou have exited the program.\n\n\n");
		    	 System.exit(0);
			}
			if(menu != 1 && menu !=2 && menu !=3 && menu !=4&& menu !=5)
			{
			menu=M_Cl.Show_menu();
			}
			}
}

}
