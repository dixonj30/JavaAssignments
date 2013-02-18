
package rps;

import java.util.Random;
import java.util.Scanner;

public class RPS {

    public static void main(String[] args) 
    {
        int player_score = 0;
        int comp_score = 0;
        int tie_score = 0;
        Random generator = new Random(); // Random number generator
        char player_choice; // Player's input 
        int comp_choice; // computers randomly generated input
        int player_num = 0; // Converts the players_choice to a number for comparison
        String[] rps = { "Paper", "Rock", "Scissors" };
        // Circular array. 0 > 1 > 2 > 0
        
        
        Scanner in = new Scanner(System.in);
        
        while (true) // Main game loop. Looping until break
        {
           System.out.print("Choose: (P)aper, (R)ock, (S)cissors, (Q)uit");
           player_choice = in.nextLine().charAt(0); // Reading in next char
           System.out.println();
           player_choice = Character.toUpperCase(player_choice); // Converting to uppercase
           
           if (player_choice == 'Q') // Case: Player wants to quit
           {    
               break;
           }
           
           if ((player_choice != 'R') && (player_choice != 'S') &&
                (player_choice != 'P')) // Case: Player puts in a bad character
           {
               System.out.println("Bad input. Try again.");
               continue;
           }
           
           if (player_choice == 'P')
           {
               player_num = 0;
           }
           
           if (player_choice == 'R')
           {
               player_num = 1;
           }
           
           if (player_choice == 'S')
           {
               player_num = 2;
           }
           
           comp_choice = generator.nextInt(3); // Randomly choosing a num
           
           System.out.println("The computer throws " + rps[comp_choice]);
           
           if (player_num == comp_choice) // Case: They tie
           {
               System.out.println("Tie!");
               tie_score++;
               continue;
           }
           
           if (player_num == 2) // Case: player hits end of the array
           {
               if (comp_choice == 0) // Case: Comp threw a 0
               {
                   System.out.println("You win!");
                   player_score++;
                   continue;
               }    
           }
           
           if (comp_choice == 2) // Case: Same as above, but for computer
           {
               if (player_num == 0)
               {
                   System.out.println("You lose.");
                   comp_score++;
                   continue;
               }
           }
           
           if (player_num > comp_choice) // Case: Comp beats player
           {
               System.out.println("You lose.");
               comp_score++;
           }
           
           else if (comp_choice > player_num) // Case: Player wins
           {
               System.out.println("You win!");
               player_score++;
           }
         
        } // End while
      
        System.out.println("Game over!");
        System.out.println("You won " + player_score + " times.");
        System.out.println("The computer won " + comp_score + " times.");
        System.out.println("There were " + tie_score + " ties.");
        
    }
}
