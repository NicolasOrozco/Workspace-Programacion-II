module co.edu.uniquindio.poo.biblioteca_digital {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.biblioteca_digital to javafx.fxml;
    exports co.edu.uniquindio.poo.biblioteca_digital;
}