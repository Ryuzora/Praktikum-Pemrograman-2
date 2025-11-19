package PRAKTIKUM6.app;

import PRAKTIKUM6.view.MahasiswaView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MahasiswaView mahasiswaView = new MahasiswaView();

        Scene scene = new Scene(mahasiswaView, 600, 400);

        primaryStage.setTitle("Praktikum 6 - Graphical User Interface");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}