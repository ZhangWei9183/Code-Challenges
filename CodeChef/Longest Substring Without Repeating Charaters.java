class Solution
{
    
    public
    int
    longestUniqueSubstring
    (
        String s
    )
    {
        HashSet < Character > hashSet = new HashSet <> ();
        int ans = 0;
        
        
        for
        (
            char c
            : s.toCharArray()
        )
        {
            
            if
            (
                hashSet.contains( c )
            )
            {
                hashSet = new HashSet <> ();
                hashSet.add( c );
            }
            else
            {
                hashSet.add( c );
                ans = Math.max( ans, hashSet.size() );
            }
            
        }
        
        
        return ans;
    }
    
}
