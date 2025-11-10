/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketdata;

/**
 *
 * @author lab_services_student
 */

public class MovieTicketsGUI implements IMovieTickets {
    private static final double VAT_RATE = 0.14;
    
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subtotal = numberOfTickets * ticketPrice;
        double vatAmount = subtotal * VAT_RATE;
        return subtotal + vatAmount;
    }
    
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        if (movieTicketData.getMovieName() == null || movieTicketData.getMovieName().trim().isEmpty()) {
            return false;
        }
        if (movieTicketData.getNumberOfTickets() <= 0) {
            return false;
        }
        if (movieTicketData.getTicketPrice() <= 0) {
            return false;
        }
        return true;
    }
}

