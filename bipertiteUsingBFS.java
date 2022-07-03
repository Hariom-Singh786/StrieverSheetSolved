
import java.util.ArrayList;
import java.util.*;
public class Solution {
	public static boolean isBipartite(ArrayList<ArrayList<Integer>> graph, int vertices, int edges) {
		int []color= new int[vertices];
        for(int i=0;i<vertices;i++)
        {
            color[i]=-1;
        }
        for(int i=0;i<vertices;i++)
        {
            if(color[i]==-1)
            {
                if(!biper(i,color,graph))
                    return false;
            }
        }
        return true;
	}
    static boolean biper(int i, int []color,ArrayList<ArrayList<Integer>> graph )
    {
         Queue<Integer>q= new LinkedList<>();
        q.add(i);
        color[i]=1;
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            for(Integer it:graph.get(node))
            {
                if(color[it]==-1)
                {
                    color[it]=1-color[node];
                    q.add(it);
                }
                else if(color[it]==color[node])
                    return false;
            }
        }
        return true;
    }
}
