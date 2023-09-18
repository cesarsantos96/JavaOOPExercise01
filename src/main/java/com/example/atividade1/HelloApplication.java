package com.example.atividade1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Mario", 27, "Masculino");

        Pessoa pessoa2 = new Pessoa("Camila", 36, "Feminino");

        pessoa1.imprimirInfo();
        pessoa2.imprimirInfo();
    }



}