// Mark Bulmer - CSC 151 - 3-27-2022

// Create class MagpieBulmer which is a primitive chatbot with minimal functionality.

public class MagpieBulmer
{
	// The standard greeting in string "sayHello" which begins the conversation with a user.
	public String sayHello()
	{
		return "Hi, how are you doing today?";
	}

	// sayBack provides appropriate replies to the user according to specific keywords retrieved by using 
	// indexOf to search each string for a specific substring of text. 
	public String sayBack(String input)
	{
		String reply = ""; // Start with an empty string

		if (input.indexOf("happy") >= 0 || input.indexOf("well") >= 0 || input.indexOf("good") >= 0) 
		{
			reply = "I am glad, what makes you feel like this?";
		} else if (input.indexOf("bad") >= 0 || input.indexOf("sick") >= 0) 
		{
			reply = "I am really sorry, what's got you down?";
		} else if (input.indexOf("work") >= 0 || input.indexOf("working") >= 0 || input.indexOf("school") >= 0) 
		{
			reply = "Maybe you need a vacation. Beach, mountains, or city?";
		} else if (input.indexOf("Beach") >= 0 || input.indexOf("beach") >= 0) 
		{
			reply = "I love the sand and waves, what about you?";
		} else if (input.indexOf("Mountains") >= 0 || input.indexOf("mountains") >= 0) 
		{
			reply = "I love to hike, what about you?";
			} else if (input.indexOf("City") >= 0 || input.indexOf("city") >= 0) 
		{
			reply = "I love to shop and sight-see, what about you?";
		} else if (input.indexOf("Yes") >= 0 || input.indexOf("yes") >= 0) 
		{
	    	reply = "I like that positivity! Won't you be my friend?";
	    } else if (input.indexOf("No") >= 0 || input.indexOf("no") >= 0) 
		{
	    	reply = "Don't be so negative all the time. Won't you be my friend?";
		} else if (input.indexOf("Try") >= 0 || input.indexOf("try") >= 0 || input.indexOf("trying") >= 0) 
		{
	    	reply = "Do or do not, there is no try.";
		} else if (input.indexOf("Apple") >= 0 || input.indexOf("apple") >= 0 || input.indexOf("apples") >= 0) 
		{
	    	reply = "My favorite apple is Granny Smith, what's your favorite?";
		} else if (input.indexOf("Red Delicious") >= 0 || input.indexOf("Fuji") >= 0 
					|| input.indexOf("McIntosh") >= 0 || input.indexOf("Granny Smith") >= 0) 
		{
	    	reply = "That's a great apple!";
		} else if (input.indexOf("Banana") >= 0 || input.indexOf("banana") >= 0 || input.indexOf("bananas") >= 0) 
		{
	    	reply = "I don't like bananas, and I don't like you.";
	    } else if (input.trim().length() == 0) // For an empty input statement.
		{
	    	reply = "Silence is golden, but don't you have anything to say?";
	    } else 
		{
			reply = sayAnything(); // If no appropriate reply, then apply random reply.
		}
		return reply; // Provide reply to user.
	}

	// If an appropriate keyword is not detected, then a random reply is provided to the user in order
	// to continue the conversation more naturally.
	private String sayAnything()
	{
		final int replies = 10; // Set the number of replies available to select.
		double anything = Math.random(); // Generate a random number
		int pickAnything = (int)(anything * replies); // Chooses a random number that fits within "replies"
		
		String reply = ""; // Start with an empty string.

		if (pickAnything == 0)
		{
			reply = "You seem pretty swell, contrary to all I've heard about you!";
		}
		else if (pickAnything == 1)
		{
			reply = "As they always say, there's more than one way to skin a cat.";
		}
		else if (pickAnything == 2)
		{
			reply = "Sorry, could you repeat that a little louder?";
		}
		else if (pickAnything == 3)
		{
			reply = "You are a veritable font of knowledge.";
		}
		else if (pickAnything == 4)
		{
			 reply = "Nice weather we're having, right?"
		}
		else if (pickAnything == 5)
		{
			reply = "I read the news today, oh boy!";
		}
		else if (pickAnything == 6)
		{
			reply = "What's good for the goose is good for the gander, or so I've been told.";
		}
		else if (pickAnything == 7)
		{
			reply = "Wow, that's amazing! What's your favorite fruit?";
		}
		else if (pickAnything == 8)
		{
			reply = "You can say that again.";
		}
		else if (pickAnything == 9)
		{
			reply = "I'm getting a little annoyed with you.";
		}
		return reply; // Return the reply to the user.
	}
}