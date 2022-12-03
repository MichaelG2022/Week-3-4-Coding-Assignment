package week3_4;

public class W3_4_CodingAssignment {

	public static void main(String[] args) {
		
//*************************************************************************

/* 	STEP 1.	Create an array of int called ages that contains the following values:
 * 			3, 9, 23, 64, 2, 8, 28, 93	*/
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
//*************************************************************************
		
/*	STEP 1.a.	Programmatically subtract the value of the first element in the array from the value in the last element of
 *				the array (i.e. do not use ages[7] in your code). Print the result to the console.	*/
		
		System.out.println("STEP 1.a. result:  " + (ages[ages.length - 1] - ages[0]));
		
//*************************************************************************
		
/*	STEP 1.b.	Add a new age to your array and repeat the step above to ensure it is dynamic
 * 				(works for arrays of different lengths).	*/
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 58};
		System.out.println("STEP 1.b. result:  " + (ages2[ages2.length - 1] - ages2[0]));
		
//*************************************************************************
		
/*	STEP 1.c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.	*/
		
		double sum = 0;
		for (int age : ages) {
			sum += age;
		} // end FOR
		System.out.println("STEP 1.c. result:  " + (sum / ages.length));

//*************************************************************************
		
/*	STEP 2.	Create an array of String called names that contains the following values:
 *			“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.	*/
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//*************************************************************************

/*	STEP 2.a.	Use a loop to iterate through the array and calculate the average number of letters per name.
 * 				Print the result to the console.	*/
		
		double stringLengthSum = 0;
		for (String name : names) {
			stringLengthSum += name.length();
		} // end FOR
		System.out.println("STEP 2.a. result:  " + (stringLengthSum / names.length));
		
//*************************************************************************

/*	STEP 2.b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces,
 *				and print the result to the console.	*/
		
		String nameConcat = "";
		for (String name : names) {
			nameConcat += name + " ";
		} // end FOR
		System.out.println("STEP 2.b. result:  " + (nameConcat));
		
//*************************************************************************		

/*	STEP 3.	How do you access the last element of any array?
 * 
 *	ANSWER: Type the name of the array, then inside the square brackets, use the .length property of an array
 *			and subtract one to set the index.
 *  
 * 		Example using the array called names that was created above:	*/
		System.out.println("STEP 3.   result:  " + (names[names.length - 1]));
		
//*************************************************************************

/*	STEP 4.	How do you access the first element of any array?
 * 
 * ANSWER:	Type the name of the array using index 0 inside the square brackets.
 * 
 *		Example using the array called names that was created above:	*/
		System.out.println("STEP 4.   result:  " + (names[0]));
		
//*************************************************************************

/*	STEP 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created
 *			names array and add the length of each name to the nameLengths array.	*/

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		} // end FOR
		
		System.out.print("STEP 5.   result:  ");
		for (int x = 0; x < nameLengths.length; x++) {
			System.out.print(nameLengths[x] + " ");
		} // end FOR
		System.out.println();		// carriage return		
		
//*************************************************************************		
		
/*	STEP 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
 *			Print the result to the console.	*/
 		
		int nameLengthSum = 0;
		for (int nameLength : nameLengths) {
			nameLengthSum += nameLength;
		} // end FOR
		System.out.println("STEP 6.   result:  " + (nameLengthSum));
		
//*************************************************************************

/*	STEP 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated
 * 			to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).	*/

		System.out.println("STEP 7.   result:  " + (multiplyString("Vicki", 4)));
		
//*************************************************************************

/*	STEP 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
 * 			(the full name should be the first and the last name as a String separated by a space).	*/
		
		String firstName = "Maynard";
		String lastName = "Ferguson";
		System.out.println("STEP 8.   result:  " + (makeFullName(firstName, lastName)));
		
//*************************************************************************

/*	STEP 9.	Write a method that takes an array of int and returns true if the sum of all the ints
 * 			in the array is greater than 100.	*/
		
		int[] intArray = {25, 25, 25, 25};
		System.out.println("STEP 9.   result:  " + (sumArray(intArray)));
		
//*************************************************************************
		
