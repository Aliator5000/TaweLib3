import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EditDVDPageController
{
    Library library = Main.library;
    @FXML
    ListView dvdListView;
    @FXML
    TextField titleField;
    @FXML
    TextField yearField;
    @FXML
    TextField directorField;
    @FXML
    TextField runTimeField;

    public void confirmButtonHandler(ActionEvent actionEvent)
    {
        DVD selected = (DVD)dvdListView.getSelectionModel().getSelectedItems().get(0);
        if (!titleField.getText().isEmpty())
        {
            selected.setTitle(titleField.getText());
        }
        if (!yearField.getText().isEmpty())
        {
            selected.setYear(Integer.valueOf(yearField.getText()));
        }
        if (!directorField.getText().isEmpty())
        {
            selected.setDirector(directorField.getText());
        }
        if (!runTimeField.getText().isEmpty())
        {
            selected.setRunTime(Double.valueOf(runTimeField.getText()));
        }
        dvdListView.setItems(FXCollections.observableArrayList());
        for(DVD dvd : library.getDVDs())
        {
            dvdListView.getItems().add(dvd);
        }
    }
    public void initialize()
    {
        dvdListView.setItems(FXCollections.observableArrayList());
        for(DVD dvd : library.getDVDs())
        {
            dvdListView.getItems().add(dvd);
        }
    }
}
