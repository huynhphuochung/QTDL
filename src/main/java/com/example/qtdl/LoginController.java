package com.example.qtdl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    // Phương thức xử lý sự kiện nhấn nút Login
    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        // Tải giao diện mới (mainScreen.fxml)
        FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
        VBox root = loader.load();  // Lấy VBox từ FXML

        // Lấy cửa sổ hiện tại và chuyển sang giao diện mới
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();  // Lấy Stage từ Button
        stage.setScene(new Scene(root, 400, 300));  // Thay đổi Scene
        stage.setTitle("Main Screen");  // Tiêu đề cửa sổ
        stage.show();  // Hiển thị cửa sổ mới
    }
}
