module org.example.assignmentchapter12stevenbruce {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.assignmentchapter12stevenbruce to javafx.fxml;
    exports org.example.assignmentchapter12stevenbruce;
}