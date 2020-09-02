/**

The Teacher delcared the result ( marks[] ) of an exam conducted for N students. 
Roll Number of the students start from 0,1,2,...,N-1.
marks[i] indicates result of i-th student.

Initially all the students sit in a row according to thier Roll Numbers.
The Teacher requested, All the students who scored atleast one mark in the exam, sit together from the begining.
Those who scored 0 in the exam, sit in the end, according to their roll number.

Your task is to return the marks of the students according to their new seating order.

NOTE: 
You should use only one array.
Minimize the total number of operations.

Input Format:
-------------
List of space separated integers, indicates marks[]

Output Format:
--------------
Print the marks after seating order changed.


Sample Input:
---------------
0 1 0 3 12

Sample Output:
----------------
[1, 3, 12, 0, 0]
 */
 //Inplace O(n)
import java.util.*;
class day9_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int l[]=Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).toArray();
        int n=l.length;
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int pointer=0,marks;
        for(int i=0;i<n;i++)
        {
            if(l[i]!=0)
                 l[pointer++]=l[i];           
        }
        for(int i=pointer;i<n;i++)
            l[i]=0;
        System.out.print("[");
        System.out.print(l[0]);
        for(int i=1;i<n;i++)
        {
            System.out.print(", "+l[i]);
        }
        System.out.println("]");
    }
}