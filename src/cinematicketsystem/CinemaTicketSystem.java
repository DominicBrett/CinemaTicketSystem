/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author k1532959
 */
public class CinemaTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      System.out.println("What day are you purchasing your tickets for?");
      boolean dayDone = false;
      String ticketDay = "";
      //Loops untill the user enters a valid day
      while(!dayDone){
        ticketDay = sc.nextLine();
        if(ticketDay.toLowerCase().equals("monday") 
            || ticketDay.toLowerCase().equals("tuesday")
            || ticketDay.toLowerCase().equals("wednesday")
            || ticketDay.toLowerCase().equals("thursday") 
            || ticketDay.toLowerCase().equals("friday") 
            || ticketDay.toLowerCase().equals("saturday") 
            || ticketDay.toLowerCase().equals("sunday"))
                dayDone = true;
        else
        System.out.println("Please enter a valid day");
        }
      System.out.println("Please select the tickets you want to buy:\n1 : Standard\n2 : OAP\n3 : Student\n4 : Child\n5: Done");
      List<Ticket> tickets = new ArrayList<Ticket>();
      boolean done = false;
      //Loops until the user enters 5, uses switch case to create appropriate ticket and add to array
      while(!done){
           int ticket = sc.nextInt();
          switch (ticket){
              case 1: StandardTicket t = new StandardTicket(ticketDay);
                      tickets.add(t);
                      System.out.println("Standard Ticket Purchased");
                      break;
              case 2: OAPTicket t2 = new OAPTicket(ticketDay);
                      tickets.add(t2);
                      System.out.println("Standard Ticket Purchased");
                      break;
              case 3: StudentTicket t3 = new StudentTicket(ticketDay);
                      tickets.add(t3);
                      System.out.println("Standard Ticket Purchased");
                      break;
              case 4: ChildTicket t4 = new ChildTicket(ticketDay);
                      tickets.add(t4);
                      System.out.println("Standard Ticket Purchased");
                      break;
              case 5: done = true;
                      break;          
          }
      }
      //Loops over all tickets to explain to user what they have purchased and calculates total
      System.out.println("You have purchased the following tickets on " + ticketDay + ":");
      int total = 0;
      for(Ticket t : tickets){
          System.out.println("You have purchased a " + t.getTicketType() + " for £" + t.getTicketCost());
          total += t.getTicketCost();
      }
      System.out.println("In total, your tickets cost: £" + total +"\nThank you for using the system to purchase your ticket!");
    }
}
