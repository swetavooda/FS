/*
Given D decks of C cards each, each card numbered from 1,2,3,..C.
You have to pick a card in random from each deck, and 
find the sum of the numbers on cards selected.

If the sum is equals the target, you can say "Target Achieved".

Return the number of ways W, that makes you to say "Target Achieved".

Note: W is modulo of 1000000007
 
Input Format:
-------------
Three integers D, C, and Target.

Output Format:
--------------
Print the value of W, W modulo 1000000007

Sample Input-1:
---------------
1 6 3

Sample Output-1:
----------------
1

Explanation: 
--------------
You select one card from the deck of 6 cards.  
There is only one way to get a sum of 3.

Sample Input-2:
---------------
2 6 7

Sample Output-2:
----------------
6

Explanation: 
--------------
You select one card each from two decks, each deck has 6 cards.  
There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.


Sample Input-3:
---------------
2 5 10

Sample Output-3:
----------------
1

Explanation: 
--------------
You select one card each from two decks, each deck has 5 cards.  
There is only one way to get a sum of 10: 5+5.

Sample Input-4:
---------------
1 2 3

Sample Output-4:
----------------
0

Explanation: 
--------------
You select one card from the deck of 2 cards.  There is no way to get a sum of 3.

*/
//Dynamic programming 
import java.util.*;
class day4_3
{
    public static void main(String args[])
    {
        int decks,cards,target;
        Scanner sc = new Scanner(System.in);
        decks=sc.nextInt();
        cards=sc.nextInt();
        target=sc.nextInt();
        int[][] dp =new int[decks+1][target+1];
        dp[0][0]=1;        
        for(int i=1;i<=decks;i++)
        {
            for(int j=0;j<=target;j++)
            {
                for(int k=1;k<=cards;k++)
                {
                    if(j-k>=0)
                    {
                        dp[i][j]=dp[i][j]+dp[i-1][j-k];
                    }
                }                
            }
        }
        System.out.println(dp[decks][target]);


    }
}