class Solution 
{
    
    public
    int
    searchInsertK
    (
        int arr []
        , int k
    )
    {
        int ans = Arrays.binarySearch( arr, k );
        
        if
        (
            ans < 0
        )
        {
            return ~ans;
        }
        else
        {
            return ans;
        }
    }
    
}
