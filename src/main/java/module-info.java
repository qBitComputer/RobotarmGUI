module org.suermondt.robotarmgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.suermondt.robotarmgui to javafx.fxml;
    exports org.suermondt.robotarmgui;
}