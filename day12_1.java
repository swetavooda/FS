/**
Given a board of size n*n, filled with numbers.

Your task is to find the total sum of the the diagonal-1 numbers and diagonal-2 numbers in the board.
consider the intersection value of the two diagonals(if any) only once in total sum.

Input Format:
-------------
Line-1 -> An integer N, size of square board.
Next N lines -> N space separated integers 

Output Format:
--------------
Print the diagonal sum.


Sample Input-1:
---------------
3
1 2 3
4 5 6
7 8 9

Sample Output-1:
----------------
25

Explanation: diagonal-1 + diagonal-2 (exclude intersection-5) = (1+5+9) + (3+7) = 25

Sample Input-2:
---------------
4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4

Sample Output-2:
----------------
20

Explanation: diagonal-1 + diagonal-2 (no intersection) = (1+2+3+4) + (4+3+2+1) = 20
 */
import java.util.*;
class day12_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int i=0,j=0;
        while(i<n && j<n)
        {
            sum+=mat[i++][j++];
            
        }
        i=0;j=n-1;
        while(i<n && j>=0)
        {
            sum+=mat[i++][j--];
            
        }
        if(n%2==0)
        System.out.println(sum);
        else
        System.out.println(sum-mat[n/2][n/2]);
    }
}