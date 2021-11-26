import java.util.Scanner;

public class Passenger {
	 protected String firstName;
     protected String lastName;
     private String address;
     private String phoneNumber;
	 private Scanner terminal;

     
     public Passenger()
      {
         terminal = new Scanner(System.in);
         System.out.print("FIRST NAME: ");
         firstName = terminal.nextLine();
         System.out.print("LAST NAME: ");
         lastName = terminal.nextLine();
         System.out.print("ADDRESS: ");
         address = terminal.nextLine();
         System.out.print("CONTACT NUMBER: ");
         phoneNumber = terminal.next();    
       }
     
     Passenger(String firstName, String lastName, String address, String phoneNumber) 
     {
         this.firstName = firstName;
         this.lastName = lastName;
         this.address = address;
         this.phoneNumber = phoneNumber;
     }

     public String getFirstName() 
     {
         return firstName;
     }
     
     public String getLastName() 
      {
         return lastName;
      }
     
     public String getaddress() 
      {
         return address;
      }
     
     public String getphoneNumber() 
      {
         return phoneNumber;
      }
     
     public void setFirstName(String firstName) 
      {
         this.firstName = firstName;
      }
     
     public void setLastName(String lastName) 
      {
         this.lastName = lastName;
      }
     
     public void setaddress(String address) 
      {
         this.address = address;
      }

     public void setphoneNumber(String phoneNumber) 
      {
         this.phoneNumber = phoneNumber;
      }
 

    public static final class Person extends Passenger
    {
     private int rowSeat;
     public char colSeat;
	 private Scanner terminal;
    
     Person(Flight reservedFlight) 
     {
         reservedFlight.printSeats();
         terminal = new Scanner(System.in);
         while(true) 
         {
             System.out.print("Enter seat number (row-column, ex: 1-A): ");
             String ch = terminal.nextLine();
             try
             {
                 String[] temp = ch.split("-");
                 rowSeat = Integer.parseInt(temp[0]);
                 colSeat = temp[1].charAt(0);
                 if(rowSeat < 1 || rowSeat > 10 || Character.toLowerCase(colSeat) < 'a' || Character.toLowerCase(colSeat) > 'g')
                     throw new Exception();
                 rowSeat--;
                 break;
             }
             catch(Exception e) 
             {
                 System.err.println("Error: Invalid seat format/number!");
             }
             
             
         }
         
         reservedFlight.reserveSeats(rowSeat, colSeat);
         Ticket.generateTicket(reservedFlight, lastName, firstName, rowSeat, colSeat);
        }
   
    }
}
   
