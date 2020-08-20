/**
There are two teams A and B with same N number of players.
Both the teams A and B have same set of jersey numbers for their players.

Both the teams stand in two lines opposite to each other from index 0...N-1.
Players from Team-A  in line-1 and Team-B in line-2.

You have to find an index mapping P, from A to B. 
A mapping P[i] = j means the jersey number of player[i] 
in Team-A appears in Team-B at index j.

The teams A and B may contain duplicate jersey numbers.
You need to return, lexicographically smallest order.

Input Format:
-------------
Line-1 -> An integer N, number of players in each team
Line-2 -> N space separated integers TeamA[], indicates jersey numbers.
Line-3 -> N space separated integers TeamB[], indicates jersey numbers.

NOTE: Inputs TeamA[] and TeamB[] are after standing in a line.

Output Format:
--------------
Print the index mappings P[].


Sample Input-1:
---------------
5
12 28 46 32 50
50 12 32 46 28

Sample Output-1:
----------------
1 4 3 2 0



Sample Input-2:
---------------
5
10 10 20 20 20
20 10 20 10 20

Sample Output-2:
----------------
1 3 0 2 4

 */
 //Time complexity O(n)

import java.util.*;
class day1_2
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        n=sc.nextInt();
        int arr1[]=new int[n],arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int  i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        HashMap<Integer, LinkedList<Integer>> indexes = new HashMap<Integer, LinkedList<Integer>>();
        for(int i=0;i<n;i++)
        {
            if (indexes.containsKey(arr2[i]))
            {
                LinkedList<Integer> l =indexes.get(arr2[i]);
                l.add(i);
                indexes.replace(arr2[i],l);
            }
            else
            {
                LinkedList<Integer> l= new LinkedList<Integer>();
                l.add(i);
                indexes.put(arr2[i],l);
            }
        }
        for (int i=0;i<n;i++)
        {
             //LinkedList<Integer> l=indexes.get(arr1[i]);
            System.out.print(indexes.get(arr1[i]).poll()+" ");
        }
    }
}