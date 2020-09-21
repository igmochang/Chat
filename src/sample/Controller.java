package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import java.awt.*;


public class Controller {
    @FXML
    TextField Mensaje;

    public void enviarMensaje() {

        System.out.println(Mensaje.getText());

    }
}
