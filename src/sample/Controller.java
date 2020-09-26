package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import java.awt.*;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    TextField Mensaje;
    @FXML
    Label labelPuerto;


    public void enviarMensaje() {

        System.out.println(Mensaje.getText());
        Mensaje.clear();
    }
    public void indicarPort(){
        labelPuerto.setText(String.valueOf(Servidor.Puerto));
    }
}
