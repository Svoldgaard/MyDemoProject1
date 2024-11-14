module dk.easv.mydemoproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.mydemoproject1 to javafx.fxml;
    exports dk.easv.mydemoproject1;
}