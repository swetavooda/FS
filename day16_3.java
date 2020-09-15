/**
You are given coins of different denominations and a total amount of money. 
Write a function to compute the fewest number of coins that you need to make up that amount. 
If that amount of money cannot be made up by any combination of the coins, return -1.

NOTE: Assume that you have unlimited coins of each denomination.

Input Format:
-------------
Line-1: Space separated integers coins[], value of unique denomination
Line-2: An integer amount, Total amount of money.

Output Format:
--------------
Print an integer, minimum number of coins to make of total amount.


Sample Input-1:
---------------
1 2 5
11

Sample Output-1:
----------------
3

Explanation:
------------
5+5+1 = 11


Sample Input-2:
---------------
2 4
15

Sample Output-2:
----------------
-1
 */
 //DP - tabulation(bottom up)
import java.util.*;
class day16_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int change[]=Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).toArray();
        int n=sc.nextInt();
        int coins=change.length;
        int dp[] = new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++)
            dp[i]=9999999;
        for(int c=0;c<coins;c++ )
            for(int i=change[c];i<=n;i++)
               dp[i]=Math.min(dp[i],dp[i-change[c]]+1);  
        
        if(dp[n]>=9999999)
            System.out.println(-1);
        else
            System.out.println(dp[n]);
    }
}