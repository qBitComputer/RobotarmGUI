package org.suermondt.robotarmgui.Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.suermondt.robotarmgui.Main;
import java.io.IOException;
import com.fazecast.jSerialComm.SerialPort;



public class Controller extends Main {
    SerialPort sp;
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
    @FXML
    TextField COMfield;
    @FXML
    TextField BAUDfield;
    public void ConnectSerial(ActionEvent e) {
        System.out.println("Button clicked!"); // To Do!
        System.out.println(COMfield.getText());
        System.out.println(BAUDfield.getText());
        sp = SerialPort.getCommPort(COMfield.getText()); // device name
        sp.setComPortParameters(Integer.parseInt(BAUDfield.getText()), 8, 1, 0); // default connection settings for Arduino
        sp.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0); // block until bytes can be written
        if (sp.openPort()) {
            System.out.println("Port is open :)");
        } else {
            System.out.println("Failed to open port :(");
        }



    }
    public void sendCommandButton(ActionEvent e) throws IOException {
        System.out.println("Button clicked!"); // To Do!
        Alert sendSure = new Alert(Alert.AlertType.CONFIRMATION);
        sendSure.setTitle("Are you sure?");
        sendSure.setHeaderText(null);
        sendSure.setContentText("Please double check before sending!");
        sendSure.getButtonTypes().setAll(ButtonType.YES, ButtonType.CANCEL);
        sendSure.showAndWait();
        if (sendSure.getResult() == ButtonType.YES) {
            System.out.println("send button clicked!");
            axis1Label.setText(axis1Field.getText());
            axis2Label.setText(axis2Field.getText());
            axis3Label.setText(axis3Field.getText());
            axis4Label.setText(axis4Field.getText());
            axis5Label.setText(axis5Field.getText());
            gripperLabel.setText(String.valueOf(gripperField.getValue()));

        } else {
            System.out.println("operation cancelled.");
        }
    }
    public void setCommandButton(ActionEvent e) {
        System.out.println("set positions!"); // To Do!


    }
}
