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
            int c = 0;
            long d = 1;


            for
            (
                int i = 0
                ; i < n
                ; i ++
            )
            {
                int num = read.nextInt();

                if
                (
                    num > 0
                )
                {
                    c ++;
                    d += num - 1;
                }
                else
                {
                    d --;
                }

            }
            

            System.out.println( Math.min( c, d ) );
        }


        read.close();
    }

}