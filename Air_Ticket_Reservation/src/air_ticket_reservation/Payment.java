
package air_ticket_reservation;

import java.util.Scanner;



public class Payment {
    

 public final void getCard(){
     Scanner cardNo = new Scanner(System.in);
     String card;
     int check ; 
     
     do{
     System.out.print("Please enter credit card number( 16 digit): "); 
     card = cardNo.nextLine();         
     if(card.length()==16){
         check = 1;
}
     else{
     System.out.println("Invalid credit card, please enter correct card number! ");
         check= 0;
     } 
     }while(check  == 0);
  
}
}