/*	STEP 10.	Write a method that takes an array of double and returns the average of all the elements in the array.	*/
		
		double[] doubleArray = {3.99, 9.24, 23.99, 64.54, 2.001, 8.5, 28.7, 93.0};
		System.out.println("STEP 10.  result:  " + (getAverage(doubleArray)));
		
//*************************************************************************
		
/*	STEP 11.	Write a method that takes two arrays of double and returns true if the average of the elements
 *				in the first array is greater than the average of the elements in the second array.	*/
		
		// arrays are similar to allow for testing
		double[] dblArray1 = {4.99, 9.24, 23.99, 64.54};
		double[] dblArray2 = {5, 9.24, 23.99, 64.54};
		System.out.println("STEP 11.  result:  " + (compareArrayAverage(dblArray1, dblArray2)));
		
//*************************************************************************		

/*	STEP 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
 * 				and returns true if it is hot outside and if moneyInPocket is greater than 10.50.	*/
		
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		System.out.println("STEP 12.  result:  " + (willBuyDrink(isHotOutside, moneyInPocket)));
		
//*************************************************************************
		
/*	STEP 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 * 			
 * 	The method I created takes the cost of a purchase and the sales tax rate in terms of the percent (%),
 * 	calculates the amount of tax on the cost, and returns the amount of the tax. Calculating the amount of sales tax
 * 	is a useful function and often needed.	*/
		
		double cost = 10.00;
		double taxRatePercentage = 7.25;
		double tax = calculateTax(cost, taxRatePercentage);
		System.out.print("STEP 13.  result:  ");
		System.out.println("With cost of $" + String.format("%.2f",cost) + ", tax is $" + String.format("%.2f",tax)
			+ " and total cost is $" + String.format("%.2f",(cost + tax)));
		
//*************************************************************************		
	
	} // end MAIN
	
//*************************************************************************
	
/*	STEP 7 METHOD.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated
 *					to itself n number of times.	*/
	
	public static String multiplyString(String word, int n) {
		String newString = "";
		for (int i = 0; i < n; i++) {
			newString += word;
		} // end FOR
		return newString;
	} // end multiplyString
	
//*************************************************************************
	
/*	STEP 8 METHOD.	Write a method that takes two Strings, firstName and lastName, and returns a full name
					(the full name should be the first and the last name as a String separated by a space).	*/
	
	public static String makeFullName (String first, String last) {
		return (first + " " + last);
	} // end makeFullName
	
//*************************************************************************
	
/*	STEP 9 METHOD.	Write a method that takes an array of int and returns true if the sum of all the ints
 *					in the array is greater than 100.	*/
	
	public static boolean sumArray(int[] intArray) {
		int sum = 0;
		for (int i : intArray) {
			sum += i;
		}
		return(sum > 100);
	} // end sumArray
	
//*************************************************************************
	
/*	STEP 10 METHOD.	Write a method that takes an array of double and returns the average of all the elements in the array.	*/

	public static double getAverage(double[] array) {
		double sum = 0;
		for (double numb : array) {
			sum += numb;
		} // end FOR
		return sum / array.length;
	} // end getAverage
	
//*************************************************************************
	
/*	STEP 11 METHOD.	Write a method that takes two arrays of double and returns true if the average of the elements
 *					in the first array is greater than the average of the elements in the second array.
 *
 *	I called the method created in STEP 10 rather than duplicate code.	*/

	public static boolean compareArrayAverage(double[] array1, double[] array2) {
		double avgArray1 = getAverage(array1);
		double avgArray2 = getAverage(array2);
		return avgArray1 > avgArray2;
	} // end compareArrayAverage

//*************************************************************************

/*	STEP 12 METHOD.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
 * 					and returns true if it is hot outside and if moneyInPocket is greater than 10.50.	*/

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return ( isHotOutside && moneyInPocket > 10.50);
	} // end willBuyDrink

//*************************************************************************

/*	STEP 13 METHOD.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 * 
 *	The method I created takes the cost of a purchase and the sales tax rate in terms of the percent (%),
 *	calculates the amount of tax on the cost and returns the amount of the tax.	Calculating the amount of sales tax
 * 	is a useful function and often needed.	*/

	public static double calculateTax(double cost, double taxRate) {
		return cost * (taxRate / 100);
	} // end

//*************************************************************************


} // end CLASS