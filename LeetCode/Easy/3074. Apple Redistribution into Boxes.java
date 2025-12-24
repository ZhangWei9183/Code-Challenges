class Solution
{

    public
    int
    minimumBoxes
    (
        int [] apple
        , int [] capacity
    )
    {
        Arrays.sort( capacity );
        final int appleSum = Arrays.stream( apple ).sum();
        int capacitySum = Arrays.stream( capacity ).sum();
        int i = 0;


        while
        (
            i < capacity.length
            && capacitySum - appleSum >= capacity[i]
        )
        {
            capacitySum -= capacity[i];

            i ++;
        }


        return capacity.length - i;
    }

}
