class Node
{
    private Customer data;
    private Node next;

    public Node()
    {
        next = null;
        data = new Customer();
    }
    public Node(Customer customer, Node next)
    {
        this.data = customer;
        this.next = next;
    }

    public Customer getData()
    {
        return data;
    }
    public void setData(Customer data)
    {
        this.data = data;
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
}