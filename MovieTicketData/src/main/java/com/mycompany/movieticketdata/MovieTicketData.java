/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movieticketdata;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketData {

    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;
    
    public MovieTicketData(String movieName, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }
    
    // Getters and Setters
    public String getMovieName() { return movieName; }
    public void setMovieName(String movieName) { this.movieName = movieName; }
    
    public int getNumberOfTickets() { return numberOfTickets; }
    public void setNumberOfTickets(int numberOfTickets) { this.numberOfTickets = numberOfTickets; }
    
    public double getTicketPrice() { return ticketPrice; }
    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }
}

  