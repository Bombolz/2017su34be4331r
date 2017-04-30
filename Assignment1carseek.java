/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1carseek;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import java.util.*;


/**
 *
 * @author adimt460a
 */
public class Assignment1carseek extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       /* Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
       //CarOffer carOfferTest = new CarOffer();
       //CarSeek carSeekTest = new CarSeek();
       
       SeekOfferManager sOM = new SeekOfferManager();
       sOM.LoadListFromDataBase();

        
        TextArea resultBox = new TextArea();
        resultBox.setPrefRowCount(10);
        resultBox.setPrefColumnCount(100);
        resultBox.setWrapText(true);
        resultBox.setPrefWidth(150);
        
        StackPane root = new StackPane();
        root.getChildren().add(resultBox);
        resultBox.appendText("Results Box");
        
        resultBox.appendText("\n");
        resultBox.appendText("DisplayAllCarSeek()");
        appendListToTextArea(resultBox, sOM.DisplayAllCarSeek());
        resultBox.appendText("\n");
        resultBox.appendText("DisplayAllCarOffer()");
        appendListToTextArea(resultBox, sOM.DisplayAllCarOffer());
        
         resultBox.appendText("\n Added Car Offer and Car Seek \n");
        sOM.addCarOffer(7, 200, "100", "2033", "2033", "2056", "2", "5", "10");
        sOM.addCarSeek(6, null, "12", "2204", "2210");
        
        resultBox.appendText("\n");
        resultBox.appendText("DisplayAllCarSeek()");
        appendListToTextArea(resultBox, sOM.DisplayAllCarSeek());
        resultBox.appendText("\n");
        resultBox.appendText("DisplayAllCarOffer()");
        appendListToTextArea(resultBox, sOM.DisplayAllCarOffer());
        
        
        resultBox.appendText("\n");
        resultBox.appendText("findMatchByPostCode()");
        appendListToTextArea(resultBox, sOM.findMatchByPostCode());
        
        
        resultBox.appendText("\n");
        resultBox.appendText("findMatchBySinglePostCode(String postCode)");
        appendListToTextArea(resultBox, sOM.findMatchBySinglePostCode("2088"));
        
        
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("CarSeek and CarOffer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void appendListToTextArea(TextArea resultBox, ArrayList<String> list)
    {
        resultBox.appendText("\n");
        for(String tempString : list)
        {
             resultBox.appendText(tempString);
             resultBox.appendText("\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
