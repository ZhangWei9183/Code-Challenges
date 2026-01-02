class Solution
{

    func
    repeatedNTimes
    (
        nums: Array < Int64 >
    ): Int64
    {
        let hashSet = HashSet < Int64 > ()


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
                hashSet.add( num )
            }

        }


        return nums[0]
    }

}
