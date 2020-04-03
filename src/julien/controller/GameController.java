package julien.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import julien.model.Game.Board;
import julien.model.Pieces.Piece;

import java.net.URL;
import java.util.ResourceBundle;



public class GameController implements Initializable {

    private Board board;
    private final int IMGVIEWSIZE = 75;
    private final String[] IMGBOARD= {"rook", "knight", "bishop", "king", "queen", "pawn"};
    @FXML
    public Label turn_player;
    @FXML
    public  GridPane gridPane_1;
    @FXML
    public Button button_newgame;
    @FXML
    public Button button_reset;
    @FXML
    public Button button_quit;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        board = new Board();
        board.startGame();
        updateBoard();
        button_newgame.setOnAction((actionEvent -> {
            board = new Board();
            board.startGame();
            updateBoard();
            updatePlayer();
        }));
        button_reset.setOnAction((actionEvent -> {
            if (board.getCanReset()) {
                board.reset();
                updateBoard();
                updatePlayer();
            }
        }));
        button_quit.setOnAction((actionEvent ->  System.exit(0)));

    }
    @FXML
    private void clickPane(MouseEvent event) throws Exception {

        Pane paneClicked = (Pane) event.getSource();
        Piece liste[] = board.getBoard();
        int a = gridPane_1.getChildren().indexOf(paneClicked);
        board.selected(a);
        updateBoard();
        updatePlayer();


    }
  
    private void updatePlayer(){
        turn_player.setText((board.getTurn() == 'w' ? "Blancs" : "Noirs"));
    }


    @FXML
    public void updateBoard() {
        Piece piece[] = board.getBoard();
        for (int i = 0; i < piece.length; i++) {
           Pane pane  = (Pane)gridPane_1.getChildren().get(i);
            if (piece[i] != null) {
                ImageView iv = new ImageView();
               String panePiece = (piece[i].getColor() == 'b' ? "b_"+IMGBOARD[piece[i].getType()] : "w_"+IMGBOARD[piece[i].getType()]);
               setImageviewProfil(iv, panePiece);
               pane.getChildren().clear();
               pane.getChildren().add(iv);
            } else {
                pane.getChildren().clear();
            }
        }
    }


    private void setImageviewProfil(ImageView iv, String img) {
        iv.setFitHeight(IMGVIEWSIZE);
        iv.setFitWidth(IMGVIEWSIZE);
        iv.setImage(new Image(String.format("/assets/%s.png", img)));

    }

}
