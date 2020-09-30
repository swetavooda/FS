/**You have given a keyboard has three rows of letters, 
each row has following letters:
Row-I:	 qwertyuiop
Row-II:	 asdfghjkl
Row-III: zxcvbnm

You are given a list of words,
Your task is to findout and print, the words that can be typed
using letters of only one row of the keyboard.


Input Format:
-------------
Space separated strings, list of words.

Output Format:
--------------
Print the list of words, typed using only one row of letters.
output  should be in the order of words.

Sample Input:
---------------
hello alaska dad peace

Sample Output:
----------------
[alaska, dad]
*/
import java.util.*;
class day23_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String rows[]= {"qwertyuiop","asdfghjkl","zxcvbnm"};
        String s= sc.nextLine();
        String[] arr = s.split(" "); 
        boolean flag=true;
        int count=0;
        ArrayList<String> ans = new ArrayList<String>();
        for(String i:arr)
        {
            flag=true;
            count=0;
            for(String row:rows)
            {
                flag=true;
                for(int c=0;c<i.length();c++)
                {
                    String temp=Character.toString(i.charAt(c));
                    if (row.contains(temp)==false)
                        flag=false;
                }
                if (flag) 
                    count++;
            }
            if(count==1)
                ans.add(i);
        }
        System.out.println(ans);        
    }
}