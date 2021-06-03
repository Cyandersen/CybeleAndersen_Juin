/*
*Author: cy.andersen
*Date : Jun. 3, 2021
*Description: 
*/

package cybele_juin;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calcul extends Application {
	
	@Override
	public void start(Stage primaryStage) {
Group group=new Group();
		Scene scene =new Scene(group,400,400);
		
		TextField txt1=new TextField("0");
		TextField txt2=new TextField("0");
		Label lbl1=new Label("0");
		Label lbl2=new Label("+");
		Label lbl3=new Label("0");
		Label lbl4=new Label("=");
		Label lbl5=new Label("0");
		
		txt1.setLayoutX(100);
		txt1.setLayoutY(100);
		
		txt2.setLayoutX(100);
		txt2.setLayoutY(150);

		lbl1.setLayoutX(100);
		lbl1.setLayoutY(190);
		
		lbl2.setLayoutX(120);
		lbl2.setLayoutY(190);
		
		lbl3.setLayoutX(140);
		lbl3.setLayoutY(190);
		
		lbl4.setLayoutX(160);
		lbl4.setLayoutY(190);
		
		lbl5.setLayoutX(180);
		lbl5.setLayoutY(190);
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl3.textProperty().bind(txt2.textProperty());
		lbl3.textProperty().addListener((observable,oldValue,newValue)-> {
		if(!newValue.matches("^[0-9](\\.[0.9]+)?$"))
				{
			txt2.setText(newValue.replaceAll("[^\\d*\\.]", ""));
		
				}
		lbl5.setText(Integer.toString((checktext(lbl1))+ checktext(lbl3)))
				;});
		lbl1.textProperty().addListener((observable,oldValue,newValue)-> {
			if(!newValue.matches("^[0-9](\\.[0.9]+)?$")) {

			
			txt1.setText(newValue.replaceAll("[^\\d*\\.]", ""));
		}
		lbl5.setText(Integer.toString((checktext(lbl1))+ checktext(lbl3)));});
		
		group.getChildren().addAll(txt1,txt2,lbl1,lbl2,lbl3,lbl4,lbl5);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Calcul Addition");
		primaryStage.show();}
	int checktext(Label a)
	{
		int value;
		if(a.getText().equals(""))
			value=0;
		else
			value=Integer.parseInt(a.getText());
		return value;
	}
	
		
	}
