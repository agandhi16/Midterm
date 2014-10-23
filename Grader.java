import java.util.Scanner;
 
 public class Grader {
   
   public static void main(String[] args) {
     
     double numTotalPoints = 0.0;
     double numMissedPoints = 0.0;
     double finalGrade = 0.0;
      
     Scanner scn = new Scanner (System.in);
     System.out.println("This program only works if you do not have a 100%");
     System.out.println("Enter the number of points possible on this exam: ");
     numTotalPoints = scn.nextDouble();
     System.out.println("Enter the number of points missed on this exam: ");
     numMissedPoints = scn.nextDouble();
     
     if (numMissedPoints >=0){
     
     finalGrade = (numTotalPoints - numMissedPoints) / numTotalPoints;
     System.out.println("Your final grade is "+finalGrade+"%");}
     
     else if 
     (numMissedPoints <0){
     
     System.out.println("Thank you -- have a great day!");}
     
   }
}