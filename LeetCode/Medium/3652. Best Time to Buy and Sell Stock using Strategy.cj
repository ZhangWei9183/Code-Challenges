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
        let n = prices.size
        var i = 0;
        var j = k / 2;
        var o = k;
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
            i < o
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
            o < n
        )
        {
            sum += prices[o] * strategy[k];
            diff += ( prices[o] * ( 1 - strategy[o] ) ) - prices[j] + ( prices[i] * strategy[i] );
            ans = max( ans, diff );

            i ++;
            j ++;
            o ++;
        }


        ans = max( ans + sum,  sum );
    }

}
