import java.util.Scanner;

public class SecretWord
{
	public static void main( String[] args)
	{
		String secret = "please", guess;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "What is the secret word?");
		guess = keyboard.next();
		
		if (guess == secret )
		{
			System.out.println( "Impossible. (This will never be printed.)" );
		}
		
		if (guess.equals(secret) )
		{
			System.out.println("That's correct!" );
		}
		else
		{
			System.out.println("Nope, the secret word is not \"" + guess + "\".");
		}
	}
}