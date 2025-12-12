import java.util.List;




public class Kata
{

    public static
    List < Object >
    filterList
    (
        final List < Object > list
    )
    {
        return list.stream().filter( elem -> elem.getClass().getName().equals( "java.lang.Integer" ) ).toList();
    }

}
