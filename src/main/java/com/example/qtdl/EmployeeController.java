package com.example.qtdl;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class EmployeeController {
    @FXML
    private Button viewButton; // Nút "Xem danh sách"
    @FXML
    private TableView<Employee> employeeTableView;
    @FXML
    private TableColumn<Employee, String> idcolumn;
    @FXML
    private TableColumn<Employee, String> namecolumn;
    @FXML
    private TableColumn<Employee, Integer> sdtcolumn;
    @FXML
    private TableColumn<Employee, String> gioitinhcolumn;
    @FXML
    private TableColumn<Employee, String> trangthaicolumn;
    private final ObservableList<Employee> employeeList = FXCollections.observableArrayList(
            new Employee("E001", "Alice", 123456, "nam", "ok"),
            new Employee("E002", "Bob", 2345678,"nam","ok" ),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok"),
            new Employee("E003", "Charlie", 123456, "nu", "ok")
    );
    @FXML
    private void initialize() {
        // Gán dữ liệu cho các cột của TableView
     idcolumn.setCellValueFactory(cellData -> cellData.getValue().idnvProperty() );
     namecolumn.setCellValueFactory(cellData -> cellData.getValue().hotennvProperty() );
     gioitinhcolumn.setCellValueFactory(cellData -> cellData.getValue().gioitinhnvProperty() );
     trangthaicolumn.setCellValueFactory(cellData -> cellData.getValue().trangthaiProperty() );
     sdtcolumn.setCellValueFactory(cellData -> cellData.getValue().sdtProperty().asObject());
        employeeTableView.setItems(employeeList);
    }

    @FXML
    private void handleViewButtonAction() {
        System.out.println("Button clicked!"); //
        // Hiển thị TableView khi người dùng nhấn nút
        employeeTableView.setItems(employeeList);
        employeeTableView.setVisible(true); // Hiển thị TableView
    }
    private Stage stage;  // Stage của ứng dụng
    public void setStage(Stage stage) {
        this.stage = stage;
    }


    // Hàm để xử lý sự kiện đăng xuất
    @FXML
    public void onLogout(ActionEvent event) {
        // Xử lý đăng xuất và mở lại màn hình đăng nhập
        try {
            // Tạo một cửa sổ đăng nhập mới (HelloApplication là class của màn hình đăng nhập của bạn)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/qtdl/login.fxml"));
            Scene loginScene = new Scene(loader.load());

            // Lấy Stage hiện tại từ sự kiện
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.setScene(loginScene);  // Chuyển cảnh
            currentStage.show();  // Hiển thị cửa sổ

        } catch (Exception e) {
            // Nếu có lỗi xảy ra khi đăng xuất, hiển thị thông báo lỗi
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error logging out");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }


}
