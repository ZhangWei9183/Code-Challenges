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
        final Scanner read = new Scanner( System.in );
        final int t = read.nextInt();


        for
        (
                int h = 0
                ; h < t
                ; h ++
        )
        {
            final int k = read.nextInt();
            final int x = read.nextInt();


            System.out.println( ( k * x ) + 1 );
        }


        read.close();
    }

}
