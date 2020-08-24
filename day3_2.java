/**
Suman is interested in playing with kids,
Suman given a list of words to kids, and also two more words.

Suman asked the kids to find the minimum distance between the two words from the list of words.
Two words given may be same and they represent two individual words in the list.

Can you help the kids to findout the minimum distance between the two words from the list of words.

Note : You may assume two words are in the list.

Input Format:
-------------
Line-1 -> A Line of space separated words
Line-2 -> Two space separated Words W1, W2

Output Format:
--------------
Print the minimum distance between W1 and W2.


Sample Input-1:
---------------
practice makes you perfect
makes perfect

Sample Output-1:
----------------
2

Sample Input-2:
---------------
chef makes a cake using cake mix
cake cake

Sample Output-2:
---------------
2

Sample Input-3:
---------------
good bad worst good good bad bad
bad bad

Sample Output-3:
----------------
1

 */
 //TimeComplexity O(n)
import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String s,p;
        s = sc.nextLine();
        p = sc.nextLine();
        list=Arrays.asList(s.split(" "));
        List<String> words = new ArrayList<String>();
        words=Arrays.asList(p.split(" "));
        
        LinkedList<Integer> pos1 = new LinkedList<Integer>();
        LinkedList<Integer> pos2 = new LinkedList<Integer>();
        int min=1000000,k;
        for (int i=0;i<list.size();i++)
        {
            if(list.get(i).equals(words.get(0)))
            {
                pos1.add(i);
                if (pos2.size()>0)
                {
                    k=(Math.abs(pos1.getLast()-pos2.getLast()));
                     
                    if (k>0)
                    {
                        if (k<min)
                        {
                            min=k;
                            
                        }
                    }

                    else
                    {
                        if(pos1.size()>1)
                        {
                            k=(Math.abs(pos1.getLast()-pos2.get(pos2.size()-2)));
                            
                            if (k<min)
                            {
                                min=k;
                                
                            }
                        }
                    }
                    
                }
            }
            if(list.get(i).equals(words.get(1)))
            {
                pos2.add(i);
                
                if (pos1.size()>0)
                {
                    k=(Math.abs(pos2.getLast()-pos1.getLast()));
                     
                    if (k>0)
                    {
                        if (k<min)
                        {
                            min=k;
                            
                        }
                    }

                    else
                    {
                        if(pos2.size()>1)
                        {
                            k=(Math.abs(pos2.getLast()-pos1.get(pos1.size()-2)));
                            
                            if (k<min)
                            {
                                min=k;
                                
                            }
                        }
                    }
                    
                }
                
            }
            
        }
         
        System.out.println(min);

    }
}