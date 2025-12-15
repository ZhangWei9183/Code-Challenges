public static
int
findMaxConsecutiveOnes
(
    int [] nums
)
{
    int ones = 0;
    int ans = 0;
    
    
    for
    (
        int num
        : nums
    )
    {
        
        if
        (
            num == 1
        )
        {
            ones ++;
            ans = Math.max( ans, ones );
        }
        else
        {
            ones = 0;
        }
        
    }
    
    
    return ans;
}
