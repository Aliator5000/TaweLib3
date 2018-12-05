import java.util.ArrayList;

public class Customer extends User
{
    private ArrayList<Resource> borrwed = new ArrayList<>();
    private ArrayList<Resource> requested = new ArrayList<>();
    private ArrayList<Resource> reserved = new ArrayList<>();
    private ArrayList<ResourceDate> history = new ArrayList<>();
    private double fine;

    public Customer()
    {
        super("","","",0, new Address("","",""));
    }
    public Customer(String username, String firstName, String lastName, long phoneNumber, Address address)
    {
        super(username, firstName, lastName, phoneNumber, address);
    }

    public double getFine()
    {
        return fine;
    }
    public void setFine(double fine)
    {
        this.fine = fine;
    }
    public ArrayList<Resource> getBorrwed()
    {
        return borrwed;
    }
    public void setBorrwed(ArrayList<Resource> borrwed)
    {
        this.borrwed = borrwed;
    }
    public ArrayList<Resource> getRequested()
    {
        return requested;
    }
    public void setRequested(ArrayList<Resource> requested)
    {
        this.requested = requested;
    }
    public ArrayList<Resource> getReserved()
    {
        return reserved;
    }
    public void setReserved(ArrayList<Resource> reserved)
    {
        this.reserved = reserved;
    }
    public ArrayList<ResourceDate> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ResourceDate> history) {
        this.history = history;
    }
}
