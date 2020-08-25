/* Gopal is a 12 year old boy.
He started writing a series of numbers in an abnormal way.

The series is looks like following:
For example, staring number is 23

- Next number in the series is, 
  count of digit groups like "one 2 and one 3', written as 1213.

- Next number in the series is, 
  count of digit groups like "one 1, one 2, one 1 and one 3', written as 11121113.

and so on.

You will be given two integers S, N, where S is the starting number of series, 
Find the N-th term in the series. 

Note: Each term of the series of integers will be represented as a string.

Input Format:
-------------
A string S and an integer N, S is a string of digits [0-9].
1 <= S < 10000
1 <= N <= 25 
Output Format:
--------------
Print an integer, the N-th term in the series starts with S.


Sample Input-1:
---------------
23 3

Sample Output-1:
----------------
11121113


Sample Input-2:
---------------
11 4

Sample Output-2:
----------------
111221

Explanation:
------------
S = 11
2nd term is "two 1s" -> "21",
3rd term is "one 2, one 1" -> "1211"
Finally 4th term is  "one 1, one 2, two 1s" -> "111221".
 */
//TImecomplexity O(n)
import java.util.*;
class day4_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int num=sc.nextInt();
        s=String.valueOf(num);
        int n=sc.nextInt();
        int i,j,count;
        String next="";
        for(int c=0;c<n-1;c++)
        {
            i=0;
            count=0;
            j=0;
            next="";
            while(i<s.length())
            {
                char current=s.charAt(i);
                j=i;
                count=0;
                while(j<s.length() && s.charAt(j)==current)
                {
                    count++;
                    j++;
                }
                next+=count;
                next+=current;
                i=j;
                count=0;
                
            }
            s=next;
            
        }
        System.out.println(s);
        
    }
}