/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketsystem;

/**
 *
 * @author k1532959
 */
public class StudentTicket extends Ticket {
    //Constructor calls super constructor with ticket details
        public StudentTicket (String ticketDay){
        super("Student Ticket", 6, ticketDay);
    }
}
