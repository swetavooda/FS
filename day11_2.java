/**
Given an undirected graph of N nodes and  m colors, 
determine if the graph can be coloured with at most m colours 
such that no two adjacent vertices of the graph are colored with the same color. 
colors are numbered from 1 to M.
Here coloring of a graph means the assignment of colors to all vertices.

Input Format:
-----------
Line-1 -> Two integers N and M, N vertices and M colors
Next N lines -> N space separated integers (0,1) only.

Output Format:
-----------
Print the colors order, from vertex 0 vertex N-1.
If not possible, Print "No Solution";

Sample Input:
-------------
4 3
0 1 1 1
1 0 1 0
1 1 0 1
1 0 1 0

Sample Output:
------------
1 2 3 2


Sample Input:
-------------
4 3
1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 1

Sample Output:
-------------
No Solution
 */
 //Backtracking m colors problem
import java.util.*;
class day11_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();        
        int graph[][]= new int[n][n];    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=sc.nextInt();
            }
        }
        System.out.println(isColouring(graph,m));    

    }
    public static boolean isColouring(int graph[][],int m)
    {
        int color[]=new int[graph.length];
        return isgraphColoring(graph, m, color, 0);
    }
    public static boolean isgraphColoring(int graph[][],int m,int color[],int v)
    {
        int n=graph.length;        
        if (v==n)            
            return true;        
        
        for (int i=1;i<=m;i++)
        {
            if(isSafe(v,i,graph,color))
            {
                color[v]=i;
                if(isgraphColoring(graph,m,color,v+1))                
                    return true;
                color[v]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int v, int m, int graph[][], int color[])
    {
        for (int i = 0; i < graph.length; i++) 
        if (graph[v][i]==1 && m == color[i]) 
            return false; 
    return true;
        
    }
}