/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieapplication;

/**
 *
 * @author lab_services_student
 */
public class MovieTickets implements IMovieTickets {
    
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }
    
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        if (totalSales.length == 0 || movies.length == 0) {
            return "No data available";
        }
        
        int maxIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[maxIndex]) {
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }
}



