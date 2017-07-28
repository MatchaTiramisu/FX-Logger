package view;

import javax.script.ScriptEngineManager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class login extends Application {
	
	Scene sceneLogin, sceneMain;
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Welcome to MyFX");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene sceneLogin = new Scene(grid, 1000, 600);
        
        sceneLogin.getStylesheets().add
        (login.class.getResource("login.css").toExternalForm());
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        btn.setOnAction(e -> primaryStage.setScene(sceneMain));
        
        //build scene of main menu
        
        //TODO create main menu
        //I want to add a calendar(something like scheduler?)to show on which day we had trade. 
        //When we click the date, details will be shown below the calendar. 
        GridPane gridMain = new GridPane();
        gridMain.setHgap(10);
        gridMain.setVgap(10);
		sceneMain = new Scene(gridMain, 1000, 600);
		sceneMain.getStylesheets().add
        (login.class.getResource("main.css").toExternalForm());//TODO write main.css
		
		//Information for ENTRY
		Label currencyPair = new Label("Currency pair");
		gridMain.add(currencyPair, 1, 1);
		
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().addAll("USD/JPY","EUR/JPY","GBP/JPY","GBP/USD","EUR/USD");
		gridMain.add(choiceBox, 2, 1);
		
		RadioButton rb1 = new RadioButton("Buy");
		RadioButton rb2 = new RadioButton("Sell");
		ToggleGroup radioGroup = new ToggleGroup();
		rb1.setToggleGroup(radioGroup);
		rb2.setToggleGroup(radioGroup);		
		gridMain.add(rb1, 1, 3);
		gridMain.add(rb2, 2, 3);
		
		//Input
		Label price = new Label("Price");
		Label amount = new Label("Amount");
		gridMain.add(price, 1, 4);
		gridMain.add(amount, 1, 5);
		TextField amountInput = new TextField();
		TextField priceInput = new TextField();		
		amountInput.setPromptText("Enter the amount");
		priceInput.setPromptText("Enter the price");
		gridMain.add(priceInput, 2, 4);
		gridMain.add(amountInput, 2, 5);
      
        //show login page first
        primaryStage.setScene(sceneLogin);
        primaryStage.show();
        
    }
}
