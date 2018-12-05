public class Address
{
    private String firstLine;
    private String secondLine;
    private String town;
    private String county;
    private String postcode;

    public Address(String firstLine, String town, String postcode)
    {
        this.firstLine = firstLine;
        this.town = town;
        this.postcode = postcode;
    }
    public Address(String firstLine, String town, String county, String postcode)
    {
        this.firstLine = firstLine;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
    }
    public Address(String firstLine, String secondLine, String town, String county, String postcode)
    {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
    }


    public String getFirstLine()
    {
        return firstLine;
    }
    public void setFirstLine(String firstLine)
    {
        this.firstLine = firstLine;
    }
    public String getSecondLine()
    {
        return secondLine;
    }
    public void setSecondLine(String secondLine)
    {
        this.secondLine = secondLine;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town)
    {
        this.town = town;
    }
    public String getCounty()
    {
        return county;
    }
    public void setCounty(String county)
    {
        this.county = county;
    }
    public String getPostCode()
    {
        return postcode;
    }
    public void setPostCode(String postCode)
    {
        this.postcode = postCode;
    }

    public String getFullAddress()
    {
        return firstLine+((firstLine.equals(""))?"":"\n")+
               secondLine+((secondLine.equals(""))?"":"\n")+
               town+((town.equals(""))?"":"\n")+
               county+((county.equals(""))?"":"\n")+
               postcode;
    }
    @Override
    public String toString()
    {
        return getFullAddress();
    }
}
