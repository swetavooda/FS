/**
 * Your playing a game, the game contains m*n grid.
Each cell in the grid represent an health score.
You can move one step either downwads or rightwards only.
Whenever you visit a cell in the grid, you will lose the same health score of the cell.

You will start at (0,0) cell of the grid and have to reach (m-1)*(n-1) cell.
Your task is to minimize the loss of overall health score.

Input Format:
-------------
Line-1: Two integers M and N.
Next M lines: N space separated integers, health points in each row of the grid.

Output Format:
--------------
Print an integer, minimal loss of overall healthscore.


Sample Input-1:
---------------
3 3
1 3 1
1 5 1
4 2 1

Sample Output-1:
----------------
7

Explanation:
------------
start at cell(0,0) =>  1→3→1→1→1 minimizes the loss of healthscore.


Sample Input-2:
---------------
4 4
8 6 9 3
7 6 2 1
5 5 7 9
8 9 6 2

Sample Output-2:
----------------
34

Explanation:
------------
start at cell(0,0) =>  8→6→6→2→1→9→2 minimizes the loss of healthscore.

 */
import java.util.*;
class day27_3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][] = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        int dp[][]= new int[r+1][c+1];
        dp[0][0]=mat[0][0];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(i!=0 || j!=0)
                   dp[i][j]=Math.min(i-1>=0?dp[i-1][j]:99999,j-1>=0?dp[i][j-1]:99999)+mat[i][j];
    
        System.out.println(dp[r-1][c-1]);
    }
}
