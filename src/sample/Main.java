package sample;

import com.mysql.cj.result.AbstractNumericValueFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(getClass());
        AnchorPane root = FXMLLoader.load(getClass().getResource("login_form.fxml"));
        stage.setTitle("Examination portal");
        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
