package julien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/julien/vue/vueplateau.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            primaryStage.setTitle("ColorFX");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(Exception error) {
            error.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}

