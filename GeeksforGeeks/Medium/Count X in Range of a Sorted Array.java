import java.util.AbstractMap.SimpleImmutableEntry;




class Solution
{
    
    public
    ArrayList < Integer >
    countXInRange
    (
        int [] arr
        , int [][] queries
    )
    {
        final int n = arr.length;
        final ArrayList < Integer > answer = new ArrayList <> ();
        
        final HashMap < Integer, SimpleImmutableEntry < Integer, Integer > >
        hashMap = new HashMap <> ();


        for
        (
            int i = 0
            ; i < n
            ;
        )
        {
            int j = i + 1;
            
            
            while
            (
                j < n
                && arr[j] == arr[i]
            )
            {
                j ++;
            }
            
            
            hashMap.put( arr[i], new SimpleImmutableEntry <> ( i, j ) );
            
            i = j;
        }
        
        
        for
        (
            int [] query
            : queries
        )
        {
            final int x = query[2];
            
            if
            (
                !hashMap.containsKey( x )
            )
            {
                answer.add( 0 );
                
                continue;
            }

            final int l = query[0];
            final int r = query[1] + 1;
            final int start = hashMap.get( x ).getKey();
            final int end = hashMap.get( x ).getValue();

            if
            (
                start <= r
                &&
                end >= l
            )
            {
                answer.add( Math.min( r, end ) - Math.max( l, start ) );
            }
            else
            {
                answer.add( 0 );
            }
            
        }
        
        return answer;
    }
    
}
