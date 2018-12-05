import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LibrarianPageController
{
    @FXML
    TextField usernameField;
    @FXML
    Label dateLabel;
    @FXML
    Label numberLabel;

    private Stage stage = new Stage();

    public void requestButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("requestResourcePage.fxml"));
        Main.window.setTitle("Tawe Lib");
        Main.window.setScene(new Scene(root, 600, 550));
        Main.window.show();
    }
    public void fineButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("finePage.fxml"));
        stage.setTitle("Pay Fine");
        stage.setScene(new Scene(root, 400, 400));
        stage.show();
    }
    public void customerButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("createCustomerPage.fxml"));
        Main.window.setTitle("Create Customer");
        Main.window.setScene(new Scene(root, 600, 550));
        Main.window.show();
    }
    public void profileButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("profilePage.fxml"));
        Main.window.setTitle("Profile Page");
        Main.window.setScene(new Scene(root, 600, 550));
        Main.window.show();
    }
    public void logoutButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        Main.window.setTitle("Login Page");
        Main.window.setScene(new Scene(root, 600, 550));
        Main.window.show();
    }
    public void bookButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("editBookPage.fxml"));
        stage.setTitle("Edit Book");
        stage.setScene(new Scene(root, 550, 400));
        stage.show();
    }
    public void dvdButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("editDVDPage.fxml"));
        stage.setTitle("Edit DVD");
        stage.setScene(new Scene(root, 550, 400));
        stage.show();
    }
    public void laptopButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("editLaptopPage.fxml"));
        stage.setTitle("Edit Laptop");
        stage.setScene(new Scene(root, 550, 400));
        stage.show();
    }
}
