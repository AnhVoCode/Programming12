package UI.Controllers;


import Database.DatabaseHandler;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AddStudent implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new DatabaseHandler();
    }
}
