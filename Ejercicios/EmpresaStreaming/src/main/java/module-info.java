module co.edu.uniquindio.poo.empresastreaming {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.empresastreaming to javafx.fxml;
    exports co.edu.uniquindio.poo.empresastreaming;
}