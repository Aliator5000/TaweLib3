class RequestQueue
{
    private Node head;
    private Node next;
    private int size;

    public RequestQueue()
    {
        next = null;
        head = new Node(null, next);
        size = 0;
    }

    public boolean isEmpty()
    {
        return head == null;
    }
    public int getSize()
    {
        return size;
    }

    public void enqueue(Customer customer)
    {
        Node newNode = new Node(customer, null);
        if (next == null)
        {
            head = newNode;
            next = newNode;
        }
        else
        {
            next.setNext(newNode);
            next = next.getNext();
        }
        size++;
    }
    public Customer dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            Node newNode = head;
            head = newNode.getNext();
            if (head == null)
                next = null;
            size-- ;
            return newNode.getData();
        }
    }
    public Customer peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            return head.getData();
        }
    }
    public Boolean contains(Customer customer)
    {
        Node nextNode = head;
        for (int i=0; i<size; i++)
        {
            if(nextNode.getData().equals(customer))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder string = new StringBuilder();

        string.append("Queue = ");
        if (size == 0)
        {
            string.append("Empty");
        }
        Node nextNode = head;
        for (int i=0; i<size; i++)
        {
            string.append(nextNode.getData()+" ");
            nextNode = nextNode.getNext();
        }
        return string.toString();
    }
}