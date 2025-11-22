class Solution
{
    
    public
    int
    minConnect
    (
        int V
        , int [][] edges
    )
    {
        
        if
        (
            V - 1 > edges.length
        )
        {
            return -1;
        }
        
        ArrayList < HashSet < Integer > > arrayList = new ArrayList <> ();
        int ans = V - 1;
        
        
        for
        (
            int[] edge
            : edges
        )
        {
            int u = -1;
            int v = -1;
            
            
            for
            (
                int i = 0
                ; i < arrayList.size()
                ; i ++
            )
            {
                
                if
                (
                    arrayList.get( i ).contains( edge[0] )
                )
                {
                    u = i;
                    
                    break;
                }
                
            }
            
            
            for
            (
                int i = 0
                ; i < arrayList.size()
                ; i ++
            )
            {
                
                if
                (
                    arrayList.get( i ).contains( edge[1] )
                )
                {
                    v = i;
                    
                    break;
                }
                
            }
            
            
            if
            (
                u < 0
            )
            {
                
                if
                (
                    v < 0
                )
                {
                    arrayList.add( new HashSet <> () );
                    arrayList.getLast().add( edge[0] );
                    arrayList.getLast().add( edge[1] );
                }
                else
                {
                    arrayList.get( v ).add( edge[0] );
                }
                
            }
            else
            {
                
                if
                (
                    v < 0
                )
                {
                    arrayList.get( u ).add( edge[1] );
                }
                else if
                (
                    u < v
                )
                {
                    arrayList.get( u ).addAll( arrayList.remove( v ) );
                }
                else if
                (
                    u > v
                )
                {
                    arrayList.get( v ).addAll( arrayList.remove( u ) );
                }
                
            }
            
            
        }
        
        
        for
        (
            HashSet < Integer > set
            : arrayList
        )
        {
            ans -= set.size() - 1;
        }
        
        
        return ans;
    }
    
}
