import java.util.List;
import java.util.regex.Pattern;




public class Solution
{
    static final Pattern p = Pattern.compile( "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])" );




    public static
    int
    countValidCodes
    (
        List < String > codes
    )
    {
        var predicate = p.asPredicate();

        return ( int )
        (
            codes.stream()
                .filter( predicate )
                .count()
        );
    }

}
