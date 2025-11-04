class Solution
{
    
    public
    ArrayList < Integer > safeNodes
    (
        int V
        , int[][] edges
    )
    {
        HashMap < Integer, ArrayList < Integer > > graph = new HashMap <> ();
        HashMap < Integer, Boolean > safeMap = new HashMap <> ();
        ArrayList < Integer > ans = new ArrayList <> ();
        
        
        for
        (
            int[] edge
            : edges
        )
        {
            
            if
            (
                !graph.containsKey( edge[0] )
            )
            {
                graph.put( edge[0], new ArrayList <> () );
            }
            
            graph.get( edge[0] ).add( edge[1] );
        }
        
        
        for
        (
            int i = 0
            ; i < V
            ; i ++
        )
        {
            if
            (
                !graph.containsKey( i )
                || dfs( graph, safeMap, new HashSet < Integer > (), i )
            )
            {
                ans.add( i );
            }
            
        }
        
        
        return ans;
    }
    
    
    
    
    boolean
    dfs
    (
        HashMap < Integer, ArrayList < Integer > > graph
        , HashMap < Integer, Boolean > safeMap
        , HashSet< Integer > visited
        , int i
    )
    {
        
        if
        (
            !graph.containsKey( i )
        )
        {
            return true;
        }
        else if
        (
            safeMap.containsKey( i )
        )
        {
            return safeMap.get( i );
        }
        else if
        (
            visited.contains( i )
        )
        {
            return false;
        }
        
        visited.add( i );
        
        
        for
        (
            Integer j
            : graph.get( i )
        )
        {
            
            if
            (
                visited.contains( j )
                || !dfs( graph, safeMap, visited, j )
            )
            {
                safeMap.put( i, false );
                
                
                return false;
            }
            
        }
        
        
        visited.remove( i );
        safeMap.put( i, true );
        
        
        return true;
    }
    
}
