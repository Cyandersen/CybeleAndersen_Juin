/*
*Author: cy.andersen
*Date : Jun. 3, 2021
*Description: 
*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ExRectangle extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		Rectangle rect=new Rectangle();
		rect.setWidth(200);
		rect.setHeight(100);
		rect.setFill(Color.WHITE);
		rect.setStroke(Color.RED);
		rect.setX(100);
		rect.setY(100);
		rect.widthProperty().bind(scene.widthProperty().divide(2));
		rect.heightProperty().bind(scene.heightProperty().divide(2));

		
		group.getChildren().add(rect);
		primaryStage.setScene(scene);
		primaryStage.show();
		

		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
