/**
Varun used to violate the Government rules 
The list of violations he made is represented in String S2
And list of traffic violations represented in String S1.

The characters in S1 indicates TrafficViolations, each character is a type of traffic violation.
The characters in S2 indicates All Violations, each cha is a type of violation.

Now your task is to find the number of traffic violations made by Varun.

NOTE: It is guaranteed that String S1 contains distinct characters.
And all the characters in both S1, S2 are case-sensitive.
i.e. 'a' is diffrent from 'A'.

Input Format:
-------------
Two strings S1 and S2

Output Format:
--------------
Print an integer, the number of traffic violations made by Varun.


Sample Input-1:
---------------
Aa aAAbbbb

Sample Output-1:
----------------
3

Sample Input-2:
---------------
abc  ABBCCC

Sample Output-2:
----------------
0

 */
 //two pointers solution
import java.util.*;
class day5_0
{
    public static void main(String args[])
    {
        String s,s1,s2;
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        String[] values=s.split(" ");
        char s1arr[]= values[0].toCharArray();
        char s2arr[]= values[1].toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        int ptr1=0,ptr2=0,count=0;
        while(ptr1<s1arr.length && ptr2<s2arr.length)
        {
            if (s1arr[ptr1]==s2arr[ptr2])
            {
                count+=1;
                ptr2++;
            }
            else if(s1arr[ptr1]<s2arr[ptr2])
            {
                ptr1++;
            }
            else if(s1arr[ptr1]>s2arr[ptr2])
            {
                ptr2++;
            }

        }
        System.out.println(count);
    }
}