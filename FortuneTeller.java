import java.util.Random;

public class FortuneTeller
{
	public static void main (String [] args)
	{
		String [] first = {"Today will be ", "This week should be ", "The outlook of your current project looks ", "Your chances in love look "};
		String [] second = {"good. You should certainly ", "bad. You should not ", "uncertain. If you must, be cautious if you ", "great! However, you should not ", "lukewarm. Now is not the time to "};
		String [] third = {"concentrate on your career at this time.", "spend time alone.", "depend on others.", "take some leisure time for yourself."};
		
		Random randomFirst = new Random();
		int index = randomFirst.nextInt(first.length);
		
		Random randomSecond = new Random();
		int index2 = randomSecond.nextInt(second.length);
		
		Random randomThird = new Random();
		int index3 = randomThird.nextInt(third.length);
		
		System.out.println(first[index] + second[index2] + third[index3]);
	}
}