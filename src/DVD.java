public class DVD extends Resource
{
    private String director;
    private double runTime;

    public DVD(String title, int year, String director, double runTime, int loanDuration)
    {
        super(title, year, loanDuration);
        this.director = director;
        this.runTime = runTime;
    }

    public String getDirector()
    {
        return director;
    }
    public void setDirector(String director)
    {
        this.director = director;
    }
    public double getRunTime()
    {
        return runTime;
    }
    public void setRunTime(double runTime)
    {
        this.runTime = runTime;
    }

    public String getAllExceptID()
    {
        return getTitle()+getYear()+getDirector()+getRunTime()+getLoanDuration();
    }
    public String getAll()
    {
        return getId()+getAllExceptID();
    }

    @Override
    public String toString()
    {
        return "DVD: "+getTitle()+" directed by "+director+" in "+getYear();
    }
}
