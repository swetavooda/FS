/**
In an institution there is a special keyboard.
    2 It contains only one row of 26-keys, keys[]
    3 
    4 The order of keys will be given, You need to findout the time taken to type a word.
    5 
    6 The rules to find the time is as follows:
    7 Initially you will be at first key .i.e, keys[0].
    8 To type a character, you have to move to a key having desired character, key[j].
    9 Time taken to type the character from key at ith index to key at jth index is |i - j|.
   10 
   11 NOTE: You have to use only one finger to type the word.
   12 
   13 Input Format:
   14 -------------
   15 Line-1 -> String contains 26 characters [a-z], should contain all characters
   16 Line-2 -> String  contains a word, character set is [a-z].
   17 
   18 Output Format:
   19 --------------
   20 Print an integer as your result.
   21 
   22 
   23 Sample Input-1:
   24 ---------------
   25 abcdefghijklmnopqrstuvwxyz
   26 code
   27 
   28 Sample Output-1:
   29 ----------------
   30 26
   31 
   32 Explanation:
   33 ------------
   34 The index moves from 0 to 2 to type 'c', 
   35 then from 2 to 14 to type 'o',
   36 then from 14 to 3 to type 'd',
   37 then from 3 to 4 to type 'e'.
   38 
   39 Total time = 2 + 12 + 11 + 1 = 26
   40 
   41 
   42 Sample Input-2:
   43 ---------------
   44 poiuytrewqasdfghjklmnbvcxz
   45 kmit
   46 
   47 Sample Output-2:
   48 ----------------
   49 39
   50 
   51 Explanation:
   52 ------------
   53 The index moves from 0 to 17 to type 'k', 
   54 then from 17 to 19 to type 'm',
   55 then from 19 to 2 to type 'i',
   56 then from 2 to 5 to type 't'.
   57 
   58 Total time = 17 + 2 + 17 + 3 = 39
   59 
 */

import java.util.*;
class day1_1
{
    public static void main(String args[])
    {
        String s;
        String c;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        c=sc.nextLine();
        int present=0,next=0,ans=0;
        for(int i=0;i<c.length();i++)
        {
            next=s.indexOf(c.charAt(i));

            ans+=(Math.abs(present-next));
            present=next;
        }
        System.out.println(ans);
    }
}