"""
There is a large gathering of Russian Military, all the soldiers formed as a grid of 0's and 1's.
Here, 0's indicates women soldiers, 1's indicates men soldiers.

Now, the commandant wants to find out the largest square of soldiers.
The square should contain only men soldiers on it's border.

If such largest square found, print the number of soldiers in it.
Otherwise, print 0.

Input Format:
-------------
Line-1 -> Two integers R and C, rows and columns
Next R lines -> C space separated integers 0's and 1's only.

Output Format:
--------------
Print an integer as output, the number of soldiers in largest square
Otherwise, print 0


Sample Input-1:
---------------
4 5
1 1 0 0 0
0 1 1 1 1
1 0 1 0 1
0 1 1 1 1

Sample Output-1:
----------------
9

Sample Input-2:
---------------
2 2
1 0 
0 1

Sample Output-2:
----------------
1

Sample Input-3:
-------------------
2 2
0 0 
0 0

Sample Output-3:
---------------------
0

"""
# Time complexity O(n*n*k)
# dynamic programming
r,c=map(int,input().split())
grid=[]
ver=[]
hor=[]
for i in range(0,r):
    l=list(map(int,input().split()))
    grid.append(l[0:])
    ver.append([0]*c)
    hor.append([0]*c)
    


for i in range(0,r):
    for j in range(0,c):
        if grid[i][j]==0:
            ver[i][j]=0
            hor[i][j]=0
        else:
            if i>0:
                ver[i][j]=ver[i-1][j]+1
            else:
                ver[i][j]=1
            if j>0:
                hor[i][j]=hor[i][j-1]+1
            else:
                hor[i][j]=1
max_square=0
for i in range(r-1,0,-1):
    for j in range(c-1,0,-1):
        smallest=min(ver[i][j],hor[i][j])
        while(max_square<smallest):
            if(ver[i][j-smallest+1]>=smallest and hor[i-smallest+1][j]>=smallest):
                max_square=smallest
            smallest-=1
print(max_square**2)
            
