class Solution
{

    public
    int
    minimumOperations
    (
        int[] nums
    )
    {
        int ans = 0;


        for
        (
            int num
            : nums
        )
        {
            int m = num % 3;
            ans += Math.min( m, 3 -m );
        }


        return ans;
    }

}
