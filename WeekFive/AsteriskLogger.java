package WeekFive;

import java.util.Scanner;

public class AsteriskLogger implements Logger {
	Scanner scanner = new Scanner(System.in);
	String result = scanner.next();

	@Override
	public void Error() {
		
		String answer = Asterisk("*", result.length());		
			
		System.out.println("**********"+ answer + "***");
		System.out.println("***Error: " + result + "***");
		System.out.println("**********"+ answer + "***");
	}

	@Override
	public void Log() {
		System.out.println("***"  + result + "***");
	
	}
public static String Asterisk( String word, int n) {
	
	if( word == null || word == "")	
		return word;
		String total = "";              
	       for ( int i=0;i<n;i++)        
	       {
	           total = total + word;
	       }
	 
	       return total;
	}	
}

