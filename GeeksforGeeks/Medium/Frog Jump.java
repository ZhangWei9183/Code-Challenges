class Solution
{
    
    int
    minCost
    (
        int[] height
    )
    {
        
        if
        (
            height.length < 2
        )
        {
            return 0;
        }
        
        int n = height.length;
        int[] arr = new int[n];
        arr[n - 2] = Math.abs( height[n - 1] - height[n - 2] );
        
        
        for
        (
            int i = height.length - 3
            ; i >= 0
            ; i --
        )
        {
            arr[i] = Math.min
            (
                Math.abs( height[i] - height[i + 1] ) + arr[i + 1]
                , Math.abs( height[i] - height[i + 2] ) + arr[i + 2]
            );
        }
        
        
        return arr[0];
    }
    
}
