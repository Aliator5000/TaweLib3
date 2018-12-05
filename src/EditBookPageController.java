import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EditBookPageController
{
    Library library = Main.library;
    @FXML
    ListView bookListView;
    @FXML
    TextField titleField;
    @FXML
    TextField yearField;
    @FXML
    TextField authorField;
    @FXML
    TextField publisherField;

    public void confirmButtonHandler(ActionEvent actionEvent)
    {
        Book selected = (Book)bookListView.getSelectionModel().getSelectedItems().get(0);
        if (!titleField.getText().isEmpty())
        {
            selected.setTitle(titleField.getText());
        }
        if (!yearField.getText().isEmpty())
        {
            selected.setYear(Integer.valueOf(yearField.getText()));
        }
        if (!authorField.getText().isEmpty())
        {
            selected.setAuthor(authorField.getText());
        }
        if (!publisherField.getText().isEmpty())
        {
            selected.setPublisher(publisherField.getText());
        }
        bookListView.setItems(FXCollections.observableArrayList());
        for(Book book : library.getBooks())
        {
            bookListView.getItems().add(book);
        }
    }

    public void initialize()
    {
        bookListView.setItems(FXCollections.observableArrayList());
        for(Book book : library.getBooks())
        {
            bookListView.getItems().add(book);
        }
    }
}
