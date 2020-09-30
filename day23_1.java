/**
 * There are N tokens, each token is numbered with any positive number.
Keep the same numbered tokens in a bag.

Your task is to print true, if and only if the number of tokens in each bag is unique.
Otherwise, print false.

Input Format:
-------------
Line-1: An integer N, number of tokens.
Line-2: N space separated integers, numbers printed on tokens.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
6
1 2 2 1 1 3

Sample Output-1:
----------------
true

Explanation:
------------
The bag of tokens numbered 1 has 3 tokens,
The bag of tokens numbered 2 has 2 tokens,
The bag of tokens numbered 3 has 1 tokens,
No two bags have the same number of tokens.


Sample Input-2:
---------------
3
1 2 3

Sample Output-2:
----------------
false

 */
import java.util.*;
class day23_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        Set<Integer> bags = new HashSet<Integer>();
        Set<Integer> coins = new HashSet<Integer>();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        for(int i:arr)
        {
            Integer j = hmap.get(i); 
            hmap.put(i, (j == null) ? 1 : j + 1); 
            bags.add(i);
        }
        for(Integer i:hmap.keySet())
        {
            coins.add(hmap.get(i));
        }
        System.out.println(bags.size()==coins.size());
    }
}