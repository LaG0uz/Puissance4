module P4 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
