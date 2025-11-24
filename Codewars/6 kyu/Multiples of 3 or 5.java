public class Solution
{
    
    public
    int
    solution
    (
        int number
    )
    {
        int ans = 0;
        
        
        for
        (
            int i = 3
            ; i < number
            ; i ++
        )
        {
            
            if
            (
                i % 3 == 0
                || i % 5 == 0
            )
            {
                ans += i;
            }
            
        }
        
        
        return ans;
    }
    
}
