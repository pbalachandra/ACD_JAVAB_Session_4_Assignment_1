/* ACD_JAVAB_Session_4_Assignment_1_Main : 
 * Print reverse of an array */

package session4;

import java.util.Arrays;

public class ACD_JAVAB_Session_4_Assignment_1_Main 
{
	public static void main(String[] args) 
	{
		int[] original = {1,2,3,4,5};
		int[] reverse = new int[original.length];
		for (int i = 0; i<original.length; i++)
		{
			reverse[i] = original[original.length-1-i];	
		}
		System.out.println("Original Array : " + Arrays.toString(original));
		System.out.println("Reversed Array : " + Arrays.toString(reverse));
	}
}

/* OUTPUT

Original Array : [1, 2, 3, 4, 5]
Reversed Array : [5, 4, 3, 2, 1]

*/
