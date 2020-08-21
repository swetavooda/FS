/**
Given a container with N+1 balls with a number print on them.
Numbers are between 0 to N, there is no repetition of numbers.

A ball is missed from the container.
Your task is to findout the ball, and return the number printed on it.


Input Format:
-------------
Line-1 -> An integer N, number of balls are N+1.
Line-2 -> N space separated integers, Numbers on Balls.

Output Format:
--------------
Print an integer as output, Number on missing ball. 


Sample Input:
----------------
4
3 0 1 4

Sample Output:
------------------
2

 */

import java.util.*;
// TimeComplexity O(n)
class day2_1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n+1];
        int input;
        for(int i=1;i<=n;i++)
        {
            input=sc.nextInt();
            arr[input]=1;
            
        }
        for(int i=1;i<=n;i++)
        {
            if (arr[i]==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}