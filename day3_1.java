/**
Ramesh is given an array of N numbers L[] and another number K, 
Your task is to delete all the occurences of K in the L[], 
and return the length of L[] after deleting.

You should use only array L[] and Do not allocate extra space for another array.


Input Format:
-------------
Line-1 -> Two integers N and K
Line-2 -> N space separeted integers L[]

Output Format:
--------------
Print the length of L[] after deleting occurences of K in L[].


Sample Input-1:
---------------
5 3
1 3 2 2 3

Sample Output-1:
----------------
3

Sample Input-2:
---------------
10 2
1 4 4 6 2 3 2 2 3 5
	
Sample Output-2:
----------------
7

*/
//Time complexity O(n)
import java.util.*;
class day3_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,num,count=0;
        n=sc.nextInt();
        num=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==num)
            {
                count++;
            }
        }
        System.out.println(arr.length-count);
        
    }
}