package ua.lviv.lgs;

public class Lesson_1_hw {
	
	public static void main(String[] args) {

		byte a = 2;
		short b = 3;
		int c = 4;
		double d = 3.5;
		char e = 'b';
		float f = 134F;
		long g = 236L;
		boolean j = false;

		System.out.println("Byte max = " + Byte.MAX_VALUE);
		System.out.println("Byte min = " + Byte.MIN_VALUE);
		System.out.println("Short max = " + Short.MAX_VALUE);
		System.out.println("Short min = " + Short.MIN_VALUE);
		System.out.println("Integer max = " + Integer.MAX_VALUE);
		System.out.println("Integer min = " + Integer.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);
		System.out.println("Double min = " + Double.MIN_VALUE);
		System.out.println("Character max = " + Character.MAX_VALUE);
		System.out.println("Character min = " + Character.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Long max = " + Long.MAX_VALUE);
		System.out.println("Long min = " + Long.MIN_VALUE);
		System.out.println("Boolean max = " + Boolean.TRUE);
		System.out.println("Boolean min = " + Boolean.FALSE);
		System.out.println();

		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {

			array1[i] = i;
		}

		for (int i = 0; i < array1.length; i++) {
			
			System.out.print(" " + array1[i]);

		}

		// min value
		int min = array1[0];
		for (int i = 0; i < array1.length; i++) {
			if (min > array1[i]) {
				min = array1[i];
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println(" minimal value " + min);
		
		
		// max value
				int max = array1[0];
				for (int i = 0; i < array1.length; i++) {
					if (max < array1[i]) {
						max = array1[i];
					}
				}
				System.out.println();
				System.out.println(" maximal value " + max);
	}
}


