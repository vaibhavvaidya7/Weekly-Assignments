package weeklyAssingments;

public class WeeklyAssignment2_ASCII_Program2 {

	public static void main(String[] args) {
		
		char charvalue = (char) 'T';
		System.out.println("Entered Character: " + charvalue);
		
		int intvalue = charvalue;
		System.out.println("ASCII Value for Entered Character: " + intvalue);
		
		int addvalue = intvalue+5;
		System.out.println("ASCII Value after adding 5: " + addvalue);
		
		char newcharvalue =  (char) addvalue;
		System.out.println("New Character: " + newcharvalue);

	}

}
