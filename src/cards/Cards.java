/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Dil Bdr
 */
public class Cards {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
 // TODO code application logic here
 
          // Created a string to store the random five cards. 
        String[] fiveCards = new String[5];
        
        /**
         * List of stings.
         */
        String[] names = new String[]{ "ace", "two", "three", "four", "five", 
            "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        
        /// Created a boolean neamed found
         boolean found = false;
           /**
          Generating  random cards from the list.
            */
         Random rand = new Random();
            
            /** 
             * Generating five random cards from the list. 
             */
         for(int  i =0;i<5;i++){
              int n = rand.nextInt(12);
              fiveCards[i] = names[n];
           
        
                            }
         
            /**
             * making input object to take input.
             */
          Scanner input = new Scanner(System.in);
       
           // Getting input from user.
          String Userinput;
       
          //Asking user to input the card.
          System.out.print("Guess a card in my hand: ");
          Userinput = input.nextLine();       
        
        /**
        * Checking if the user input is same as the random cards we have. 
        * If the input car matches it will generate true or it will generate false
         */

         for(int j = 0; j< 5; j++){
   
              if (Userinput.equalsIgnoreCase(fiveCards[j])){
            
              found = true;
            
                }
             }
         if (found){
             System.out.println("\nI did have atleast one of those.");
         }
         else {
             System.out.println("\nSorry , I did not have any of those. ");
         }
         
         // Printing out the cards we generated randomy using for loop.
         System.out.println("\n These were my cards: ");
         
         for (int i = 0; i<5; i++){
        
             System.out.print(fiveCards[i]+" , ");
                         }
        
         
         
        } 
}
