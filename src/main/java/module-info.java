module io.gihutb.gleidsonmt.sketch {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.gihutb.gleidsonmt.sketch to javafx.fxml;
    exports io.gihutb.gleidsonmt.sketch;
}
