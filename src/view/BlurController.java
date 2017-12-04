package view;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class BlurController {
	@FXML
	private ImageView imageView;
	private Ellipse ellipse;
	//private Circle circle;

	
	@FXML
    public void setclip() {           
        ellipse = new Ellipse();
//        circle = new Circle((imageView.getFitWidth())*0.2);

        ellipse.centerXProperty().setValue(195);
        ellipse.centerYProperty().setValue(65);
        ellipse.radiusXProperty().setValue(65);
        ellipse.radiusYProperty().setValue(65);
        
//        importing and modifying sizes
//    	ellipse.radiusXProperty().setValue(imageView.getFitWidth()*0.1);
//    	ellipse.radiusYProperty().setValue(imageView.getFitHeight()*0.17);
        
        imageView.setClip(ellipse);
	}

////apply a shadow effect.
//        imageView.setEffect(new DropShadow(120, Color.BLACK));

	@FXML
	public void setblur() {
		imageView.setEffect(new GaussianBlur(10));
	}

	@FXML
	public void hundlerClose() {
		System.exit(0);
	}

}
