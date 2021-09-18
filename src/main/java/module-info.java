module com.example.revision_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.revision_app to javafx.fxml;
    exports com.example.revision_app;
}