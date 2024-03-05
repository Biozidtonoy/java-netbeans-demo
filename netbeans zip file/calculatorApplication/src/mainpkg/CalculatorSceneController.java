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
    private TextField numOneTextfield;
    @FXML
    private TextField numtwoTextField;
    @FXML
    private TextField outFieldtextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void addButton(ActionEvent event) {
        Integer a = Integer.parseInt(numOneTextfield.getText());
        Integer b = Integer.parseInt(numtwoTextField.getText());
        Integer sum = Calculator.addition(a, b);
        outFieldtextField.setText(String.valueOf(sum));
        
    }
    @FXML
    private void multiplyButton(ActionEvent event) {
        Integer a = Integer.parseInt(numOneTextfield.getText());
        Integer b = Integer.parseInt(numtwoTextField.getText());
        Integer multi = Calculator.multiplication(a, b);
        outFieldtextField.setText(String.valueOf(multi));
        
    }

    @FXML
    private void clearButton(ActionEvent event) {
        numOneTextfield.clear();
        numtwoTextField.clear();
        outFieldtextField.clear();
                
    }

    
   
}
