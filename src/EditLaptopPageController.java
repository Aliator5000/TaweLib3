import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EditLaptopPageController
{
    Library library = Main.library;
    @FXML
    ListView laptopListView;
    @FXML
    TextField titleField;
    @FXML
    TextField yearField;
    @FXML
    TextField manufacturerField;
    @FXML
    TextField modelField;
    @FXML
    TextField osField;


    public void confirmButtonHandler(ActionEvent actionEvent)
    {
        Laptop selected = (Laptop)laptopListView.getSelectionModel().getSelectedItems().get(0);
        if (!titleField.getText().isEmpty())
        {
            selected.setTitle(titleField.getText());
        }
        if (!yearField.getText().isEmpty())
        {
            selected.setYear(Integer.valueOf(yearField.getText()));
        }
        if (!manufacturerField.getText().isEmpty())
        {
            selected.setManufacturer(manufacturerField.getText());
        }
        if (!modelField.getText().isEmpty())
        {
            selected.setModel(modelField.getText());
        }
        if (!osField.getText().isEmpty())
        {
            selected.setModel(osField.getText());
        }
        laptopListView.setItems(FXCollections.observableArrayList());
        for(Laptop laptop : library.getLaptops())
        {
            laptopListView.getItems().add(laptop);
        }
    }
    public void initialize()
    {
        laptopListView.setItems(FXCollections.observableArrayList());
        for(Laptop laptop : library.getLaptops())
        {
            laptopListView.getItems().add(laptop);
        }
    }
}
