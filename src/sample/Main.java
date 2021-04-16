package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sudoku0.fxml"));
        root.styleProperty().setValue(" -fx-background-color: grey;  -fx-border-color: white; -fx-border-width: 1px;");

        primaryStage.setTitle("Sudoku ver.03");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.getIcons().add(new Image("sample/ikon.jpg"));

    }


    public static void main(String[] args) {
        launch(args);
    }
}
