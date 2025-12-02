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
            int y = read.nextInt();
            int r = read.nextInt();

            System.out.println( Math.min( n, ( y / 2 ) + r ) );
        }


        read.close();
    }

}