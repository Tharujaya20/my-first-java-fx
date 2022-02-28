package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Scene scene;
    private Parent root;

    public Controller(Parent root) {
        this.root = root;
    }

    public void   buttonCLICK(){
        System.out.println("the button is CLICK");
    }

    public void gotopagetwo(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.show();
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
