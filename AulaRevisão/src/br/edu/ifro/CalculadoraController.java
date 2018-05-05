/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Graziela
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField txt1, txt2, txtResultado;
    @FXML
    private Button btnCalcular;
    
    @FXML
    private void soma(ActionEvent event) {
       Double n1 = Double.parseDouble(txt1.getText());
       Double n2 = Double.parseDouble(txt2.getText());
       Double nResul = n1+n2;
       
       txtResultado.setText(nResul.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),476,398);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Aluno");
        stage.setScene(scene);
        stage.show();
    }
        catch(IOException e){

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
}
