/* Program Name: CollegeAdmission.java 
   Function: This program determines if a student will be admitted or rejected. 
   Input:  Interactive
   Output: Accept or Reject
*/  

import java.util.Scanner;
public class CollegeAdmission
{
   public static void main(String args[])
   {
    Scanner s = new Scanner(System.in);
    // Declare variables
     
    //String testScoreString;
    int testScore;

    //String classRankString; 
    int classRank;

     
     // Get input and convert to correct data type
     
    System.out.print("Enter student's test score: ");
    testScore = s.nextInt();
    //testScoreString = s.nextLine();
    //testScore = Integer.parseInt(testScoreString);

    System.out.print("Enter student's class rank: ");
    classRank = s.nextInt();
    //classRankString = s.nextLine();
    //classRank = Integer.parseInt(classRankString);


     // Test using admission requirements and print Accept or Reject 
     if( testScore >= 90 )
     {
	if( classRank >= 25)
        {
     	   System.out.println("Accept");
        }
	else
	   System.out.println("Reject"); 
     }
     else 
     {
	if( testScore >= 80 )
	{
	   if( classRank >= 50 )
	      System.out.println("Accept");
	   else
	      System.out.println("Reject");
	}
	else
	{
           if( testScore >= 70 )
	   {
		if( classRank >=75 ) 
		   System.out.println("Accept");
		else
		   System.out.println("Reject");
	   }
	   else
		System.out.println("Reject");
        }
      }
   } // End of main() method
   
} // End of CollegeAdmission class
