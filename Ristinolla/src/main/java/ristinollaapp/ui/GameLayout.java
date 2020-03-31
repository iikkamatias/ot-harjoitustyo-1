package ristinollaapp.ui;


import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameLayout {

    private BorderPane gameLayout;
    private GridUi gamegrid;

    public GameLayout(int size) {
        this.gameLayout = new BorderPane();
        this.gamegrid = new GridUi(size);

        createLayout();
    }

    public void createLayout() {
        String vuoro = gamegrid.getVuoro();
        Label turn = new Label("Vuoro: " + vuoro);
        turn.setFont(new Font("Arial", 20));

        gameLayout.setAlignment(turn, Pos.CENTER);
        gameLayout.setTop(turn);

        GridPane grid = gamegrid.getGameGrid();

        gameLayout.setAlignment(grid, Pos.CENTER);
        gameLayout.setCenter(grid);

    }

    public BorderPane getLayout() {
        return gameLayout;
    }

}