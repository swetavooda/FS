/*
In an Youngsters-Health Event girls from ABC school and 
boys from XYZ school are formed in a line.
All the boys stand in frontside b1,b2,b3,...,bn.
All the girls stand in backside g1,g2,g3,....,gn.
And the line looks like, b1,b2,b3,...,bn,g1,g2,g3,...,gn.

You are given a 2N list of integers, first N integers indiactes boys roll numbers,
last N integers indiactes girls roll numbers.

Now, you need transform their positions like below:
b1,g1,b2,g2,b3,g3,.......,bn,gn.

And print the updated list after transform their positions.


Input Format:
-------------
Line-1: An integer N, 2*N students.
Line-2: 2*N space separated integers, student roll numbers.

Output Format:
--------------
Print the list of 2*N integers.


Sample Input-1:
---------------
3
2 5 1 3 4 7

Sample Output-1:
----------------
2 3 5 4 1 7

Explanation: 
------------
Given list, b1 =2, b2 =5, b3 =1, g1 =3, g2 =4, g3 =7 
the answer is [2,3,5,4,1,7].

Sample Input-2:
---------------
4
1 2 3 4 3 4 2 1

Sample Output-2:
----------------
1 3 2 4 3 2 4 1
**/
import java.util.*;
class day18_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<2*n;i++)
            arr.add(sc.nextInt());
        int s=0,p=n;
        int temp=0,count=0;
        while(count<n)
        {
            temp=arr.get(s);
            arr.add(temp);
            arr.remove(s);
            p--;
            arr.add(arr.get(p));
            arr.remove(p);
            count++;
        }
        System.out.println(arr);
    }
}