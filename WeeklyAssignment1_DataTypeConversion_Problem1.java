package weeklyAssingments;

public class WeeklyAssignment1_DataTypeConversion_Problem1 {

	public static void main(String[] args) {
		
		float floatmarks = 87.6F;
		System.out.println("Float Value: " + floatmarks);
		
		double doublemarks = floatmarks;
		System.out.println("Double Value: " + doublemarks);
		
		int intmarks = (int) doublemarks;
		System.out.println("Integer Value: " + intmarks);
		
		char charmarks = (char) intmarks;
		System.out.println("ASCII Value: " + charmarks);

	}

}
