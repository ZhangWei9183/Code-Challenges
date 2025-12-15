class SetComparator
implements Comparator < List < Integer > >
{
    
    @Override
    public
    int
    compare
    (
        List < Integer > list1
        , List < Integer > list2
    )
    {
        final int n = Math.min( list1.size(), list2.size() );
        
        
        for
        (
            int i = 0
            ; i < n
            ; i ++
        )
        {
            
            if
            (
                list1.get( i ) != list2.get( i )
            )
            {
                return list1.get( i ) - list2.get( i );
            }
          
        }
        
        
        return list1.size() - list2.size();
    }
    
}




public
static
listOfSubSet
(
    int [] multiset
)
{
    int [] arr = { 1, 2, 2 };
    int n = arr.length;
    Set < List < Integer > > set = new HashSet <> ();
    List < Integer > list = Arrays.stream( arr ).boxed().toList();
    set.add( List.of() );


    for
    (
        int i = 0
        ; i < n
        ; i ++
    )
    {
        
        
        for
        (
            int j = i + 1
            ; j <= n
            ; j ++
        )
        {
            set.add( list.subList( i, j ) );
        }
    
    
    }


    return set.stream().sorted( new SetComparator() ).toList();
}
