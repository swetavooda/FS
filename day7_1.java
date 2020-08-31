/**
In a contest, There are N people stand in a row, at positions 0,1,2,...,N-1.
The person at i-th  position in the row, assigned a number by the organizer number[i].

Initially, each person has zero credits with them.
Your task is to find number of credits each person will earn at the end.

Credits[i]=product of all numbers from number[], except number[i].

Note: Credits can be positive ,negative or remains zero.

Input Format:
-------------
A space separated integer array, number[]

Output Format:
--------------
Print an integer array, credits[].


Sample Input:
---------------
1 2 5 7

Sample Output:
----------------
70 35 14 10
 */
 
 //TimeCOmplexity O(n)
//without using division operator
import java.util.*;
class day7_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] splitArray = s.split(" ");
        int n=splitArray.length;
        int[] A = new int[n];
        for (int i=0;i<splitArray.length;i++)
        {
            A[i]=Integer.parseInt(splitArray[i]);
        }

		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = A[i - 1] * left[i - 1];
		}

		right[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right[j] = A[j + 1] * right[j + 1];
		}

		for (int i = 0; i < n; i++) {
			A[i] = left[i] * right[i];
			System.out.print(A[i]+" ");
		}
		
	}
}