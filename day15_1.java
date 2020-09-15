/**
Given a square board of n*n size, filled with n*n characters in the range ascii[a-z], 
Sort the characters of each row alphabetically, ascending.
Determine if the columns are also in ascending alphabetical order, top to bottom. 
Return "true", if they are 
Otherwise "false"

Input Format:
-------------
Line-1 : An integer n,Size of the board.
Next n lines: string of length n. 

Output Format:
--------------
Print a boolean value.

Sample Input-1:
---------------
5
ebacd
fghij
olmkn
trpqs
xywuv

Sample Output-1:
----------------
true


Sample Input-2:
---------------
5
ebacd
olmkn
fghij
trpqs
xywuv

Sample Output-2:
----------------
false
 */
import java.util.*;

class day15_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        char arr[][]=new char[n][n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            arr[i]=s.toCharArray();
            Arrays.sort(arr[i]);
            
        }
        System.out.println(isSorted(arr,n));
    }
    public static boolean isSorted(char[][] arr, int n)
    {
        char prev;
        for(int i=0;i<n;i++)
        {
            prev=arr[0][i];
            for(int j=0;j<n;j++)
            {
                if (arr[j][i]<prev) return false;
                prev=arr[j][i];
            }
        }
        return true;
    }
}