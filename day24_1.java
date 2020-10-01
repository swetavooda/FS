/**
 * A digit sum is the sum of all the digits of a number.
e.g., 123=> 1 + 2 + 3 => 6, So, digit sum of 123 is 6.

You are given an integer N. 
Find the digit sum of each number from 1 to N.
And group them according to their digit sum.

Your task is to find and print the number of groups have the largest size.

Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer, number of groups with largest size.

Sample Input-1:
---------------
13

Sample Output-1:
----------------
4

Explanation:
------------
There are 9 groups formed: [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. 
There are 4 groups having largest size-2.


Sample Input-2:
---------------
24

Sample Output-2:
----------------
5

 */
import java.util.*; 
class day24_1 { 
    public static int digitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
	public static void main(String arg[]) 
	{ 
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        Integer dsum,value;
        int maxValue=0;
        for(int i=1;i<=n;i++)
        {
            dsum = digitSum(i);
            value = hmap.get(dsum);
            hmap.put(dsum, (value == null) ? 1 : value + 1);
            maxValue=Math.max(maxValue,hmap.get(dsum));
        }
        int count=0;
        for(Integer i:hmap.keySet())
        {
            System.out.println(i+" "+hmap.get(i));
            if (hmap.get(i)==maxValue)
                count++;
        }
        System.out.println(count);
    }
}
