module org.suermondt.robotarmgui {
    requires javafx.controls;
    requires javafx.fxml;


	opens org.suermondt.robotarmgui to javafx.fxml;
    exports org.suermondt.robotarmgui;
	exports org.suermondt.robotarmgui.Controllers;
	opens org.suermondt.robotarmgui.Controllers to javafx.fxml;
}