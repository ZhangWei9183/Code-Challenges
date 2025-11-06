import java.util.*;






public class Solution
{

    public static
    List < String > getRestockItems
    (
        Map < String, Integer > inventory
        , List < String > sales
        , int k
    )
    {
        ArrayList < String > ans = new ArrayList <> ();
        

        for
        (
            String sale
            : sales
        )
        {
            
            if
            (
                inventory.containsKey( sale )
            )
            {
                inventory.put( sale, inventory.get( sale ) - 1 );
            }
            
        }


        for
        (
            Map.Entry < String, Integer > entry
            : inventory.entrySet()
        )
        {

            if
            (
                entry.getValue() < k
            )
            {
                ans.add( entry.getKey() );
            }

        }


        ans.sort( Comparator.naturalOrder() );


        return ans;
    }

}
