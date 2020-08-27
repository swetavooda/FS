/* 
Write a program to perform the stack operations
push(), pop(), top(), and retrieving the minimum element in time.

The order of operations are:
1. void push(int E) -- Inset element E onto stack.
2. void pop() -- Delete the element on top of the stack.
3. int top() -- Print the top element.
4. int getMin() -- Print the minimum element in the stack.
0. to Stop the execution.

Input Format:
-------------
	-	Each Line consist of Operation number from the list [ 1, 2, 3, 4, 0 ], 
		and list of space separated parameters if any.
	for better understanding check sample testcases.
	
Output Format:
--------------
Print integer output in new line.


Sample Input-1:
---------------
1 -2
1 0
1 -3
4
2
3
4
0

Sample Output-1:
----------------
-3
0
-2
 */

 //Using only one stack to find min without auxilary datastructure
 //Time complexity of operations O(1)
import java.util.*;
class day6_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int inp,min=Integer.MAX_VALUE;
        inp=sc.nextInt();
        Stack<Integer> arr = new Stack<Integer>();
        LinkedList<Integer> ans = new LinkedList<Integer>();
        while(inp!=0)
        {
            switch(inp)
            {
                case 1:
                    {
                        int p;
                        p=sc.nextInt();                        
                        if(p<min)                        
                            arr.push(min);
                        arr.push(p);
                        
                        min=Math.min(min,p);
                        break;
                    }
                case 2:
                    {
                        if(arr.peek()==min)
                        {
                            arr.pop();
                            min=arr.pop();
                        }
                        else
                            arr.pop();
                        break;
                    }
                case 3:
                    {
                        ans.add(arr.peek());
                        break;
                    }
                case 4:
                    {
                        ans.add(min);
                        break;
                    }
                
                
            }
            inp=sc.nextInt();
        }
        for(Integer i:ans)
            System.out.println(i);
    }
}