class Solution
{
    
    public
    int
    countLessEqual
    (
        int [] arr
        , int x
    )
    {
        final int head = getHead( arr );
        int first = Arrays.binarySearch( arr, 0, head, x + 1);
        
        if
        (
            first < 0
        )
        {
            first = ~first;
        }
        
        int second = Arrays.binarySearch( arr, head, arr.length, x + 1 );
        
        if
        (
            second < 0
        )
        {
            second = ~second;
        }
        
        
        return first + second - head;
    }
    
    
    
    
    int
    getHead
    (
        int [] arr
    )
    {
        int left = 0;
        int right = arr.length - 1;
        
        if
        (
            arr[0] < arr[right]
        )
        {
            return 0;
        }
        
        
        while
        (
            left < right
        )
        {
            final int mid = ( left + right ) / 2;
            
            if
            (
                arr[mid] > arr[mid + 1]
            )
            {
                return mid + 1;
            }
            else if
            (
                arr[mid] < arr[0]
            )
            {
                right = mid;
            }
            else
            {
                left = mid;
            }
            
        }
        
        
        return left;
    }
    
}
