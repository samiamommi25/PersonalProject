module cse213.personalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.personalproject to javafx.fxml;
    exports cse213.personalproject;
}