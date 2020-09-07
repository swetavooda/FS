/**
The N Queen is the problem of placing N chess queens on an N×N chessboard,
so that no two queens attack each other. 

For example, following is a solution for 4 Queen problem.
0 1 0 0
0 0 0 1
1 0 0 0
0 0 1 0
Where, 1 indicates Queen, 0 indicates empty place.

Note: Strat from leftmost column.

Input:
A single integer N, size of chessboard. Where N>=4.

Output:
Print the solution as shown in sample.

Sample Input:
----------
4

Sample Output:
-----------
0 0 1 0
0 0 0 1
1 0 0 0
0 1 0 0

 */
 //Backtracking
 //n queens
import java.util.*;
class day11_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]= new int[n][n];         
        isQueen(0,board);    
         print(board);
        
    }
    public static void print(int board[][])
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }        
    }
    public static boolean isQueen(int n,int board[][])
    {
        int r=board.length;
        int c=board[0].length;
        if (n>=board.length)            
            return true;        
        
        for (int i=0;i<c;i++)
        {
            if(isFree(n,i,board))
            {
                board[n][i]=1;
                if(isQueen(n+1,board))                
                    return true;
                board[n][i]=0;
            }
        }
        return false;
    }
    public static boolean isFree(int i, int j, int board[][])
    {
        for( int r=0;r<board.length;r++)
        {
            if(board[r][j]==1)return false;
        }
        for(int c=0;c<board[0].length;c++)
        {
            if(board[i][c]==1)return false;
        }
        int r=i-1;
        int c=j-1;
        while(r>=0 && c>=0)  
        {
            if(board[r--][c--]==1)return false;
        }
        r=i+1;
        c=j+1;
        while(r<board.length && c<board[0].length)
        {
            if(board[r++][c++]==1)return false;
        }
        return true;
    }
}