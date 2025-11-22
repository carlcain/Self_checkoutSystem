module com.example.self_checkoutsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.self_checkoutsystem to javafx.fxml;
    exports org.rocs.vra;
//    exports;
//    opens to
}