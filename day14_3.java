/**
Babylonian working on numbers, got a task to do. 
The task is, given two integers S, and X,
and S is the sum of (N pow X), where N > 0,

Please help Babylonian to find the number of ways to get S.

Input Format:
-------------
Two integers S and X.

Output Format:
--------------
Print an integer, the number of ways.

Sample Input-1:
---------------
10 2

Sample Output-1:
----------------
1

Explanation:
--------------
given x=2,
pow(1,2) + pow(3,2) = 1 + 9 = 10


Sample Input-2:
---------------
100 2

Sample Output-2:
----------------
3

Explanation:
--------------
given x=2,
pow(1,2) + pow(3,2) + pow(4,2) + pow(5,2) + pow(7,2) = 1 + 9 + 16 + 25 + 49 =100
pow(6,2) + pow(8,2) = 36 + 64 = 100
pow(10,2) = 100

Sample Input-3:
---------------
8 2

Sample Output-3:
----------------
0

Sample Input-4:
---------------
8 3

Sample Output-4:
----------------
1

Explanation: pow(2,3) = 8
 */
 //Recursion
import java.util.*;
class day14_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=sc.nextInt();
        int p=sc.nextInt();
        int total=0,i=1;
        ArrayList<Double> arr = new ArrayList<Double>();
        
        while(Math.pow(i,p)<=sum)
        {
            arr.add(Math.pow(i,p));   
            i++;         
        }
        System.out.println(subsets(sum,0,arr,0,0));       
        
    }
    public static int subsets(int sum,int k,ArrayList<Double> arr,double sumupto,int ans)
    {
        if(sumupto==sum)
            return ans+=1;
        for(int i=k;i<arr.size();i++)
        {
            if(sum>=sumupto+arr.get(i))
                ans=subsets(sum,i+1,arr,sumupto+arr.get(i),ans);
        }
        return ans;
    }
}