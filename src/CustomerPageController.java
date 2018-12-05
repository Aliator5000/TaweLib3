import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomerPageController
{
    @FXML
    Button button;
    @FXML
    ListView resourceListView;
    @FXML
    ComboBox searchType;
    @FXML
    TextField searchText;
    @FXML
    Label label;

    private Customer signedIn = (Customer)Main.signedIn;
    private Library library = Main.library;

    public void borrow()
    {
        Resource selected = (Resource)resourceListView.getSelectionModel().getSelectedItems().get(0);
        selected.bowrrow(signedIn);
    }

    public void checkQueue(ActionEvent actionEvent)
    {
        Resource selected = (Resource)resourceListView.getSelectionModel().getSelectedItems().get(0);
        System.out.println(selected.getRequestQueue());
    }

    public void search(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        switch (searchType.getSelectionModel().getSelectedItem().toString())
        {
            case "ID":
                for (Resource resource : (library.searchID(Integer.valueOf(searchText.getText()))))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "Title":
                for (Resource resource : (library.searchTitle(searchText.getText())))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "Author":
                for (Resource resource : (library.searchAuthor(searchText.getText())))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "OS":
                for (Resource resource : (library.searchOS(searchText.getText())))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
            case "Any":
                for (Resource resource : (library.search((searchText.getText()))))
                {
                    resourceListView.getItems().add(resource);
                }
                break;
        }
    }
    public void borrowed(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (Resource resource : signedIn.getBorrwed())
        {
            resourceListView.getItems().add(resource);
        }
    }
    public void reserved(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (Resource resource : signedIn.getReserved())
        {
            resourceListView.getItems().add(resource);
        }
    }
    public void requested(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (Resource resource : signedIn.getRequested())
        {
            resourceListView.getItems().add(resource);
        }
    }
    public void history(ActionEvent actionEvent)
    {
        resourceListView.setItems(FXCollections.observableArrayList());
        for (ResourceDate resourceDate : signedIn.getHistory())
        {
            resourceListView.getItems().add(resourceDate);
        }
    }
    public void profileButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("profilePage.fxml"));
        Main.window.setTitle("Tawe Lib");
        Main.window.setScene(new Scene(root, 600, 550));
        Main.window.show();
    }

    public void logoutButtonHandler(ActionEvent actionEvent) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        Main.window.setTitle("Tawe Lib");
        Main.window.setScene(new Scene(root, 600, 550));
        Main.window.show();
    }

    public void initialize()
    {
        resourceListView.setItems(FXCollections.observableArrayList());

        ArrayList<String> searchTypeArray = new ArrayList<>(Arrays.asList("ID", "Title", "Author", "OS", "Any"));
        for (String item : searchTypeArray)
        {
            searchType.getItems().add(item);
        }
        label.setText("Select Resource");
    }
}
