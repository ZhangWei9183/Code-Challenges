import java.util.*;




public
class Main
{
    public
    static
    void
    main
    (
        String args []
    )
    {
        final Scanner scanner = new Scanner( System.in );
        final int T = scanner.nextInt();


        for
        (
            int testcase = 1
            ; testcase <= T
            ; testcase ++
        )
        {
            final int odd = scanner.nextInt();
            final int even = scanner.nextInt();


            if
            (
                odd > 0
                && even % odd == 0
            )
            {
                System.out.println( "Yes" );
            }
            else
            {
                System.out.println( "No" );
            }

        }


        scanner.close();
    }

}
