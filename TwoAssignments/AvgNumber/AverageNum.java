import java.io.*;
import java.util.Scanner; 

/**
   * AverageNum class that calculates the average number from the list of numbers.
   */
public class AverageNum
{
    
    public static void main(String[] args){
            
        // List of monthly rainfall values in decimal
        double [] list = {1.5,2.1,3.5,3.9,4.6};
        
        // Calling the calculateAverage method and passing the monthly rainfall array as an argument.
        calculateAverage (list);
            
    
    }
    
    /**
       * Method for calculating the average of the monthly rainfall array.
       */
    public static void calculateAverage(double [] list){
    
    double average = 0;
    double sum = 0;
    for (int i = 0; i<list.length; i++) {
            sum += list[i];
        }
        
    average = sum/list.length;
    System.out.println("The average monthly rainfall is "+average);
    
    }
    
    
}