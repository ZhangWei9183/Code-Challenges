class Solution
{

    public
    int []
    countMentions
    (
        int numberOfUsers
        , List < List < String > > events
    )
    {
        int [] ans = new int [ numberOfUsers ];
        int [] onlineArray = new int [ numberOfUsers ];
        int allMentions = 0;
        events.sort( new EventComparator() );


        for
        (
            var event
            : events
        )
        {
            int timestamp = Integer.parseInt( event.get( 1 ) );

            if
            (
                event.get( 0 ).startsWith( "M" )
            )
            {
                String mentions_string = event.get( 2 );
                
                if
                (
                    mentions_string.startsWith("A")
                )
                {
                    allMentions ++;
                }
                else if
                (
                    mentions_string.startsWith("H")
                )
                {
                    

                    for
                    (
                        int i = 0
                        ; i < numberOfUsers
                        ; i ++
                    )
                    {
                        
                        if
                        (
                            onlineArray[i] <= timestamp
                        )
                        {
                            ans[i] ++;
                        }

                    }


                }
                else
                {
                    var stream = Arrays.stream( mentions_string.split( " " ) );

                    var ids = stream.mapToInt
                    (
                        ( s ) -> Integer.parseInt( s.substring( 2 ) )
                    );


                    ids.forEach( id -> ans[id] ++ );
                }

            }
            else
            {
                int id = Integer.parseInt( event.get( 2 ) );
                onlineArray[id] = timestamp + 60;
            }


        }


        if
        (
            allMentions == 0
        )
        {
            return ans;
        }


        for
        (
            int i = 0
            ; i < numberOfUsers
            ; i ++
        )
        {
            ans[i] += allMentions;
        }


        return ans;
    }




    class EventComparator
    implements Comparator < List < String > >
    {

        @Override
        public
        int
        compare
        (
            List < String > event1
            , List < String > event2
        )
        {
            int timestamp1 = Integer.parseInt( event1.get( 1 ) );
            int timestamp2 = Integer.parseInt( event2.get( 1 ) );
            int result = Integer.compare( timestamp1, timestamp2 );

            if
            (
                result != 0
            )
            {
                return result;
            }
            else
            {
                return event2.get( 0 ).compareTo( event1.get( 0 ) );
            }

        }

    }

}
