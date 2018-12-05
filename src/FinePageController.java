import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FinePageController
{
    private Customer customer;

    @FXML
    Label fineLabel;
    @FXML
    TextField customerIDField;
    Library library = Main.library;

    public void checkFineButtonHandler(ActionEvent actionEvent)
    {
        for (Customer customer: library.getCustomers())
        {
            if (customer.getUsername().equals(customerIDField.getText()))
            {
                this.customer = customer;
                fineLabel.setText("Fine: £" + customer.getFine());
            }
        }
    }

    public void acceptFineButtonhandler(ActionEvent actionEvent)
    {
        customer.setFine(0);
    }
}
