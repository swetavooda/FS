/**
Clavius, the person who suggested grouping of data using brackets.
He has suggested that the grouping should be well formed.
Well formed groupings are as follows, (), [], {}, {()}, {[]()}, {[]}(), etc.

You will be given a string S, return true if the string S is a well formed grouping, otherwise false.

Note: S contains only characters ( ) [ ] { }

Input Format:
-------------
A string S, contains only characters (){}[]

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
{[([])[]]}

Sample Output-1:
----------------
true

Sample Input-2:
---------------
{[([])[]}]

Sample Output-2:
----------------
false

 */
import java.util.*;
class day13_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<Character>(); 
        for(int i=0;i<s.length();i++)
        {
            
            if(stack.empty()==false && stack.peek()==map.get(s.charAt(i)))
            {
                stack.pop();
            }
            else
                stack.push(s.charAt(i));
        }
        System.out.println(stack.empty());
        
    }
}