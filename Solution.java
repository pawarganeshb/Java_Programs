import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static boolean flag = true;
	static int B, H;

	public static void main(String[] args) {
		String a[] = { "Ganesh", "Sandip", "Karan", "Omkar", "Avinash" };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.print("After the sorting: ");
		for (String string : a) {
			System.out.print(string+"\t");
			
		}

	}// end of main

}
// end of class
