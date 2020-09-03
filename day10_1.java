/**
Chota bheem loves to eat laddus, 
He is given N Boxes of laddus[], box-'a' has laddus[a].
He can choose two boxes having highest number of laddus each time, box-i and box-j, 
where  laddus[i] <= laddus[j].
	If laddus[i] == laddus[j] , then eat all the laddus from both boxes;
	If laddus[i] != laddus[j] , then eat all laddus from box-i, 
	and from box-j eat only (laddus[j]-laddus[i]) laddus.
	If the box becomes empty, remove the box.
	
At the end, there is at most 1 box left. Return the number of laddus left in that box (or 0 if there
are no boxes left.)


Input Format:
-------------
N space separated integers, number of laddus[i] in box[i]

Output Format:
--------------
Print number of the laddus left at the end.


Sample Input-1:
---------------
2 7 4 1 8 1

Sample Output-1:
----------------
1

Explanation:
------------
Boxes are numbered from 0,1,2,...,N-1.

Chota bheem selects, box-1 has 7 laddus and box-4 has 8 laddus eat 14 laddus, boxes becomes [2,4,1,1,1]
Chota bheem selects, box-0 has 2 laddus and box-1 has 4 laddus eat 4 laddus, boxes becomes [2,1,1,1]
Chota bheem selects, box-1 has 1 laddu and box-0 has 2 laddus eat 2 laddus, boxes becomes [1,1,1]
Chota bheem selects, box-0 has 1 laddu and box-1 has 1 laddu eat 2 laddus, boxes becomes [1]
Finally left with 1 box, box contains 1 laddu in it.
 */
 //Greedy, PriorityQueue
import java.util.*;
class day10_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int l[]=Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).toArray();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); 

        for(int i=0;i<l.length;i++)        
            pq.add(l[i]);        

        int max1,max2;        
        while(pq.size()>1)
        {
            max1=pq.poll();
            max2=pq.poll();
            if(max1!=max2)            
                pq.add(max1-max2);             
        }
        
        if(pq.size()>0)
        System.out.println(pq.peek());
        else
        System.out.println(0);
    }
}