class Solution
{

    func
    repeatedNTimes
    (
        nums: Array < Int64 >
    ): Int64
    {
        let hashSet = new HashSet < Int64 > ();


        for
        (
            num
            in
            nums
        )
        {
            if
            (
                hashSet.contains( num )
            )
            {
                return num;
            }
            else
            {
                hashset.add( num );
            }

        }


        return nums[0];
    }

}
