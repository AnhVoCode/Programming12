package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetGender;

    public Label lblName;
    public Label lblAge;
    public Label lblGender;
    public ListView <Friend> friendList = new ListView();

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend(textGetName.getText(),Integer.parseInt(textGetAge.getText()),textGetGender.getText());
        friendList.getItems().add(temp);
        textGetName.clear();
        textGetAge.clear();
        textGetGender.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(temp.name);
        lblAge.setText(Integer.toString(temp.getAge()));
        lblGender.setText(temp.getGender());

    }

    public void removeFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);
        lblName.setText("");
        lblAge.setText("");
        lblGender.setText("");
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myLIst = friendList.getItems();
        for (Friend f:myLIst){
            f.writeToFile();
        }
        for (Friend f:myLIst){
            if (f.getGender().equals("M")){
                f.writeToMaleFile();
            }
        }
        for (Friend f : myLIst){
            if (f.getGender().equals("F")){
                f.writeToFemaleFile();
            }
        }
        friendList.getItems().clear();
    }

    public void loadFriend(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriend("Friend.txt");
        for (Friend f : friends){
            friendList.getItems().add(f);
        }
    }

    public void loadMale(ActionEvent actionEvent) throws IOException{
        friendList.getItems().clear();
        ArrayList<Friend> males = CreateFriend.createAllFriend("Male.txt");
        for (Friend f: males){
            if (f.getGender().equals("M")){
                friendList.getItems().add(f);
            }
        }
    }

    public void loadFemale(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friend> females = CreateFriend.createAllFriend("Female.txt");
        for (Friend f: females){
            if (f.getGender().equals("F")){
                friendList.getItems().add(f);
            }
        }

    }
}
