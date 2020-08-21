/**
Suman is playing with two strings S1 and S2. 
He wanted to check, whether S2 can be derived from S1 or not by replacing characters. 

If he is able to get S2 from S1, print true
Otherwise print false

Rule to replace the characters:
	- if a character A is replaced with another character B, 
	then all the occurrences of A in S1 should be replaced with B.
	
NOTE: You may assume both S1 and S2 have the same length.


Input Format:
-------------
Line-1 -> A string S1
Line-2 -> A string S2

Output Format:
--------------
Print a boolean value.


Sample Input-1:
-------------------
paper 
title

Sample Output-1:
---------------------
true

Explanation:
----------------
'p' is replaced with 't', 'a' is with 'i', 'e' is with 'l', and 'r' with 'e'.


Sample Input-2:
-------------------
memo 
demo

Sample Output-2:
---------------------
false

 */
 // TimeComplexity O(n)
import java.util.*;

class day2_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        System.out.println(getAns(s1,s2));
        
    }
    public static boolean getAns(String s1, String s2)
    {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0;i<s1.length();i++)
        {
            
            if(map.containsKey(s1.charAt(i))==false)
            {
                if (map.containsValue(s2.charAt(i)))
                    return false;
                map.put(s1.charAt(i),s2.charAt(i));

            }
            
            else
            {
                if ((map.get(s1.charAt(i)).equals(s2.charAt(i)))==false)
                {
                    return false;
                }
            }
        }
        return true;
    }
}