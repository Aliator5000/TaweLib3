import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginPageController
{
    @FXML
    TextField username;

    @FXML
    Button loginButton;

    @FXML
    ComboBox userComboBox;

    @FXML
    public void loginButtonHandler(MouseEvent mouseEvent) throws IOException
    {
        if (userComboBox.getSelectionModel().getSelectedItem().toString().equals("Customer"))
        {
            for(Customer customer : Main.library.getCustomers())
            {
                if (customer.getUsername().equals(username.getText()))
                {
                    Main.signedIn = customer;
                    Parent root = FXMLLoader.load(getClass().getResource("customerPage.fxml"));
                    Main.window.setTitle("Tawe Lib");
                    Main.window.setScene(new Scene(root, 600, 550));
                    Main.window.show();
                }
            }
        }
        else if (userComboBox.getSelectionModel().getSelectedItem().toString().equals("Librarian"))
        {
            for(Librarian librarian : Main.library.getLibrarians())
            {
                if(librarian.getUsername().equals(username.getText()))
                {
                    Main.signedIn = librarian;
                    Parent root = FXMLLoader.load(getClass().getResource("librarianPage.fxml"));
                    Main.window.setTitle("Tawe Lib");
                    Main.window.setScene(new Scene(root, 600, 550));
                    Main.window.show();
                }
            }
        }
    }
}
