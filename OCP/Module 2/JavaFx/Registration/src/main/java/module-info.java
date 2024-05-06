module tokio.registration {
    requires javafx.controls;
    requires javafx.fxml;


    opens tokio.registration to javafx.fxml;
    exports tokio.registration;
    exports tokio.registration.model;
}