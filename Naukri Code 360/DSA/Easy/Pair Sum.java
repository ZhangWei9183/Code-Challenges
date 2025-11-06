import java.util.*;






public class Solution
{

    public static
    boolean
    hasPairWithSum
    (
        int[] arr
        , int n
        , int k
    )
    {
        HashSet < Integer > hashSet = new HashSet <> ();
        
        for
        (
            int num
            : arr
        )
        {
            
            if
            (
                hashSet.contains( k - num )
            )
            {
                return true;
            }
            else
            {
                hashSet.add( num );
            }

        }


        return false;
    }

}
