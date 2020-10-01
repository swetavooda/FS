/**
 * You have given flatland in the form of m*n grid,
The land conatins some ponds represented as 0,
and the land represented as 1.

Your task is to find the number of square-grids which contains no pond. 


Input Format:
-------------
Line-1: Two integers M and N.
Next M lines: N space separated integers.

Output Format:
--------------
Print an integer, number of square-grids.


Sample Input-1:
---------------
3 4
0 1 1 1
1 1 1 1
0 1 1 1

Sample Output-1:
----------------
15

Explanation:
------------
There are 10 square-grids of side length 1.
There are 4 square-grids of side length 2.
There is 1 square-grid of side length 3.

Total number of square-grids without a pond in it = 10 + 4 + 1 = 15.


Sample Input-2:
---------------
3 3
1 0 1
1 1 0
1 1 0

Sample Output-2:
----------------
7

Explanation:
------------
There are 6 square-grids of side length 1.
There is 1 square-grid of side length 2.
Total number of square-grids without a pond in it = 6 + 1 = 7.

 */
import java.util.*; 
class day24_3 { 
    public static int maxsquares(int[][]mat,int r,int c)
    {
        int dp[][]=new int[r+1][c+1];
        int sum=0;
        for(int i=1;i<r+1;i++){
            for(int j=1;j<c+1;j++){
                if(mat[i-1][j-1]==1){
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                }
                sum+=dp[i][j];
            }
        }
        return sum;
    }
	public static void main(String arg[]) 
	{ 
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        }
        System.out.println(maxsquares(mat,r,c));
    }
}