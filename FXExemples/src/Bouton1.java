/*
*Author: cy.andersen
*Date : Jun. 3, 2021
*Description: 
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Bouton1 extends Application {
	
	Pane pane=new Pane();
	Scene scene=new Scene(pane, 400, 400);

	@Override
	public void start(Stage primaryStage) {
		
		Button bouton=new Button();
		bouton.setText("Mon Button");
		pane.getChildren().add(bouton);
		bouton.setLayoutX(20);
		bouton.setLayoutY(20);
		
		
		bouton.setOnAction((event) ->
		{
			System.out.println("Bouton clique");
		}
		);
		
		bouton.prefWidthProperty().bind(pane.widthProperty().divide(2));
		bouton.prefHeightProperty().bind(pane.heightProperty().divide(2));
		primaryStage.setScene(scene);
		primaryStage.show();


		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
