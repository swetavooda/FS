/**
Given a sorted list of integers, 

Your task is to find the continuous range of numbers, make them as groups
and print all the groups as show in the sample testcases.

For example:
Given list is [ 1, 2, 3 ]: 1, 2, 3 is continuous range, grouped as 1->3
Given list is [ 1, 2, 4, 5, 7 ]: 1, 2 is continuous range, grouped as 1->2, 
4,5 grouped as 4->5, 7 is left alone.

Note: List contain no duplicates.

Input Format:
-------------
Line-1 -> Space separated integers in sorted order

Output Format:
--------------
Print the list of continuous range groups.


Sample Input-1:
---------------
1 2 4 5 7

Sample Output-1:
----------------
[1->2, 4->5, 7]

Explanation: 
------------
1,2 form a continuous range; 4,5 form a continuous range.


Sample Input-2:
---------------
1 2 3 5 6 7 9 10 12

Sample Output-2:
----------------
[1->3, 5->7, 9->10, 12]

Explanation: 
------------
1,2,3 form a continuous range 
5,6,7 form a continuous range
9,10 form a continuous range
 */
import java.util.*;
class day6_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] splitArray = s.split(" ");
        int[] arr = new int[splitArray.length];
        ArrayList<String> ans= new ArrayList<String>();
        for (int i=0;i<splitArray.length;i++)
        {
            arr[i]=Integer.parseInt(splitArray[i]);
        }
        int start=arr[0],end=arr[splitArray.length-1];
        int prev=start;
        for(int i=1;i<splitArray.length;i++)
        {
            if (arr[i]==prev+1){
            end=arr[i];
            prev=end;
            }
            else
            {
                if(start<end)
                {
                    String t=start+"->"+end;
                    ans.add(t);

                }
                else
                ans.add(String.valueOf(start));
                
                start=arr[i];
                prev=start;               
            }            
        }
        
        if(end>start)
        {
            String t=start+"->"+end;
            ans.add(t);
        }
        else
            ans.add(String.valueOf(start));
                
        System.out.println(ans);
    }
}