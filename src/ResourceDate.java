import java.text.SimpleDateFormat;
import java.util.Date;

public class ResourceDate
{
    private Resource resource;
    private Date date;

    public ResourceDate(Resource resource, Date date)
    {
        this.resource = resource;
        this.date = date;
    }

    public Resource getResource()
    {
        return resource;
    }
    public void setResource(Resource resource)
    {
        this.resource = resource;
    }
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return resource.getClass().getName()+" "+resource.getTitle()+" : "+(date.getYear()+1900)+"-"+(date.getMonth()+1)+"-"+(date.getDay()+1);
    }
}
