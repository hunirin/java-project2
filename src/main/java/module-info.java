module com.java.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.java.javaproject2 to javafx.fxml;
    exports com.java.javaproject2;
}