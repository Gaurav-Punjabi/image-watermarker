package com.gp.watermarker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

      @Override
      public void start(Stage primaryStage) throws Exception {
            primaryStage.initStyle(StageStyle.UNDECORATED);
            Parent root = FXMLLoader.load(getClass().getResource("views/main-page.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 1024, 720));
            primaryStage.show();
      }


      public static void main(String[] args) {
            launch(args);
      }
}
