module co.edu.uniquindio.poo.empresa_electrodomesticos {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.empresa_electrodomesticos to javafx.fxml;
    exports co.edu.uniquindio.poo.empresa_electrodomesticos;
}