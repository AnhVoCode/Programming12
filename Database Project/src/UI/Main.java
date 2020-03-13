package UI;

import Database.DatabaseHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static DatabaseHandler handler;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Layouts/mainwindow.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void add(){
        String name = "John Smith";
        String id = "12345";
        String email = "JohnSmith@gmail.com";

        boolean flag = name.isEmpty() || id.isEmpty() || email.isEmpty();
        if(flag){
            return;
        }
        String st = "INSERT INTO STUDENT VALUES" +
    }

    public static void main(String[] args) {
       DatabaseHandler handler = new DatabaseHandler();
        launch();
    }


}
