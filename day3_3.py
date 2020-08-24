"""
Mohith and Rohith are good friends, They are used to chat very often.
Mohith is lazy to type the complete word, so he find a way to shorten the words.
For example,if the original word is "banana", he type it as "ba2[na]".

Can you help Rohith, to find the original word from the shorten word he received from Mohith .

NOTE: You may assume that the input string is always valid and does not contain any digits. 
No white spaces, brackets are well-formed.

Input Format:
-------------
A String S, shorten String

Output Format:
--------------
Print the Original String.


Sample Input-1:
---------------
ba2[na]

Sample Output-1:
----------------
banana


Sample Input-2:
---------------
2[takita]

Sample Output-2:
----------------
takitatakita


Sample Input-3:
---------------
3[3[sa]2[ri]]

Sample Output-3:  
----------------
sasasaririsasasaririsasasariri


Sample Input-4: 
---------------
abc3[cd]xyz

Sample Output-4: 
----------------
abccdcdcdxyz
"""
s=input()
stack = []
a, d = '', ''
for letter in s:
    if letter.isdigit():
        d+=letter
    elif letter.isalpha():
        a+=letter
    elif letter=='[':
        stack.append((a, int(d)))
        a, d = '', ''
    elif letter==']':
        p, n = stack.pop()
        print('#',p,n,a)
        a = p+a*n
    print(a,stack)
print(a)
