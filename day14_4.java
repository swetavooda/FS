/**
Nehanth, a bubbly kid playing with digits and creating numbers using them.
The kid is creating the number called successive number. 
A number is called successive number, if and only if 
each digit in the number is one less than the next digit.

You are given two integers, start and end, both are inclusive.
Your task to find and print all the successive numbers in the given range (start, end).

Input Format:
-------------
Two space separated integers, start and end

Output Format:
--------------
Print the list of successive numbers in the range(start, end).


Sample Input-1:
---------------
50 150

Sample Output-1:
----------------
[56, 67, 78, 89, 123]


Sample Input-2:
---------------
100 600

Sample Output-2:
----------------
[123, 234, 345, 456, 567]
*/
import java.util.*;
class day14_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int l=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        successiveNumber(s,Integer.toString(s).length(),l,arr);
        System.out.println(arr);
    }
    public static void successiveNumber(int s, int len, int l, ArrayList<Integer> arr)
    {
        StringBuffer number = new StringBuffer();
        number.append(Integer.toString(s).charAt(0));

        String last=Character.toString(Integer.toString(s).charAt(0));
        s=Integer.parseInt(last);
        int flag=0;
        while(number.length()<len)
        {
            last=Integer.toString(Integer.parseInt(last)+1);
            if(last.length()==1)
                number.append(last);
            else
            {
                flag=1;
                break;
            }
        }
        if(Integer.parseInt(number.toString())>l || len>Integer.toString(l).length())return;
        if(s>=9 || flag==1){
            len++;
            s=1;
        }
        else s++;
        if(flag==0) 
            arr.add(Integer.parseInt(number.toString()));
        System.out.println(arr);
        successiveNumber(s,len,l,arr);
    }
}