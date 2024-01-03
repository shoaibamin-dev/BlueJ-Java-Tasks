/**
   * Player class that holds the credit, winnings, losses, rounds of the player.
   */

import java.util.ArrayList;

public class Player
{
    private String name = "";
    private int initialCredit, credit, wins, losses, winnings;
    // ArrayList to keep the track of the user history
    private ArrayList<String []> history = new ArrayList<String []>();
    // Initiate the player with the name and null credit.
    public void initiate(String _name)
    {
        this.name = _name;
        this.credit = 0;
        this.initialCredit = 0;
        this.wins = 0;
        this.losses = 0;
        this.winnings = 0;
        history = new ArrayList<String []>();
    }
    
    // Return the name of the player
    public String getName()
    {
        return this.name;
    }

    // If name is found (player exists) then return true else return false
    public Boolean nameExists()
    {
        if (name.trim().equals(""))
        {
            return false;
        }
        return true;
    }
    
    // Set initial credit for the player
    public void setCredit(int _credit)
    {
        if (this.credit > 0)
        {
            this.credit += _credit;
            this.initialCredit += _credit;
        }
        else 
        {
            this.credit = _credit;
            this.initialCredit = this.credit;
        }
    }
    
    // Adding more credit in the player's balance.
    public void addCredit(int _credit)
    {
        if ((this.credit + _credit) < 0)
        {
            this.credit = 0;
        }
        else 
        {
            this.credit += _credit;
        }
    }
    
    // Get the current credit (after winnings/losses)
    public int getCredit()
    {
        return this.credit;
    }
    
    // If player wins, add the record to the list with the winning amount
    public void incrementWins(int _winAmount)
    {
        this.wins += 1;
        history.add(new String [] { "Win",  String.valueOf(_winAmount) });
    }
    
    // If player loses, add the record to the list with the losing amount
    public void incrementLosses()
    {
        this.losses += 1;
        
        // If the current credit is below 5 then set credit to 0 (avoiding credits in negative). Else decrement the credit by 5.
        if ((this.credit - 5) < 0)
        {
            history.add(new String [] { "Loss", String.valueOf(this.credit) });
        }
        else
        {
             history.add(new String [] { "Loss", "-5" });
        }
        
    }
    
    // Function to display the complete stastics of the player
     public void displayStastics()
     {
        // Calculate total rounds
        int totalRounds = this.wins + this.losses;
        
        System.out.println("Player's Name : " + this.name);
        System.out.println("Rounds You Played : " + totalRounds);
        System.out.println("Total Rounds Won : " + (this.wins));
        System.out.println("Total Rounds Lost : " + (this.losses));
        if (totalRounds==0)
        {
            System.out.println("Overall Winning Ratio : 0.00");
        }
        else 
        {
            // Display the winning the ratio with 2 decimal places accuracy.
            System.out.println("Overall Winning Ratio : " + (Math.round((1.0 * this.wins) / totalRounds * 100.0) / 100.0));    
        }
        System.out.println("Your Current Balance : $" + (this.initialCredit));
        System.out.println("Your Winnings/Losses : " + (this.credit - this.initialCredit) + "$");
        System.out.println("Your Final Balance : $" + (this.credit));
        
        // If there is a record of the history then show the record.     
        if (history.size() != 0)
        {
            System.out.println("\n--> HISTORY <--");
            for (int i = 0; i < history.size(); i++)
            {
                String[] round = history.get(i);
                System.out.println("Round " + (i + 1) + ". Result : " + round[0] + ". Amount Won/Lost: " + round[1] + "$.");
            }
        }
    }
    
    
    
    
    
    
    
    
}

