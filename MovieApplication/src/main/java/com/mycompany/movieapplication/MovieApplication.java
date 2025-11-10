/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movieapplication;

/**
 *
 * @author lab_services_student
 */
public class MovieApplication {

    public static void main(String[] args) {
        // Initialize data
        String[] months = {"JAN", "FEB", "MAR"};
        String[] movies = {"Napoleon", "Oppenheimer"};
        
        // Two-dimensional array for ticket sales
        int[][] ticketSales = {
            {1800, 1500, 1700}, // Napoleon
            {3500, 1200, 1600}  // Oppenheimer
        };
        
        // Create MovieTickets instance
        MovieTickets movieTickets = new MovieTickets();
        
        // Calculate total sales for each movie
        int[] totalSales = new int[movies.length];
        for (int i = 0; i < movies.length; i++) {
            totalSales[i] = movieTickets.TotalMovieSales(ticketSales[i]);
        }
        
        // Generate report
        generateReport(months, movies, ticketSales, totalSales, movieTickets);
    }
    
    public static void generateReport(String[] months, String[] movies, 
                                    int[][] ticketSales, int[] totalSales, 
                                    MovieTickets movieTickets) {
        
        System.out.println("NOVEL TICKET SALES REPORT #01");
        System.out.println("==============================");
        
        // Print header
        System.out.print("            ");
        for (String month : months) {
            System.out.printf("%-8s", month);
        }
        System.out.println();
        
        // Print sales data
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-12s", movies[i]);
            for (int j = 0; j < months.length; j++) {
                System.out.printf("%-8d", ticketSales[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nTotal movie ticket sales for Napoleon: $" + totalSales[0]);
        System.out.println("Total movie ticket sales for Oppenheimer: $" + totalSales[1]);
        
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        System.out.println("Top performing movie: " + topMovie);
    }
}
