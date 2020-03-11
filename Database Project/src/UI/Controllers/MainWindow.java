package UI.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindow implements Initializable {
    void loadWindow(String location, String title){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource(location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadBookWindow(ActionEvent actionEvent) {
        loadWindow("../Layouts/addbook.fxml","Add Book");
    }

    public void loadStudentWindow(ActionEvent actionEvent) {
        loadWindow("../Layouts/addstudent.fxml","Add Student");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Runs when window opens");
    }
}
