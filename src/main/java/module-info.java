module marianasanz.prog.ut5.snakefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens marianasanz.prog.ut5.snakefx to javafx.fxml;
    exports marianasanz.prog.ut5.snakefx;
}