module org.example.diskanalyzer {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.diskanalyzer to javafx.fxml;
    exports org.example.diskanalyzer;
}