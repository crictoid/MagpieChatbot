import java.util.Scanner;
public class MagpieRunnerBulmer
{

	public static void main(String[] args){
   
		// Create a new object called marge within the MagpieBulmer class.
      MagpieBulmer marge = new MagpieBulmer();
		
      // Create an object called user of the Scanner class, which is used to obtain user input.
		Scanner user = new Scanner (System.user);
      
      // Use the sayHello() method to call the dialogue to begin a conversation with the user
		System.out.println (marge.sayHello());
      
      // Create a string called input to store the user data using nextLine method to read the string.
		String input = user.nextLine();
		
      // Continue running the sayBack() method of the MagpieBulmer class and accepting new
      // input data until the user chooses to end the conversation by saying "goodbye".
		while (!input.equals("goodbye"))
		{
			// Continue to respond as long as the user continues inputting data.
         System.out.println (marge.sayBack(input));
			input = user.nextLine();
		}
	}

}