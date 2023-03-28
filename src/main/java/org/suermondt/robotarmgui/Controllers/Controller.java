package org.suermondt.robotarmgui.Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.suermondt.robotarmgui.Main;


public class Controller extends Main {
    @FXML
    Label axis1Label;
    @FXML
    Label axis2Label;
    @FXML
    Label axis3Label;
    @FXML
    Label axis4Label;
    @FXML
    Label axis5Label;
    @FXML
    Label gripperLabel;
    @FXML
    TextField axis1Field;
    @FXML
    TextField axis2Field;
    @FXML
    TextField axis3Field;
    @FXML
    TextField axis4Field;
    @FXML
    TextField axis5Field;
    @FXML
    Slider gripperField;
    public void serialButtonMenu(ActionEvent e) {
        System.out.println("Button clicked!"); // To Do!
    }
    public void sendCommandButton(ActionEvent e) {
        System.out.println("Button clicked!"); // To Do!
        Alert sendSure = new Alert(Alert.AlertType.CONFIRMATION);
        sendSure.setTitle("Are you sure?");
        sendSure.setHeaderText(null);
        sendSure.setContentText("Please check your commands before you send them. If the coordinates aren't properly set, your arm will fail to perform any action.");
        sendSure.getButtonTypes().setAll(ButtonType.YES, ButtonType.CANCEL);
        sendSure.showAndWait();
        if (sendSure.getResult() == ButtonType.YES) {
            System.out.println("send button clicked!");
        } else {
            System.out.println("operation cancelled.");
        }
    }
    public void setCommandButton(ActionEvent e) {
        System.out.println("set positions!"); // To Do!
        axis1Label.setText(axis1Field.getText());
        axis2Label.setText(axis2Field.getText());
        axis3Label.setText(axis3Field.getText());
        axis4Label.setText(axis4Field.getText());
        axis5Label.setText(axis5Field.getText());
        gripperLabel.setText(String.valueOf(gripperField.getValue()));
    }
}
