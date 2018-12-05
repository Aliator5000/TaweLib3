public class Book extends Resource
{
    private String author;
    private String publisher;

    public Book(String title, int year, String author, String publisher, int loanDuration)
    {
        super(title, year, loanDuration);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getAllExceptID()
    {
        return getTitle()+getAuthor()+getPublisher()+getLoanDuration();
    }

    public String getAll()
    {
        return getId()+getTitle()+getAllExceptID();
    }

    @Override
    public String toString()
    {
        return "Book: "+getTitle()+" by "+author+" in "+getYear();
    }
}
