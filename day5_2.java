/**
Bantu has an habit of writing the content vertically

For example:
Given line is "AMUL BABY"
He will wrtie it as
	AB
	MA
	UB
	LY
	
You will be given a list of words. 
Your task is to print the words vertically like Bantu.

Return the words as a list of strings, complete with spaces when is necessary. 
(Trailing spaces are not allowed).

Note:
Each word in the list, should be in single column.

Input Format:
-------------
A string S, contains space separated words.

Output Format:
--------------
Print the the words as a list of strings.
As shown below.

Sample Input-1:
---------------
HOW ARE YOU

Sample Output-1:
----------------
HAY,ORO,WEU,

Explanation: 
------------
Each word is printed vertically. 
	 "HAY"
	 "ORO"
	 "WEU"


Sample Input-2:
---------------
TO BE OR NOT TO BE

Sample Output-2:
----------------
TBONTB,OEROOE,   T,

Explanation: 
------------
Trailing spaces is not allowed. 
	"TBONTB"
	"OEROOE"
	"   T"


Sample Input-3:
---------------
CONTEST IS COMING

Sample Output-3:
----------------
CIC,OSO,N M,T I,E N,S G,T,
 */
 

import java.util.*;
class day5_2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        List<String> arr = Arrays.asList(s.split(" "));
        List<String> ans= new ArrayList<String>();
        int max=0;
        for (int i=0;i<arr.size();i++)
        {    
            max=Math.max(max,arr.get(i).length());
        }
        String temp="";
        for(int j=0;j<max;j++)
        {
            temp="";
            for(int i=0;i<arr.size();i++)
            {
                if (arr.get(i).length()>j)
                {
                    temp+=arr.get(i).charAt(j);
                }
                else
                {
                    temp+=" ";
                }
            }
            ans.add(temp);
            temp="";
        }
        System.out.println(arr);
        System.out.println(ans);
        for(int i=0;i<ans.size();i++)
        {          
           
            System.out.print(removeTrailingSpaces(ans.get(i)));
            System.out.print(',');           
            
        }
    }
    public static String removeTrailingSpaces(String param) 
    {
        if (param == null)
            return null;
        int len = param.length();
        for (; len > 0; len--) {
            if (!Character.isWhitespace(param.charAt(len - 1)))
                break;
        }
        return param.substring(0, len);
    }
}