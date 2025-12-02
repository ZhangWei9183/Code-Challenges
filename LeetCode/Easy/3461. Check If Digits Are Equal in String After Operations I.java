class Solution
{

    public
    boolean
    hasSameDigits
    (
        String s
    )
    {
        int[] nums = getNums( s );
        

        return solve( nums, nums.length - 1 );
    }




    int[]
    getNums
    (
        String s
    )
    {
        int[] nums = new int[s.length()];


        for
        (
            int i = 0
            ; i < s.length()
            ; i ++
        )
        {
            nums[i] = s.charAt( i ) - '0';
        }


        return nums;
    }




    boolean
    solve
    (
        int[] nums
        , int n
    )
    {

        if
        (
            n < 2
        )
        {
            return nums[0] == nums[1];
        }


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            nums[i] = ( nums[i] + nums[i + 1] ) % 10;
        }


        return solve( nums, n - 1 );
    }

}