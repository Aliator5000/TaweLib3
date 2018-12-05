import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreateCustomerPageController
{
    Library library = Main.library;

    @FXML
    TextField usernameField;
    @FXML
    TextField firstNameField;
    @FXML
    TextField surnameField;
    @FXML
    TextField phoneNumberField;
    @FXML
    TextField addressLine1Field;
    @FXML
    TextField addressLine2Field;
    @FXML
    TextField townField;
    @FXML
    TextField cityField;
    @FXML
    TextField postcodeField;

    public void createButtonHandler(ActionEvent actionEvent)
    {
        library.addCustomer(new Customer(usernameField.getText(), firstNameField.getText(), surnameField.getText(), Long.parseLong(phoneNumberField.getText()),
                new Address(addressLine1Field.getText(), addressLine2Field.getText(), townField.getText(), cityField.getText(), postcodeField.getText())));
        System.out.println(library.getCustomers());
    }
}
