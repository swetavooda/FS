/**
There is a board with M*N size. 
The board contains M*N blocks of 1*1 size.
Each block is printed a number on it.

You will be given a number, you need to find whether the number is printed on any of the blocks or not.
If found print true, otherwise print false.

NOTE: This numbers on the board in each row and each column are in increasing order.
And all the numbers are unique.

Input Format:
-------------
Line-1 -> Two integers M and N, board size.
Next M lines -> N space separated integers.
Last Line -> An integer T, number to search.

Output Format:
--------------
Print a boolean value, 'true' if number found.
otherwise, 'false'.


Sample Input-1:
---------------
4 4
1 3 6 10
2 5 9 13
4 8 12 16
7 11 14 17
5

Sample Output-1:
----------------
true


Sample Input-2:
---------------
4 4
1 3 6 10
2 5 9 13
4 8 12 16
7 11 14 17
15

Sample Output-2:
----------------
false
 */
 //TIme complexity O(n)
import java.util.*;
class day8_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        System.out.println(search(mat,s,r,c));

    }
    public static boolean search(int[][]mat, int s,int r, int c)
    {
        int i=0,j=c-1;
        while(i<r && j>=0)
        {            
            if(mat[i][j]==s)
            return true;
            else if(mat[i][j]>s)
            j--;
            else
            i++; 
        }
        return false;
    } 
}