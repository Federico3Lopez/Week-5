package WeekFive;

import java.util.Scanner;

public class SpacedLogger implements Logger {
	Scanner scanner = new Scanner(System.in);
	String myWord = scanner.next();
	@Override
	public void Error() {

		StringBuilder th = new StringBuilder(myWord);
		for (int i=1; i<th.length(); i+=2)
		    th.insert(i, ' ');
		System.out.println("Error: " + th.toString());
	}
	@Override
	public void Log() {
		// TODO Auto-generated method stub
		StringBuilder th = new StringBuilder(myWord);
		for (int i=1; i<th.length(); i+=2)
		    th.insert(i, ' ');
		System.out.println( th.toString());
	}

}
