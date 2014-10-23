/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author Alex Gandhi
 * @version 23/10/14
 */
import java.util.Scanner;
public class PizzaPalace {
    
    
    public static void main(String[] args) {
        
        double numPeople = 0.0;
        double numSlices = 0.0;
        int slicesInPie = 0;
        double slicesTotal = 0;
       
        Scanner scn = new Scanner(System.in);
        System.out.println("How many people are eating pizza, the best food in the world? ");
        numPeople = scn.nextDouble();
        System.out.println("How many slices will each person have? ");
        numSlices = scn.nextDouble();
        System.out.println("How many slices are in one pizza pie? ");
        slicesInPie = scn.nextInt();
        
        slicesTotal = numPeople * numSlices;
        slicesTotal = slicesTotal / slicesInPie;
        
        System.out.println("You will need to buy " + Math.ceil(slicesTotal) + " pizza pies!");
        System.out.println("Thanks for choosing pizza counter, the only reliable source"); 
        System.out.println("that will count your pizza for you. Have a nice day!"); 
        
        
        
    }
    
}