/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * FXML Controller class
 *
 * @author Graziela
 */
public class AlunoController implements Initializable {

    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField nome;
    @FXML
    private JFXTextField contato;
    @FXML
    private JFXButton cadastrar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Cliente.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),900,682);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Cliente");
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
