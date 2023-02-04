module com.example.todolist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.iconsfivetwofive;

    opens com.example.todolist to javafx.fxml;
    exports com.example.todolist;
}