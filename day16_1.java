/**
Kelly is working on matrices, She likes to transform the matrices.
This time, She is given a square matrix size n*n, 
and transforming the given matrix by rotating clockwise.
For Example:
	Given matrix size=3, 
	1 2 3
	4 5 6
	7 8 9
	
	after rotating clockwise, matrix looks like:
	7 4 1
	8 5 2
	9 6 3
	
NOTE: Do not allocate another matrix and do the rotation.

Input Format:
-------------
Line-1: An integer n.
Next N lines: n space separated integers.

Output Format:
--------------
Print the transformed Matrix.


Sample Input-1:
---------------
4
5 1 9 11
2 4 8 10
13 3 6 7
15 14 12 16

Sample Output-1:
----------------
15 13 2 5
14 3 4 1
12 6 8 9
16 7 10 11
*/
import java.util.*;
class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]= new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        int t;
        for (int i=0;i<n/2;i++) 
        { 
            for (int j=i; j<n-i-1;j++) 
            {
                t=arr[i][j]; 
                arr[i][j] = arr[n-1-j][i]; 
                arr[n-1-j][i]=arr[n-1-i][n-1-j]; 
                arr[n-1-i][n-1-j]=arr[j][n-1-i]; 
                arr[j][n-1-i]=t; 
            } 
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
               System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}