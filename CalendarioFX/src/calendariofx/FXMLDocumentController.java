/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariofx;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author natal
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblAviso;
    private Label lblMensagem;
    private Button btnClick;
    
    @FXML
    private void botaoClicado(ActionEvent event) {
        lblAviso.setText("A data e hora atuais sao:");
        
        Date calendario = new Date();
        lblMensagem.setText(calendario.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
