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
        final String path = scanner.nextLine();
        scanner.close();
        final int start = path.indexOf( "/" ) + 1;
        int end = path.length() - 1;;

        if
        (
            path.charAt( end - 1 ) == '/'
        )
        {
            end --;
        }

        final String [] directories = path.substring( start, end ).split( "/" );
        final Stack < String > stack = new Stack <> ();
        final StringJoiner answer = new StringJoiner( "/", "/", "" );


        for
        (
            String directory
            : directories
        )
        {
            
            if
            (
                directory.equals( "." )
            )
            {
                continue;
            }
            else if
            (
                directory.equals( ".." )
            )
            {
                stack.pop();
            }
            else
            {
                stack.push( directory );
            }

        }


        for
        (
            String directory
            : stack
        )
        {
            answer.add( directory );
        }


        System.out.println( answer.toString() );
    }

}
