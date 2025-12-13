import java.util.*;




public class Main
{

    public static
	void
	main
	(
		String args []
	)
	{
		final Scanner read = new Scanner( System.in );
		final int n = read.nextInt();
        int worker = 1;
        int ans = 0;


		for
		(
			int i = 1
			; i <= n
			; i ++
		)
		{
			worker *= i;
			
			
            while
            (
                worker % 10 == 0
            )
            {
                worker /= 10;
                ans ++;
            }
			
            worker %= 100;
		}


		read.close();
        
        System.out.println( ans );
    }

}
