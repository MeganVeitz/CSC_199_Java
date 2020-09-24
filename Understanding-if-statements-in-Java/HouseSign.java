// HouseSign.java - This program calculates prices for custom house signs.


public class HouseSign 
{
	public static void main(String args[])
	{
		// This is the work done in the housekeeping() method
		// Declare and initialize variables here.
			 // Charge for this sign.
        double charge = 35.00;
			 // Number of characters.
        int numChars = 8;
			 // Color of characters.
        String color = "gold";
			 // Type of wood.
        String woodType = "oak";

        final double EXTRA_CHAR = 4.0;
        final double OAK_CHARGE = 20.0;
        final double WOOD_COLOR = 15.0;
			 
		// This is the work done in the detailLoop() method
		// Write assignment and if statements here as appropriate.
        
        if (numChars > 5)
        {
            charge += EXTRA_CHAR * (numChars - 5);
        }
            

        if (color.equals("gold"))
        {   
            charge += WOOD_COLOR;
        }


        if (woodType.equals("oak"))
        {
            charge += OAK_CHARGE;
        }

		
		// This is the work done in the endOfJob() method	
		// Output Charge for this sign.
		System.out.println("The charge for this sign is $" + charge);

		System.exit(0); 
	}
} 	
