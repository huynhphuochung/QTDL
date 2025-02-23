module com.example.qtdl {
    requires javafx.controls;
    requires javafx.fxml;  // Thêm dòng này để yêu cầu module javafx.fxml

    exports com.example.qtdl;
    opens com.example.qtdl to javafx.fxml;  // Mở gói cho JavaFX FXML
}
