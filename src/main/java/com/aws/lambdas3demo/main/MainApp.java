package com.aws.lambdas3demo.main;

import com.sun.javafx.css.StyleManager;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @SuppressWarnings("restriction")
	@Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainScene.fxml"));
        
        //GLOBAL DEFAULT STYLESHEET
        Application.setUserAgentStylesheet(STYLESHEET_MODENA);
        //CUSTOM STYLESHEET OVERRIDING DEFAULT BUT NOT REMOVING
        StyleManager.getInstance().addUserAgentStylesheet("styles/Styles.css");
        
        //Scene scene = new Scene(root);
        //scene.getStylesheets().add("/styles/Styles.css");
        
        //stage.setTitle("JavaFX and Maven");
        //stage.setScene(scene);
        //stage.show();
        Stage mainStage = FXMLLoader.load(getClass().getResource("/fxml/MainScene.fxml"));
        mainStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
