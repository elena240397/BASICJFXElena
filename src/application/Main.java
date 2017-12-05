package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

	private Pane mypane;
	
	
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "../view/forest.fxml"
            )
        );
    	
        mypane = (Pane) loader.load();

       
        stage.setTitle("The forest");
        stage.setScene(new Scene(mypane));
        stage.show();
    }
   
    
   
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}