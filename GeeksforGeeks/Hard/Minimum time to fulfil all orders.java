class Solution
{
    
    public
    int
    minTime
    (
        int [] ranks
        , int n
    )
    {
        TreeMap < Long, Long > map = new TreeMap <> ();
        long left = 1;
        long right = Long.MAX_VALUE;
        
        
        for
        (
            long i = 0
            ; i <= n
            ; i ++
        )
        {
            map.put( i * ( i + 1 ), i );
        }
        
        
        while
        (
            left < right
        )
        {
            final long mid = left + right;
            long d = 0;
            
            for
            (
                final int rank
                : ranks
            )
            {
                d += map.floorEntry( mid / rank ).getValue();
            }
            
            
            if
            (
                d < n
            )
            {
                left = ( mid / 2 ) + 1;
            }
            else
            {
                right = mid / 2;
            }
            
        }
        
        
        return ( int ) ( left );
    }
    
}
