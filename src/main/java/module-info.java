module com.example.f23javatasks {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.f23javatasks to javafx.fxml;
    exports com.example.f23javatasks;
}