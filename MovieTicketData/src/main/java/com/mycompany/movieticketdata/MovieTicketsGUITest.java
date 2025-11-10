/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketdata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsGUITest {
    
    private MovieTicketsGUI movieTickets = new MovieTicketsGUI();
    
    @Test
    void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        // Arrange
        int numberOfTickets = 3;
        double ticketPrice = 100.0;
        double expectedTotal = 342.0; // 3 * 100 = 300 + 14% VAT = 342
        
        // Act
        double actualTotal = movieTickets.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);
        
        // Assert
        assertEquals(expectedTotal, actualTotal, 0.01);
    }
    
    @Test
    void ValidationTests_ValidData_ReturnsTrue() {
        // Arrange
        MovieTicketData validData = new MovieTicketData("Napoleon", 3, 100.0);
        
        // Act
        boolean isValid = movieTickets.ValidateData(validData);
        
        // Assert
        assertTrue(isValid);
    }
    
    @Test
    void ValidationTests_EmptyMovieName_ReturnsFalse() {
        // Arrange
        MovieTicketData invalidData = new MovieTicketData("", 3, 100.0);
        
        // Act
        boolean isValid = movieTickets.ValidateData(invalidData);
        
        // Assert
        assertFalse(isValid);
    }
    
    @Test
    void ValidationTests_InvalidTicketCount_ReturnsFalse() {
        // Arrange
        MovieTicketData invalidData = new MovieTicketData("Napoleon", 0, 100.0);
        
        // Act
        boolean isValid = movieTickets.ValidateData(invalidData);
        
        // Assert
        assertFalse(isValid);
    }
    
    @Test
    void ValidationTests_InvalidTicketPrice_ReturnsFalse() {
        // Arrange
        MovieTicketData invalidData = new MovieTicketData("Napoleon", 3, -50.0);
        
        // Act
        boolean isValid = movieTickets.ValidateData(invalidData);
        
        // Assert
        assertFalse(isValid);
    }
}

