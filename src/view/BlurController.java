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
	

	
	@FXML
    public void setclip() {           
        ellipse = new Ellipse();

//para modificar la forma cambiar el valor del radio, en mi caso todo es 65 para que sea un circulo
        ellipse.centerXProperty().setValue(195);
        ellipse.centerYProperty().setValue(65);
        ellipse.radiusXProperty().setValue(65);
        ellipse.radiusYProperty().setValue(65);
        

        
        imageView.setClip(ellipse);
	}



	@FXML
	public void setblur() {
		imageView.setEffect(new GaussianBlur(10));
	}

	@FXML
	public void hundlerClose() {
		System.exit(0);
	}

}
