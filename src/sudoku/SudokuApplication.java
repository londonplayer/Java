package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sudoku.userinterface.UserInterfaceImpl;

import java.io.IOException;

import static javafx.application.Application.launch;

public class SudokuApplication extends Appication {
    private IUserIntefaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception {
        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void  main(String[] args) {
        launch(args);
    }
}