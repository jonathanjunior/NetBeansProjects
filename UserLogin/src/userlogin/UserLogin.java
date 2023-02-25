
package userlogin;

import javafx.application.Application;
import javafx.event.EventHandler; //<<
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent; //<<
import javafx.stage.Stage;
import javafx.stage.StageStyle; //<<

/**
 *
 * @author jonathan
 */
public class UserLogin extends Application {
    
    private double xOffset = 0; //<<
    private double yOffset = 0; //<<
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.initStyle(StageStyle.DECORATED.UNDECORATED); //<<
        
        root.setOnMousePressed(new EventHandler<MouseEvent>(){ //<<
            @Override                                          //<<
            public void handle (MouseEvent event) {                 //<<
                xOffset = event.getSceneX();                        //<<
                yOffset = event.getSceneY();                  //<<
            }
        });
        
        root.setOnMouseDragged(new EventHandler<MouseEvent>(){
            @Override
            public void handle (MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenX() - yOffset);
            }
        });        
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
