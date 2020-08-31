/**
In a colony drinking water is supplied through water tanks.
There is a big queue of N buckets, He need to fill all the N buckets in the queue.
The supplier can fill one bucket or two buckets at a time.

Print the number of distinct ways he can fill all the buckets.

Input Format:
-------------
An integer N, number of buckets in the queue.

Output Format:
--------------
Print the number of ways to fill all the buckets.


Sample Input-1:
---------------
2

Sample Output-1:
----------------
2

Explanation:
------------
There are two ways to fill the buckets.
1. 1 bucket + 1 bucket
2. 2 buckets


Sample Input-2:
---------------
4

Sample Output-2:
----------------
5

Explanation:
------------
There are five ways to fill the buckets.
1. 1 bucket + 1 bucket + 1 bucket + 1 bucket
2. 1 bucket + 1 bucket + 2 buckets 
3. 1 bucket + 2 buckets + 1 bucket
4. 2 buckets + 1 bucket + 1 bucket
5. 2 buckets + 2 buckets
 */
 //Time Complexity O(n)
 //Fibonacci 
import java.util.*;
class day7_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        for (int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println(b);
    }
}