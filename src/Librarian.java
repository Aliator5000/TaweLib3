import java.util.Date;

public class Librarian extends User
{
    private Date employmentDate;
    private int staffNumber;

    public Librarian(String username, String firstName, String lastName, int phoneNumber, Address address, Date employmentDate, int staffNumber)
    {
        super(username, firstName, lastName, phoneNumber, address);
        this.employmentDate = employmentDate;
        this.staffNumber = staffNumber;
    }

    public Date getEmploymentDate()
    {
        return employmentDate;
    }
    public void setEmploymentDate(Date employmentDate)
    {
        this.employmentDate = employmentDate;
    }
    public int getStaffNumber()
    {
        return staffNumber;
    }
    public void setStaffNumber(int staffNumber)
    {
        this.staffNumber = staffNumber;
    }
}
