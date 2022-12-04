package week3Week4_codingAssignment;

public class Wk3Wk4_CodingAssignment {

	public static void main(String[] args) {
//		#1
//		Create an array of int called ages that contains 
//		the following values: 3, 9, 23, 64, 2, 8, 28, 93
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//		#1a
//		Programmatically subtract the value of the first element in the array 
//		from the value in the last element of the array (i.e. do not use ages[7] 
//		in your code). Print the result to the console.
		
		System.out.println(ages[ages.length-1] - ages[0]);
		
//		#1b
//		Add a new age to your array and repeat the step above to ensure it is 
//		dynamic (works for arrays of different lengths)
		
		ages[1] = 13;
		
//		#1c
//		Use a loop to iterate through the array and calculate the average age. 
//		Print the result to the console
		
		int counter = 0;
		for (int age : ages) {
			counter = counter += age;
		}
		System.out.println(counter / ages.length);
		
//		#2
//		Create an array of String called names that contains the following values: 
//		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//		#2a
//		Use a loop to iterate through the array and calculate the average number 
//		of letters per name. Print the result to the console.
		double strCounter = 0;
		for (String name : names) {
			strCounter = strCounter += name.length();
		}
		System.out.println(strCounter / names.length);
		
//		#2b
//		Use a loop to iterate through the array again and concatenate all the names 
//		together, separated by spaces, and print the result to the console.
		String namesConcat = "";
		for (int i = 0; i < names.length; i++) {
			namesConcat += names[i] + " ";
		}
		System.out.println(namesConcat);
		
//		#3
//		How do you access the last element of any array?
		System.out.println(names[names.length-1]);
		
//		#4
//		How do you access the first element of any array?
		System.out.println(names[0]);
		
//		#5
//		Create a new array of int called nameLengths. Write a loop to iterate over 
//		the previously created names array and add the length of each name to the 
//		nameLengths array.
		
		int [] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
//		#6
//		Write a loop to iterate over the nameLengths array and calculate the sum of 
//		all the elements in the array. Print the result to the console.
		int lengthCounter = 0;
		for (int length : nameLengths) {
			lengthCounter += length;
		}
		System.out.println(lengthCounter);
		
//		**** METHOD PROOF ****
		
//		#7
		System.out.println(wordConcatenatedToItself("pudding", 3));
		
//		#8
		System.out.println(fullNames("John", "Smith"));
		
//		#9
		int [] newArray = new int[] {50, 50, 5};
		System.out.println(sumOfAllInts(newArray));
		
//		#10
		double [] newerArray = new double [] {25.25, 50.5, 75.75};
		System.out.println(averageOfAllElements(newerArray));
		
//		#11
		double [] arrayOne = new double [] {1.1, 2.2, 3.3};
		double [] arrayTwo = new double [] {4.4, 5.5, 6.6};
		System.out.println(whichArrayIsGreater(arrayOne, arrayTwo));
		
//		#12
		double money = 9.99;
		boolean temp = false;
		System.out.println(willBuyDrink(temp, money));
		
//		#13
		String [] stringArray = new String [] {"Christopher", "Lance", "Golden"};
		arrayPlusIndex(stringArray);
	}
		
//		**** METHODS****
//	
//		#7
//		Write a method that takes a String, word, and an int, n, as arguments and 
//		returns the word concatenated to itself n number of times. (i.e. if I pass in 
//		“Hello” and 3, I expect the method to return “HelloHelloHello”)
	
		public static String wordConcatenatedToItself(String word, int n) {
			String concatenatedWord = "";
			for (int i = 0; i < n; i++) {
				concatenatedWord += word;
				}
			return concatenatedWord;

			}
		
//		#8
//		Write a method that takes two Strings, firstName and lastName, and returns 
//		a full name (the full name should be the first and the last name as a String 
//		separated by a space).
		
		public static String fullNames (String first, String last) {
			String fullName = first + " " + last;
			return fullName;
		}
		
//		#9
//		Write a method that takes an array of int and returns true if the sum of 
//		all the ints in the array is greater than 100.
		
		public static boolean sumOfAllInts (int[] array) {
			int counter = 0;
			for (int number : array) {
				counter += number;
			}
			return counter > 100;
			}
		
//		#10
//		Write a method that takes an array of double and returns the average of all
//		the elements in the array.
		
		public static double averageOfAllElements (double[] array) {
			 double counter = 0;
			 for (double number : array) {
				 counter += number;
			 }
			 double average = counter / array.length;
			 return average;
		}
		
//		#11
//		Write a method that takes two arrays of double and returns true if the 
//		average of the elements in the first array is greater than the average 
//		of the elements in the second array.
		
		public static boolean whichArrayIsGreater (double[] firstArray, double[] secondArray) {
			double counterOne = 0;
			 for (double number : firstArray) {
				 counterOne += number;
			 }
			 double averageOne = counterOne / firstArray.length;
			 double counterTwo = 0;
			 for (double number : secondArray) {
				 counterTwo += number;
			 }
			 double averageTwo = counterTwo / secondArray.length;
			 return averageOne > averageTwo;
}
		
//		#12
//		Write a method called willBuyDrink that takes a boolean isHotOutside, 
//		and a double moneyInPocket, and returns true if it is hot outside and 
//		if moneyInPocket is greater than 10.50.
		
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			return ((moneyInPocket > 10.50) && (isHotOutside = true));
		}
		
//		#13 Create a method of your own that solves a problem. In comments, write what the 
//		method does and why you created it.
		
		public static void arrayPlusIndex (String[] arrayOfStrings) {
			for (int i = 0; i < arrayOfStrings.length; i++) {
				System.out.println("Index " + i + " is " + arrayOfStrings[i]);
			}
			
		}
}
