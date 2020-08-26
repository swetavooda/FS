/**
Due to COVID-19 impact, to attract people to watch the movies in theatre,
One of the Theatre management introduced a scheme 
to give mobiles for Lucky winners after the show.

The theatre has M rows and N seats in each row.
The seats are numbered in a strange order (No duplicates).

You need to find out the Lucky Winners  in such way that, the seat number of the person
should be the minimum in its row and maximum in its column.

You have to return all seat numbers of lucky winners .

Input Format:
-------------
Line-1 -> Two integers M and N
Next M lines -> N space separated integers, seat numbers.

Output Format:
--------------
Print the list of seat numbers of Lucky Winners.


Sample Input-1:
---------------
3 3
3 7 8
9 11 13
15 16 17

Sample Output-1:
----------------
15


Sample Input-2:
---------------
3 4
1 10 4 2
9 3 8 7
15 16 17 12

Sample Output-2:
----------------
12

 */
import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        int r,c,minp,min;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            min=arr[i][0];
            minp=0;
            for(int j=0;j<c;j++)
            {
                min=Math.min(min,arr[i][j]);
                if(arr[i][j]==min)
                    minp=j;
                
            }
            if(isLucky(arr,i,minp))
            {
                System.out.println(arr[i][minp]);
                break;
            }
        }
        
        
    }

    public static boolean isLucky(int[][] arr,int i,int j)
    {
        int num=arr[i][j];
        int max=num;
        for(int ip=0;ip<arr.length;ip++)
        {
            max=Math.max(arr[ip][j],min);
        }

        if(max==num)
            return true;
        return false;
        
    }
}