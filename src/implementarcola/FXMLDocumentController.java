/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarcola;

import datos.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import modelo.Cola;

/**
 *
 * @author fabian_esteban.lopez
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label tituloL;
    @FXML
    private Label nombrePL;
    @FXML
    private Label correoPL;
    @FXML
    private Label numPL;

    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField correoTxt;
    @FXML
    private TextField numTxt;

    @FXML
    private TextArea showTXT;

    Cola<Persona> colaPersonas;

    @FXML
    private void encolarPersonas(ActionEvent event) {
        /* System.out.println("You clicked me!");
        tituloL.setText("Hello World!");*/

        String nombreP = nombreTxt.getText();
        String correoP = correoTxt.getText();
        String numP = numTxt.getText();

        colaPersonas.encolar(new Persona(nombreP, correoP, numP));
    }

    @FXML
    private void showF(ActionEvent event) {
        
        showTXT.setText(colaPersonas.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        colaPersonas = new Cola<>();
    }

}
