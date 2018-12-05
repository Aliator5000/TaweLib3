public class Laptop extends Resource
{
    private String manufacturer;
    private String model;
    private String OS;

    public Laptop(String title, int year, String manufacturer, String model, String OS, int loanDuration)
    {
        super(title, year, loanDuration);
        this.manufacturer = manufacturer;
        this.model = model;
        this.OS = OS;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getOS()
    {
        return OS;
    }
    public void setOS(String OS)
    {
        this.OS = OS;
    }

    public String getAllExceptID()
    {
        return getTitle()+getYear()+getManufacturer()+getModel()+getOS()+getLoanDuration();
    }
    public String getAll()
    {
        return getId()+getAllExceptID();
    }

    @Override
    public String toString()
    {
        return "Laptop: "+getTitle()+" "+getYear()+" running "+OS;
    }
}
