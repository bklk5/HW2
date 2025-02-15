package HW2;

public class UploadQuestionTest{
	static int numPassed = 0;	// Counter of the number of passed tests
	static int numFailed = 0;	// Counter of the number of failed tests
	
	public static void main(String[] args) {
		/************** Test cases semi-automation report header **************/
		System.out.println("______________________________________");
		System.out.println("\nTesting Automation");

		/************** Start of the test cases **************/
		
		// case 1: This is a valid input with exactly 50 words
		String input50 = "abc ".repeat(50).trim();		// create a string with 50 words of "abc"
		performTestCase(1, input50, true);
		
		// case 2: This is a valid input with exactly 300 words
		String input300 = "abc ".repeat(300).trim();	// create a string with 300 words of "abc"
		performTestCase(2, input300, true);
		
		// case 3: Invalid input with 30 words (less than 50) 
		String inputLess50 = "abc ".repeat(30).trim(); 	// create a string with 30 words of "abc"
		performTestCase(3, inputLess50, false);
		
		// case 4: Invalid input with 301 words (more than 300) 
		String inputMore300 = "abc ".repeat(301).trim(); // create a string with 301 words of "abc"
		performTestCase(4, inputMore300, false);
		// Add more test cases here
		
		/************** End of the test cases **************/
		
		/************** Test cases semi-automation report footer **************/
		System.out.println("____________________________________________________________________________");
		System.out.println();
		System.out.println("Number of tests passed: "+ numPassed);
		System.out.println("Number of tests failed: "+ numFailed);
	}
	
	public static void performTestCase(int testCase, String inputText, boolean expectedPass) {
		System.out.println("____________________________________________________________________________\\n\\nTest case: " + testCase);
		System.out.println("Input: \"" + inputText + "\"");
		System.out.println("______________");
		System.out.println("\nQuestion input trace: ");
		
		/************** Call the recognizer to process the input **************/
		
		
	}
	
	
}

