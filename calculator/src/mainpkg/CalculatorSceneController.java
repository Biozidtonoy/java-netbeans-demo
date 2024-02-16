/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tonoy
 */
public class CalculatorSceneController implements Initializable {

    @FXML
    private TextField numOneTextField;
    @FXML
    private TextField numTwoTextField;
    @FXML
    private TextField outputTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButton(ActionEvent event) {
        Integer a = Integer.parseInt(numOneTextField.getText());
        Integer b = Integer.parseInt(numOneTextField.getText());
        
        Integer sum = Calculator.addition(a,b);
        
        outputTextField.setText(String.valueOf(sum));
        
    }

    @FXML
    private void multiplyButton(ActionEvent event) {
        Integer a = Integer.parseInt(numOneTextField.getText());
        Integer b = Integer.parseInt(numOneTextField.getText());
        
        Integer multi = Calculator.multiply(a,b);
        
        outputTextField.setText(String.valueOf(multi));
    }

    @FXML
    private void clearbutton(ActionEvent event) {
        numOneTextField.clear();
        numTwoTextField.clear();
        outputTextField.clear();
    }
    
}
