/**
   * LuckyDipGenerator class generates, guess and shows the lucky number.
   */

public class LuckyDipGenerator
{
   // The variable that contains the luckyNumber
   private int luckyNumber = 0;
   
   // Method to set the lucky number between 1 - 50
   public void setLuckyNumber()
   {
        this.luckyNumber = 1 + (int)(Math.random() * 50);
       
   }
   
   // Method to check the lucky number, if the guessed number is the lucky number then return 0, if it is greater than the lucky number then return 1, else return -1.
   public int guessLuckyNumber(int number)
   {
       if (number == luckyNumber)
       {
            return 0;
        } 
       else if (number > luckyNumber)
       {
            return 1;
        } 
       else 
       {
            return -1;
        }
    
   }
   
   // Get the lucky number
   public int getLuckyNumber()
   {
        return this.luckyNumber;
    }
    
   // If the guessed number is within +-5 margin from the lucky number then return True else return False 
   public Boolean winWithInMargin(int guess)
   {
        if (guess <= (this.luckyNumber + 5) && guess >= (this.luckyNumber - 5))
        {
            return true;
        }
        return false;
    }
    
}
