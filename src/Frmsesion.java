import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Frmsesion{

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPass;

    @FXML
    public Button loginButton;

    @FXML
    void iniciarSesion(ActionEvent event) {
        String usuario = txtUsername.getText();
        String clave = txtPass.getText();
 
        System.out.println("Usuario: "+usuario);
        System.out.println("Contraseña: "+clave);
    }
}
