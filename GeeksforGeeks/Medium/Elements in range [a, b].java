class Solution
{
    
    public
    ArrayList < Integer >
    cntInRange
    (
        int [] arr
        , int [][] queries
    )
    {
        Arrays.sort( arr );
        final ArrayList < Integer > answer = new ArrayList <> ();
        
        
        for
        (
            final int [] query
            : queries
        )
        {
            final int left = binarySearch( arr, query[0] );
            final int right = binarySearch( arr, query[1] + 1 );
            answer.add( right - left );
        }
        
        
        return answer;
    }
    
    
    
    private
    int
    binarySearch
    (
        int [] arr
        , int target
    )
    {
        int left = 0;
        int right = arr.length;
        
        
        while
        (
            left < right
        )
        {
            final int mid = ( left + right ) / 2;
            
            if
            (
                arr[mid] < target
            )
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
            
        }
        
        
        return left;
    }
    
}
