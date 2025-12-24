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
            boolean k = read.nextInt() % 2 > 0;
            long [] a = readLongArray( read, n );
            long [] b = readLongArray( read, n );
            long max1 = Long.MIN_VALUE / 2;
            long max2 = max1;
            long sub = max1;
            long sum = 0;

            
            for
            (
                int i = 0
                ; i < n
                ; i ++
            )
            {
                sum += a[i];
                max1 = Math.max( max1, sum );
                sub = Math.max( sub + a[i], sum + b[i]  );
                max2 = Math.max( max2, sub );
                sum = Math.max( sum, 0 );
            }
            
            
            if
            (
                k
            )
            {
                System.out.println( max2 );
            }
            else
            {
                System.out.println( max1 );
            }
        }


        read.close();
    }




    static
    int[]
    readIntArray
    (
        Scanner read
        , int n
    )
    {
        int[] arr = new int[n];


        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            arr[i] = read.nextInt();
        }


        return arr;
    }




    static
    long[]
    readLongArray
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