class Solution
{

    func
    maxProfit
    (
        prices: Array < Int64 >
        , strategy: Array < Int64 >
        , k: Int64
    )
    : Int64
    {
        let n = prices.length;
        var i = 0;
        var j = k / 2;
        var sum = 0;
        var diff = 0;


        while
        (
            i < j
        )
        {
            sum += prices[i] * strategy[i];
            diff += prices[i] * -strategy[i];

            i ++;
        }


        while
        (
            i < k
        )
        {
            sum += prices[i] * strategy[i];
            diff += prices[i] * ( 1 - strategy[i] );

            i ++;
        }


        var ans = diff;
        i = 0;


        while
        (
            k < n
        )
        {
            sum += prices[k] * strategy[k];
            diff += ( prices[k] * ( 1 - strategy[k] ) ) - prices[j] + ( prices[i] * strategy[i] );
            ans = max( ans, diff );

            i ++;
            j ++;
            k ++;
        }


        ans = max( ans + sum,  sum );
    }

}
