import java.util.*;




public class Solution
{

    public static
    String
    maximizeAfterDeleteAndInsert
    (
        String n
        , int x
    )
    {
        int m = n.length();
        StringBuilder ans = new StringBuilder( n );
        char d = ( char ) ( '0' + x );
        boolean u = true;


        if
        (
            n.charAt( 0 ) == '-'
        )
        {
            boolean v = true;
            
            
            for
            (
                int i = 2
                ; i < m
                    &&
                    (
                        u
                        || v
                    )
                ; i ++
            )
            {

                if
                (
                    v
                    && ans.charAt( i ) < ans.charAt( i - 1 )
                )
                {
                    ans.deleteCharAt( i - 1 );

                    v = false;
                }
                
                if
                (
                    u
                    && d < ans.charAt( i - 1 )
                )
                {
                    ans.insert( i - 1, d );

                    u = false;
                }

            }

            if
            (
                v
            )
            {
                ans.deleteCharAt( m - 1 );
            }

            if
            (
                u
            )
            {
                ans.append( d );
            }

        }
        else
        {

            for
            (
                int i = 0
                ; i < m
                    && u
                ; i ++
            )
            {

                if
                (
                    u
                    && d > ans.charAt( i )
                )
                {
                    ans.insert( i, d );

                    u = false;
                }
                
            }


            if
            (
                u
            )
            {
                ans.append( d );
            }

        }


        return ans.toString();
    }

}
