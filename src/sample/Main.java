package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.magic.WindowConfig;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        WindowConfig windowConfig = new WindowConfig();
        windowConfig.loadWindow(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
