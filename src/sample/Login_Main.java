package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_Main {
    private static BorderPane pane;

    public static void Show_Exam() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Login_Main.class.getResource("sample.fxml"));
        GridPane exam = fxmlLoader.load();
        pane.setCenter(exam);
    }
}
