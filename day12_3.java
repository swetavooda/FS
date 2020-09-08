/**
Given a classic mobile phone, and the key pad of the phone looks like below.
  
  -------------------
  |  1  |  2  |  3  |
  |     | abc | def |
  -------------------		 
  |	 4  |  5  |	 6  |
  | ghi | jkl | mno |
  -------------------
  |	 7  |  8  |  9  |
  | pqrs| tuv | wxyz|
  -------------------	
  |	 *  |  0  |  #  |
  -------------------

You are given a string S contains digits between [2-9] only, 
For example: S = "2", then the possible words are "a", "b", "c".

Now your task is to find all possible words that the string S could represent.
and print them in a lexicographical order. 

Input Format:
-------------
A string S, consist of digits [2-9]

Output Format:
--------------
Print the list of words in lexicographical order.


Sample Input-1:
---------------
2

Sample Output-1:
----------------
[a, b, c]


Sample Input-2:
---------------
24

Sample Output-2:
----------------
[ag, ah, ai, bg, bh, bi, cg, ch, ci]
*/
//backtracking
import java.util.*;
class day12_3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(letterCombinations(s));
    }
public static List<String> letterCombinations(String digits) {
        HashMap<Character,String> hmap = new HashMap<Character,String>();
        hmap.put('2',"abc");
        hmap.put('3',"def");
        hmap.put('4',"ghi");
        hmap.put('5',"jkl");
        hmap.put('6',"mno");
        hmap.put('7',"pqrs");
        hmap.put('8',"tuv");
        hmap.put('9',"wxyz");
        ArrayList<String> ans = new ArrayList<String>();
        if (digits.length()==0)
            return ans;
        
        ArrayList<String> l = new ArrayList<String>();
        for(int i=0;i<digits.length();i++){
            l.add(hmap.get(digits.charAt(i)));
        }
        String s="";
        findAllComb(l,0,digits.length(),s,ans);
        return(ans);
    }
    public static void findAllComb(ArrayList<String>l,int ele,int n,String s,ArrayList<String> ans)
    {
        if(s.length()==n)
            ans.add(s);
            
        Character alphas;
        
        if(ele<l.size())
        {
            for(int i=0;i<l.get(ele).length();i++)
            {
                alphas=l.get(ele).charAt(i);
                s+=alphas;
                findAllComb(l,ele+1,n,s,ans); 
                s = s.substring(0, s.length() - 1);           
            }
        }        
        return;
    }
}
    