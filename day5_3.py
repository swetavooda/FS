"""
UGC has given permission to conduct online classes.
Now the management has scheduled the classes in N time-slots in sorted order.
i.e, time-slot[i]=(s,e) where time 't' is between s<= t <e.

All of sudden, a meeting is scheduled in time-slot P.

Now the scheduled time slot P should be removed from existing time-slots.
And return a sorted list of time-slots after such removal.


Input Format:
-------------
Line-1 -> An integer N, number of time-slots.
next N lines -> two integers s and e, indicates a time-slot
Last line -> two integers s and e, indicates time-slot of the meeting.

Output Format:
--------------
Print the list of time-slots after removal, in a sorted order.

NOTE: 
The list of time-slots after removal may be empty also.
In such case print empty list.


Sample Input-1:
---------------
3
0 2
3 4
5 7
1 6

Sample Output-1:
----------------
[[0, 1], [6, 7]]


Sample Input-2:
---------------
1
0 5
2 3

Sample Output-2:
----------------
[[0, 2], [3, 5]]
 

"""
n=int(input())
oclass=[]
for i in range(0,n):
    l=list(map(int,input().split()))
    oclass.append(l)
start,end=map(int,input().split())
oclass.sort()
ans=[]
for i in oclass:
    s=i[0]
    e=i[1]
    if(e>start):
        if s<start:
            ans.append([s,start])
    else:
        ans.append([s,e])

    if end>s:
        if end<=e:
            ans.append([end,e])
    else:
        ans.append([s,e])
print(ans)            
