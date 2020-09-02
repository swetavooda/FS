/**
Estar is an intelligent girl
She always send the information in endoded format.
For Example: 
String S= "meetingatbarista"
and integer N = 4, is number of rows.

She encode the string S as follows:
m  g  i
e na rs
ei  ta t
t   b  a

Now to obtain encoded S,  append all the characters row-wise, "mgienarseitattba".

Please help Estar with a program, to enode the given string S, based N value.

Input Format:
-------------
Line-1 -> An integer N.
Line-2 -> A String S

Output Format:
--------------
Print the encoded S.


Sample Input-1:
---------------
4
meetingatbarista

Sample Output-1:
----------------
mgienarseitattba


Sample Input-2:
---------------
3
canwecatchupforsometime

Sample Output-2:
----------------
cecfoiawcthposmtmnauree
 */
 //Timecomplexity O(n)
import java.util.*;
class day9_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        int i=0,count=0;                
        StringBuffer[] ans = new StringBuffer[n];
        for (i = 0; i < n; i++)
            ans[i] = new StringBuffer();          
        int flag=1;
        i=0;
        while(i<s.length())
        {
            if(flag==1)
            {
                ans[count++].append(s.charAt(i));                
                i++;                
            }
            if(count==n)
            {
                flag=0;
                count-=2;
                continue;
            }
            if(flag==0)
            {
                ans[count--].append(s.charAt(i));
                i++;
            }
            if(count==-1)
            {
                flag=1;
                count+=2;
            }            
        }
        for( i=0;i<n;i++)
        System.out.print(ans[i]);
    }
}