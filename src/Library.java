import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<DVD> dvds = new ArrayList<>();
    private ArrayList<Laptop> laptops = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Librarian> librarians = new ArrayList<>();

    public Library() {};

    public Library(ArrayList<Book> books, ArrayList<DVD> dvds, ArrayList<Laptop> laptops)
    {
        this.books = books;
        this.dvds = dvds;
        this.laptops = laptops;
    }

    public ArrayList<Book> getBooks()
    {
        return books;
    }
    public void setBooks(ArrayList<Book> books)
    {
        this.books = books;
    }
    public ArrayList<DVD> getDVDs()
    {
        return dvds;
    }
    public void setDVDs(ArrayList<DVD> dvds)
    {
        this.dvds = dvds;
    }
    public ArrayList<Laptop> getLaptops()
    {
        return laptops;
    }
    public void setLaptops(ArrayList<Laptop> laptops)
    {
        this.laptops = laptops;
    }

    public void addBook(Book book)
    {
        books.add(book);
    }
    public void removeBook(Book book)
    {
        books.remove(book);
    }
    public void addDVD(DVD dvd)
    {
        dvds.add(dvd);
    }
    public void removeDVD(DVD dvd)
    {
        dvds.remove(dvd);
    }
    public void addLaptop(Laptop laptop)
    {
        laptops.add(laptop);
    }
    public void removeLaptop(Laptop laptop)
    {
        laptops.remove(laptop);
    }
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public void removeCustomer(Customer customer)
    {
        customers.remove(customer);
    }
    public void addLibrarian(Librarian librarian)
    {
        librarians.add(librarian);
    }
    public void removeLibrarian(Librarian librarian)
    {
        librarians.remove(librarian);
    }


    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }
    public void setCustomers(ArrayList<Customer> customers)
    {
        this.customers= customers;
    }
    public ArrayList<Librarian> getLibrarians()
    {
        return librarians;
    }
    public void setLibrarians(ArrayList<Librarian> librarians)
    {
        this.librarians = librarians;
    }

    public ArrayList<Resource> search(String key)
    {
        ArrayList<Resource> searchedArray = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getAll().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(book);
            }
        }
        for (DVD dvd : dvds)
        {
            if (dvd.getAll().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(dvd);
            }
        }
        for (Laptop laptop : laptops)
        {
            if (laptop.getAll().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(laptop);
            }
        }

        return searchedArray;
    }
    public ArrayList<Resource> searchID(int key)
    {
        ArrayList<Resource> searchedArray = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getId()==key)
            {
                searchedArray.add(book);
            }
        }
        for (DVD dvd : dvds)
        {
            if (dvd.getId()==key)
            {
                searchedArray.add(dvd);
            }
        }
        for (Laptop laptop : laptops)
        {
            if (laptop.getId()==key)
            {
                searchedArray.add(laptop);
            }
        }

        return searchedArray;
    }
    public ArrayList<Resource> searchTitle(String key)
    {
        ArrayList<Resource> searchedArray = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getTitle().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(book);
            }
        }
        for (DVD dvd : dvds)
        {
            if (dvd.getTitle().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(dvd);
            }
        }
        for (Laptop laptop : laptops)
        {
            if (laptop.getTitle().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(laptop);
            }
        }

        return searchedArray;
    }
    public ArrayList<Resource> searchAuthor(String key)
    {
        ArrayList<Resource> searchedArray = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getAuthor().toLowerCase().contains(key.toLowerCase()))
            {
                searchedArray.add(book);
            }
        }

        return searchedArray;
    }
    public ArrayList<Resource> searchOS(String key)
    {
        ArrayList<Resource> searchedArray = new ArrayList<>();

        for (Laptop laptop : laptops)
        {
            if (laptop.getOS().contains(key))
            {
                searchedArray.add(laptop);
            }
        }

        return searchedArray;
    }

    @Override
    public String toString()
    {
        return "Library\n{\n" +
                "books=" + books +
                "\ndvds=" + dvds +
                "\nlaptops=" + laptops +
                "\n}";
    }
}
