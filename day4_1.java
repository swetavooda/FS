/**
Given a string S in encoded form, and  an integer array of string length.

You need find the decoded form of String S, 
by moving each character at ith position in S, to indices[i] position in decoded string.
and then print the decoded string.

Input Format:
-------------
Line-1 -> A String S, enocded string of length L
Line-2 -> L space separated integers arr[], where 0 <=arr[i] < L 

Output Format:
--------------
Print a String, decoded string.


Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4

Sample Output-1:
----------------
memorial

Explanation:
------------
Given String, aeilmmor
array is	6 1 5 7 2 0 3 4
after shifting,	memorial


Sample Input-2:
---------------
aidin
4 3 2 0 1

Sample Output-2:
----------------
india

Explanation-2:
--------------
Given String, aidin
array is	4 3 2 0 1
after shifting,	india

 */
//TimeComplexity O(n)
import java.util.*;
class day4_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;      
        s= sc.nextLine();
        int n=s.length();
        char arr[]= new char[n];
        int indx[]=new int[n];

        for (int i=0;i<n;i++)
        {
            indx[i]=sc.nextInt();   
        }
        
        for (int i=0;i<n;i++)
        {
            arr[indx[i]]=s.charAt(i);
        }
        String ans=new String(arr);
        System.out.println(ans);
        
    }
}