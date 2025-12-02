import java.util.*;




public class Solution
{
    static final int[] ANS = { 0, 1, 9, 29, 56 };




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

            if
            (
                n < 5
            )
            {
                System.out.println( ANS[n] );
            }
            else
            {
                System.out.println( ( 5 * n * n ) - ( 5 * n ) - 5 );
            }

        }


        read.close();
    }

}