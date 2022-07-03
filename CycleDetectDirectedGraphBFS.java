

import java.util.*;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    int []indeg = new int[n+1];
      for(int i=1;i<=n;i++)
      {
            for(Integer it:edges.get(i))
            {
                indeg[it]++;
            }
      }
      Queue<Integer>q = new LinkedList<>();
      for(int i=1;i<=n;i++)
      {
            if(indeg[i]==0)
            {
                q.add(i);
            }
      }
      int count=0;
      while(!q.isEmpty())
      {
        Integer node = q.poll();
          count++;
          for(Integer it:edges.get(node))
          {
            indeg[it]--;
              if(indeg[it]==0)
                  q.add(it);
          }
      }
      return count!=n;
  }
}
