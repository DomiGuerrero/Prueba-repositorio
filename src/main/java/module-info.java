module com.example.pruebajavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;


    opens com.example.pruebajavafx to javafx.fxml;
    exports com.example.pruebajavafx;
}