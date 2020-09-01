/**
Ramesh is working on addition of numbers, he picks 5 random numbers.
And adding 4 out of 5 numbers.
He wants to find out, the smallest sum and  largest sum possible.

Your task is to help Ramesh, and print the smallest and largest sums possible.

Input Format:
-------------
5 space separated integers.

Output Format:
--------------
Print the smallest sum and largest sum.


Sample Input-1:
---------------
1 2 3 4 5

Sample Output-1:
----------------
10 14


Sample Input-2:
---------------
7 5 12 9 10

Sample Output-2:
----------------
31 38
 */
 //time complexity O(n)
import java.util.*;
class day8_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        int sum=0;
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<5;i++)
        {
            sum+=arr[i];
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];            
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}