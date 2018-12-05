public class Resource
{
    private static int idCounter = 1;
    private int id;
    private String title;
    private int year;
    private boolean borrowed = false;
    private RequestQueue requestQueue = new RequestQueue();
    private int loanDuration = 0;

    public Resource(String title, int year, int loanDuration)
    {
        this.title = title;
        this.year = year;
        this.loanDuration = loanDuration;

        id = idCounter++;
    }

    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getLoanDuration()
    {
        return loanDuration;
    }
    public void setLoanDuration(int loanDuration)
    {
        this.loanDuration = loanDuration;
    }
    public boolean isBorrowed()
    {
        return borrowed;
    }
    public void setBorrowed(boolean borrowed)
    {
        this.borrowed = borrowed;
    }
    public RequestQueue getRequestQueue()
    {
        return requestQueue;
    }
    public void setRequestQueue(RequestQueue requestQueue)
    {
        this.requestQueue = requestQueue;
    }

    public void bowrrow(Customer customer)
    {
        if (!isBorrowed())
        {
            System.out.println("Successfully borrowed resource "+getId()+".");
            setBorrowed(true);
        }
        else
        {
            System.out.println("Resource "+getId()+" is already borrowed. Added to queue.");
            if(!requestQueue.contains(customer))
            {
                requestQueue.enqueue(customer);
            }
        }
    }
}
