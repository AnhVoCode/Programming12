package UI.Controllers;


import Database.DatabaseHandler;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddStudent implements Initializable {
    public DatabaseHandler handler = new DatabaseHandler();
    public TextField getID;
    public TextField getName;
    public TextField getEmail;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new DatabaseHandler();

    }

    public void addStudent(ActionEvent actionEvent) {
        String name = getName.getText();
        String id = getID.getText();
        String email = getEmail.getText();

        boolean flag = name.isEmpty() || id.isEmpty() || email.isEmpty();
        if(flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please Enter All Fields");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        String student = "INSERT INTO STUDENT INFORMATION (" + "'" + id + "', " +   "'" + name + "', " +  "'" + email + "')";
        System.out.println(student);
        if(handler.execAction(student)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Saved");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Error With Inputting Data");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
    }
}
