/**
Given a sorted list of integers E[], and two integers  L and U
Where L <= E[i]  <= U.

Your task is to find the ranges, which are not present in the given list
and print all the ranges

For example:
Given list is [ 1, 2, 4, 51, 52, 53, 92, 93, 94, 95 ] and L=1 U=100: 
The ranges which are not present are [3, 5->50, 54->91, 96->100]

Note: List E contain no duplicates.

Input Format:
-------------
Line-1 -> Space separated integers in sorted order

Output Format:
--------------
Print the list of ranges.


Sample Input-1:
---------------
0 1 2 3 4 5 8 9 10
0 20

Sample Output-1:
----------------
[6->7, 11->20]


Sample Input-2:
---------------
1 2 4 51 52 53 92 93 94 95
1 100

Sample Output-2:
----------------
[3, 5->50, 54->91, 96->100]
 

 */
import java.util.*;
class day6_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] splitArray = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<String> ans= new ArrayList<String>();
        for (int i=0;i<splitArray.length;i++)
        {
            arr.add(Integer.parseInt(splitArray[i]));
        }
        int start,end,last;
        int flag=0;
        start=sc.nextInt();
        last=sc.nextInt();
        if(start==arr.get(0))flag=1;
        end=start;
        
        for(int i=1;i<=last;i++)
        {
            if(arr.get(arr.size()-1)<i || arr.indexOf(i)<0)            
            {
                if(flag==1){
                start=i;
                end=-1;
                flag=0;
                }
                else{
                    end=i;
                    flag=0;
                }
            }
            else
            {
                if(flag==0)
                {
                    if (end==-1)
                    {
                        ans.add(String.valueOf(start));
                        start=-1;
                    }
                    else{
                        String t=start+"->"+end;
                    ans.add(t);
                    start=-1;
                    }
                }
                flag=1;
            }
        }
        if(start!=-1)
        {
           if (end==-1)
            {
                ans.add(String.valueOf(start));
                start=-1;
            }
            else{
                String t=start+"->"+end;
            ans.add(t);
            start=-1;
            } 
        }       

        System.out.println(ans);
    }
}