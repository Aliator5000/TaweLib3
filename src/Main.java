import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application
{
    public static Library library;
    public static Stage window;
    public static User signedIn;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        primaryStage.setTitle("Tawe Lib");
        primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        library = new Library();

        Book book = new Book("lol", 1995, "jim", "bob", 14);

        DVD dvd = new DVD("foo", 2011, "baa", 8100, 14);

        Laptop laptop = new Laptop("30791b", 2015, "Dell", "Inspiron 15 5570", "Windows", 14);

        Book book2 = new Book("lol2",1961, "dave","bob", 14);

        library.addBook(book);
        library.addDVD(dvd);
        library.addLaptop(laptop);
        library.addBook(book2);

        signedIn = new Customer("Aliator", "Alistair", "Bates",07743334555,
                new Address("12 Cambrian Place", "Swansea", "SA11RG"));
        library.addCustomer((Customer)signedIn);
        ((Customer) signedIn).getHistory().add(new ResourceDate(book, new Date()));
        ((Customer) signedIn).getBorrwed().add(book);
        ((Customer) signedIn).getRequested().add(book2);
        ((Customer) signedIn).getReserved().add(dvd);

        Librarian librarian = new Librarian("Admin","Admin", "Admin", 01305111111,
                new Address("Swansea University Bay Campus", "Swansea", "SA18EP"), new Date(), 0);
        library.addLibrarian(librarian);

        launch(args);
    }
}
