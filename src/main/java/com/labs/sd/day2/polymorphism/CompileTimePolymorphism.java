package com.labs.sd.day2.polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		/**
		 * COMPILE TIME POLYMORPHISM
		 */
		System.out.println(increment(2));

		//System.out.println(increment(2));

		//System.out.println(increment(2));

		//System.out.println(increment(2));

		//System.out.println(increment(2));

	}

	static int increment(int myNum) {
		// Returns integer incremented by 1
		return myNum + 1;
	}

	//NOTE - Only signature affects overloading not return types.
    /*int increment(int myNum) {
        // Returns integer incremented by 1
        return myNum + 1;
    }*/

	// Method 1 - Overloading - Same name - Change in type
	static double increment(double myNum) {
		// Returns double incremented by 1
		return myNum + 1;
	}


	// Method 2 - Overloading - Same name but with different number
	static int increment(int myNum, int by) { //change return type and no effect
		// Returns int incremented by
		return myNum + by;
	}

	// Method 2 - Overloading  With same name but with 2 double parameters
	static double increment(double myNum, int by) {

		return myNum + by;
	}

	// Method 2 - Overloading  With same name but with 2 double parameters
	static double increment(int myNum, double by) {

		return myNum + by;
	}


	// Method 2 - Overloading  With same name but with 2 double parameters
	static double increment(double myNum, double by) {
		return myNum + by;
	}

}
