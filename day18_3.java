/**
 * Pranay is playing a single row word puzzle.
The Word Puzzle P contains a word, formed by using letter-blocks.
You are allowed to do only one operation:
	- You can remove a letter-block, and join 
	  the remaing letter-blocks into a single word.

Note: You cannot put back the removed letter-block.
And relative order of the letter-blocks has to be maintained.

Pranay is given a word W, and the word puzzle P,
You need to help Pranay, to check whether he can form the word W,
from the given word puzzle P.

Input Format:
-------------
Two strings W and P

Output Format:
--------------
Print a boolean value


Sample Input-1:
---------------
coder commander

Sample Output-1:
----------------
true


Sample Input-2:
---------------
memory memorial

Sample Output-2:
----------------
false

*/
import java.util.*;
class day18_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2=sc.next();
        int a=0,b=0;
        boolean flag=true;        
        while(a<s1.length() && b<s2.length())
        {            
            if(s1.charAt(a)==s2.charAt(b))
                a++;
            b++;
        }
        System.out.println(a==s1.length());
    }
}