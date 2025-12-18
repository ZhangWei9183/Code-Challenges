import java.util.*;




public class Solution
{
    
    public static
    String
    sortCharsByFrequency
    (
        String s
    )
    {
        TreeMap < Character, Integer > treeMap = new TreeMap <> ();


        for
        (
            char c
            : s.toCharArray()
        )
        {
            treeMap.put( c, treeMap.getOrDefault( c, 0 ) + 1 );
        }


        StringBuilder oddStringBuilder = new StringBuilder();
        StringBuilder evenStringBuilder = new StringBuilder();


        for
        (
            var entry
            : treeMap.entrySet()
        )
        {

            if
            (
                entry.getValue() % 2 == 1
            )
            {
                oddStringBuilder.append( String.valueOf( entry.getKey() ).repeat( entry.getValue() ) );
            }
            else
            {
                evenStringBuilder.append( String.valueOf( entry.getKey() ).repeat( entry.getValue() ) );
            }

        }


        return oddStringBuilder.toString() + evenStringBuilder.toString();
    }

}
