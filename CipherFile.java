import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CipherFile
{
	public static void main ( String[] args ) throws Exception
	{
		Scanner fileIn = new Scanner(new File("text-to-cipher.txt"));
		Scanner keyboard = new Scanner( System.in);
		
		String phrase, cipher = "";
		int shift;
		PrintWriter fileout;
		
		phrase = fileIn.nextLine();
		fileIn.close();
		
		System.out.println(phrase);
		System.out.println("How many spaces to shift the characters? (0-26)");
		shift = keyboard.nextInt();
		
		for ( int i=0; i < phrase.length(); i++)
		{
			cipher += shiftLetter( phrase.charAt(i), shift );
		}
		System.out.println( cipher );
		
		fileout = new PrintWriter ( new FileWriter("newfilecipher.txt") );
		fileout.println( cipher );
		fileout.close();
	}
	
	public static char shiftLetter( char c, int n )
	{
		int ch = c;
		
		if ( ! Character.isLetter(c) )
			return c;
		
		ch = ch + n;
		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
		ch -= 26;
		if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a' )
		ch += 26;
		
		return (char)ch;
	}
}