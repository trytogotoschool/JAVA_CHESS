package julien.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
    public  GridPane gridPane_1;
    @FXML
    private Pane pane_0_0;
    @FXML
    private Pane pane_1_0;
    @FXML
    private Pane pane_2_0;
    @FXML
    private Pane pane_3_0;
    @FXML
    private Pane pane_4_0;
    @FXML
    private Pane pane_5_0;
    @FXML
    private Pane pane_6_0;
    @FXML
    private Pane pane_7_0;
    @FXML
    private Pane pane_0_1;
    @FXML
    private Pane pane_1_1;
    @FXML
    private Pane pane_2_1;
    @FXML
    private Pane pane_3_1;
    @FXML
    private Pane pane_4_1;
    @FXML
    private Pane pane_5_1;
    @FXML
    private Pane pane_6_1;
    @FXML
    private Pane pane_7_1;

    @FXML
    private Pane pane_0_2;
    @FXML
    private Pane pane_1_2;
    @FXML
    private Pane pane_2_2;
    @FXML
    private Pane pane_3_2;
    @FXML
    private Pane pane_4_2;
    @FXML
    private Pane pane_5_2;
    @FXML
    private Pane pane_6_2;
    @FXML
    private Pane pane_7_2;

    @FXML
    private Pane pane_0_3;
    @FXML
    private Pane pane_1_3;
    @FXML
    private Pane pane_2_3;
    @FXML
    private Pane pane_3_3;
    @FXML
    private Pane pane_4_3;
    @FXML
    private Pane pane_5_3;
    @FXML
    private Pane pane_6_3;
    @FXML
    private Pane pane_7_3;

    @FXML
    private Pane pane_0_4;
    @FXML
    private Pane pane_1_4;
    @FXML
    private Pane pane_2_4;
    @FXML
    private Pane pane_3_4;
    @FXML
    private Pane pane_4_4;
    @FXML
    private Pane pane_5_4;
    @FXML
    private Pane pane_6_4;
    @FXML
    private Pane pane_7_4;
    @FXML
    private Pane pane_0_5;
    @FXML
    private Pane pane_1_5;
    @FXML
    private Pane pane_2_5;
    @FXML
    private Pane pane_3_5;
    @FXML
    private Pane pane_4_5;
    @FXML
    private Pane pane_5_5;
    @FXML
    private Pane pane_6_5;
    @FXML
    private Pane pane_7_5;

    @FXML
    private Pane pane_0_6;
    @FXML
    private Pane pane_1_6;
    @FXML
    private Pane pane_2_6;
    @FXML
    private Pane pane_3_6;
    @FXML
    private Pane pane_4_6;
    @FXML
    private Pane pane_5_6;
    @FXML
    private Pane pane_6_6;
    @FXML
    private Pane pane_7_6;

    @FXML
    private Pane pane_0_7;
    @FXML
    private Pane pane_1_7;
    @FXML
    private Pane pane_2_7;
    @FXML
    private Pane pane_3_7;
    @FXML
    private Pane pane_4_7;
    @FXML
    private Pane pane_5_7;
    @FXML
    private Pane pane_6_7;
    @FXML
    private Pane pane_7_7;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initVue();
        board = new Board();
        board.startGame();
        updateBoard();


    }
    @FXML
    private void clickPane(MouseEvent event) throws Exception {
        Pane paneClicked = (Pane) event.getSource();
        ImageView iv = new ImageView();
        iv.setImage(new Image("/assets/w_queen.png"));
        iv.setFitHeight(75);
        iv.setFitWidth(75);
        paneClicked.getChildren().add(iv);
        initVue();
    }
    @FXML
    private void clickGrid(MouseEvent event) throws Exception {

    }

    private void initGame() {

/*
        for (int i = 0; i < 8; i++) {
            int img = i > 4 ? 7%i : i;

            Pane paneBlack = (Pane) gridPane_1.getChildren().get(i);
            Pane paneWhite = (Pane) gridPane_1.getChildren().get(i < 8 ? 56+i : 40+i);
            Pane panePawnBlack = (Pane) gridPane_1.getChildren().get(i+8);
            Pane panePawnWhite = (Pane) gridPane_1.getChildren().get(55-i);
            ImageView ivBlack = new ImageView();
            ImageView ivWhite = new ImageView();
            ImageView ivPawnBlack = new ImageView();
            ImageView ivPawnWhite = new ImageView();
            setImageviewProfil(ivBlack, String.format("b_%s",IMGBOARD[img]));
            setImageviewProfil(ivWhite, String.format("w_%s",IMGBOARD[img]));
            setImageviewProfil(ivPawnBlack, String.format("b_%s",IMGBOARD[5]));
            setImageviewProfil(ivPawnWhite, String.format("w_%s",IMGBOARD[5]));
            paneBlack.getChildren().add(ivBlack);
            paneWhite.getChildren().add(ivWhite);
            panePawnBlack.getChildren().add(ivPawnBlack);
            panePawnWhite.getChildren().add(ivPawnWhite);

        }
*/

    }

    @FXML
    public void updateBoard() {

        Piece piece[] = board.getBoard();
        int b = 1;
        for (int i = 0; i < piece.length; i++) {
           Pane pane  = (Pane)gridPane_1.getChildren().get(i);
           if (piece[i] != null) {
               String panePiece = (piece[i].getColor() == 'b' ? "b_"+IMGBOARD[piece[i].getType()] : "w_"+IMGBOARD[piece[i].getType()]);
               ImageView iv = new ImageView();
               setImageviewProfil(iv, panePiece);
               pane.getChildren().remove(0);
               pane.getChildren().add(iv);

            }
        }



    }


    private void setImageviewProfil(ImageView iv, String img) {
        iv.setFitHeight(IMGVIEWSIZE);
        iv.setFitWidth(IMGVIEWSIZE);
        iv.setImage(new Image(String.format("/assets/%s.png", img)));

    }
    public void initVue() {
        for (Node node : gridPane_1.getChildren()){
            ImageView  iv = new ImageView();
            Pane pane = (Pane)node;
            pane.getChildren().add(iv);
        }
    }
}
