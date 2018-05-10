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
public abstract class Ticket {
    private String ticketType;
    private int ticketCost;
    private String ticketDay;
    
    //Constructor calls getCost method to calculate cost
    public Ticket(String ticketType, int ticketCost, String ticketDay) {
        this.ticketType = ticketType;
        this.ticketCost = getCost(ticketDay, ticketCost);
        this.ticketDay = ticketDay;
    }
    //If it is a wednesday the system will return the ticketCost discounted by 2 otherwise it will just return the ticketCost
    public int getCost(String ticketDay, int ticketCost){
        if(ticketDay.toLowerCase().equals("wednesday")){
            return ticketCost - 2;
        } else{
            return ticketCost;
        }
    }
    //Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getTicketDay() {
        return ticketDay;
    }

    public void setTicketDay(String ticketDay) {
        this.ticketDay = ticketDay;
    }

}
