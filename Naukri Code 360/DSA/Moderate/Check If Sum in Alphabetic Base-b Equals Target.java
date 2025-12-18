import java.util.*;




public class Solution
{

    public static
    boolean
    isSumEqualBaseB
    (
        int b
        , String first
        , String second
        , String target
    )
    {
        return getValue( b, first ) + getValue( b, second ) == getValue( b, target );
    }




    static
    int
    getValue
    (
        int b
        , String s
    )
    {
        int p = 1;
        int value = 0;


        for
        (
            int i = s.length() - 1
            ; i >= 0
            ; i --
        )
        {
            value += ( s.charAt( i ) - 'a' ) * p;
            p *= b;
        }


        return value;
    }

}
