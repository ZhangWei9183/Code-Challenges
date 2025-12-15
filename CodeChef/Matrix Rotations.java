public static
void
rotateClockwise
(
    int [][] matrix
) 
{
    final int N = matrix.length;
    final int O = N - 1;
    final int M = ( N + 1 ) / 2;
    
    
    for
    (
        int i = 0
            , p = O
        ; i < O
        ; i ++, p --
    )
    {
        
        
        for
        (
            int j = 0
                , q = O
            ; j < p
            ; j ++, q --
        )
        {
            swap( matrix, i, q, j, p );
        }
        
        
    }
    
    
    for
    (
        int i = 0
            ,j = N - 1
        ; i < j
        ; i ++, j --
    )
    {
        
        
        for
        (
            int p = 0
            ; p < N
            ; p ++
        )
        {
            swap( matrix, i, j, p, p );
        }
        
        
    }
    
    
}



static
void
swap
(
    int [][] matrix
    , int i
    , int j
    , int p
    , int q
)
{
    int temp = matrix[i][p];
    matrix[i][p] = matrix[j][q];
    matrix[j][q] = temp;
}
