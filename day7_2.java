/**
You will be given the matrix of size R*C,

You have to return the matrix in special order as shown in the sample tescases.
 

Input Format:
-------------
Line-1 -> Two integers R and C, size of matrix.
Next R-Lines -> C space separated integers

Output Format:
--------------
Print R-Lines -> C space separated integers, in special order.


Sample Input-1:
---------------
3 3
1 2 3
4 5 6
7 8 9

Sample Output-1:
----------------
1 2 3
6 9 8
7 4 5


Sample Input-2:
---------------
3 4
1 2 3 4
5 6 7 8
9 10 11 12

Sample Output-2:
----------------
1 2 3 4
8 12 11 10
9 5 6 7

 */
import java.util.*;
class day7_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int mat[][]= new int[r][c];
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        List<Integer> list = new ArrayList<>();
        spiral(mat,r,c,0,0,list);
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(list.get(i*c+j)+" ");
            }
            System.out.println();
        }
        

    }
    public static void spiral(int[][] mat,int rows, int cols,int r, int c, List<Integer> list)
    {
        
        if(rows<=0 || cols<=0) return;
        if(rows==1 || cols == 1){
            if(rows==1){
                for(int i=0;i<cols;i++){
                    list.add(mat[r][c+i]);
                }
            }else{
                for(int i=0;i<rows;i++){
                    list.add(mat[r+i][c]);
                }
            }
            return;
        }
        int rowNumber = r; int colNumber = c;
        for(int i=0;i<cols;i++){
            colNumber = c+i;
            list.add(mat[r][colNumber]);
        }
        rows--;
        for(int i=1;i<=rows;i++){
            rowNumber = r + i;
            list.add(mat[rowNumber][colNumber]);
        }
        cols--;
        for(int i=cols-1;i>=0;i--){
            colNumber = colNumber - 1;
            list.add(mat[rowNumber][colNumber]);
        }
        rows--;
        for(int i=rows-1;i>=0;i--){
            rowNumber = rowNumber-1;
            list.add(mat[rowNumber][colNumber]);
        }
        cols--;
        spiral(mat,rows,cols,rowNumber, colNumber+1,list);
    }
}