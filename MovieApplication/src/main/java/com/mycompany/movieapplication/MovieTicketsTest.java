/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.movieapplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsTest {
 
    private MovieTickets movieTickets = new MovieTickets();
    
    @Test
    void CalculateTotalSales_ReturnsExpectedTotalSales() {
        // Arrange
        int[] movieTicketSales = {1800, 1500, 1700};
        int expectedTotal = 5000;
        
        // Act
        int actualTotal = movieTickets.TotalMovieSales(movieTicketSales);
        
        // Assert
        assertEquals(expectedTotal, actualTotal);
    }
    
    @Test
    void TopMovieSales_ReturnsTopMovie() {
        // Arrange
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {5000, 6300}; // Oppenheimer has higher sales
        String expectedTopMovie = "Oppenheimer";
        
        // Act
        String actualTopMovie = movieTickets.TopMovie(movies, totalSales);
        
        // Assert
        assertEquals(expectedTopMovie, actualTopMovie);
    }
    
    @Test
    void TopMovieSales_WithEqualSales_ReturnsFirstMovie() {
        // Arrange
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {5000, 5000}; // Equal sales
        String expectedTopMovie = "Napoleon"; // Should return first one
        
        // Act
        String actualTopMovie = movieTickets.TopMovie(movies, totalSales);
        
        // Assert
        assertEquals(expectedTopMovie, actualTopMovie);
    }
}

