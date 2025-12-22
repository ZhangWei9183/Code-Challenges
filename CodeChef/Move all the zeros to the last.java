import java.util.*;




class Solution
{
    
    public
    void
    moveZeroes
    (
        int [] nums
    )
    {
        final int N = nums.length;
        int i = 0;
        
        
        for
        (
            int j = 0
            ; j < N
            ; j ++
        )
        {
            
            if
            (
                nums[j] != 0
            )
            {
                nums[i] = nums[j];
                i ++;
            }
            
        }
        
        
        Arrays.fill( nums, i, N, 0 );
    }
    
}
