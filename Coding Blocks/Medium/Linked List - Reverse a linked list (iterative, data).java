public
void
reverse_DI
()
{

    if
    (
        head == tail
    )
    {
        return;
    }

    Stack < Node > stack = new Stack <> ();
    

    while
    (
        head != null
    )
    {
        stack.push( head );
        head = head.next;
    }


    head = stack.pop();
    tail = head;


    while
    (
        !stack.isEmpty()
    )
    {
        tail.next = stack.pop();
        tail = tail.next;
    }


    tail.next = null;
}
