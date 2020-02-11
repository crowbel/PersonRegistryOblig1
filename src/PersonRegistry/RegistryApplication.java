package PersonRegistry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/* The JavaFx Application */

public class RegistryApplication extends Application {

    @Override
    public void init()throws IOException{
        System.out.println("Launching Program");

    }


    @Override
    public void start(Stage primaryStage) throws IOException{
        primaryStage.setTitle("Registration Form Application v.1.5");
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception{
        System.out.println("Program Shutting Down!");

    }


}
