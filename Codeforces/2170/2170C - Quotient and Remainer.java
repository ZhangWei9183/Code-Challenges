import java.util.*;




public class Solution
{

    public static
    void
    main
    (
        String[] args
    )
    {
        Scanner read = new Scanner( System.in );
        int t = read.nextInt();


        for
        (
            int h = 0
            ; h < t
            ; h ++
        )
        {
            int n = read.nextInt();
            long k = read.nextLong();
            long[] q = readArray( read, n );
            long[] r = readArray( read, n );
            Arrays.sort( q );
            Arrays.sort( r );
            int ans = 0;
            int j = n - 1;

            for
            (
                int i = 0
                ; i < n
                ; i ++
            )
            {

                while
                (
                    j >= 0
                )
                {
                    
                    if
                    (
                        r[j] >= 0
                        && ( ( q[i] * ( r[j] + 1 ) ) + r[j] ) <= k
                    )
                    {
                        break;
                    }

                    j --;
                }
                
                
                if
                (
                    j < 0
                )
                {
                    break;
                }
                else
                {
                    ans ++;
                    r[j] = -1;
                    j --;
                }
                
            }


            System.out.println( ans );
        }


        read.close();
    }




    static
    long[]
    readArray
    (
        Scanner read
        , int n
    )
    {
        long[] arr = new long[n];


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            arr[i] = read.nextLong();
        }


        return arr;
    }

}