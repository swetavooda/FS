/**
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. 
By convention, 1 is included.

You are given a number n, the task is to find n-th Ugly number.

Input Format:
-------------
An integer N.

Output Format:
--------------
Print N-th Ugly Number.


Sample Input-1:
---------------
7

Sample Output-1:
----------------
8


Sample Input-2:
---------------
15

Sample Output-2:
----------------
24
*/
//dp tabulation
import java.util.*;
class Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dp[] = new int[n+1];
        int i=0;
        int j=0;
        int k=0;
        dp[0]=1;
        for(int p=1;p<n;p++)
        {
            int m2 = dp[i]*2;
            int m3 = dp[j]*3;
            int m5 = dp[k]*5;     
            dp[p]= Math.min(m2, Math.min(m3, m5));            
            if(dp[p]==m2)
                i++;     
            if(dp[p]==m3)
                j++;     
            if(dp[p]==m5)
                k++;
        }
        System.out.println(dp[n-1]);        
    }
}