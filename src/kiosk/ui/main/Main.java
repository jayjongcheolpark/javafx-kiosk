package kiosk.ui.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kiosk.database.DatabaseHandler;

public class Main extends Application {

    DatabaseHandler databaseHandler;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("main.css").toString());

        databaseHandler = DatabaseHandler.getInstance();
        MainController.lateInit();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Kiosk");
        primaryStage.show();
    }
}
