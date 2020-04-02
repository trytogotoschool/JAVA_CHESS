package julien.model.Game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import julien.controller.GameController;
import julien.model.Pieces.Piece;

import java.lang.reflect.GenericArrayType;

public class Board {


    private final int IMGVIEWSIZE = 75;
     public  Piece[] board;

    public Board(){
        board = new Piece[64];
        createBoard();
        //initBoard();

    }
    private void createBoard() {
        for (int i = 0; i < 64; i++){
             board[i] = null;
        }
      }

    public void startGame() {
        for (int i = 0; i < 8; i++) {
            int type = i > 4 ? 7%i : i;

            Piece pieceBlack =  new Piece('b', type);
            Piece pieceWhite = new Piece('w', type);
            Piece pionBlack = new Piece('b', 5);
            Piece pionWhite = new Piece('w', 5);
            board[i] = pieceBlack;
            board[56+i] = pieceWhite;
            board[i+8] = pionBlack;
            board[55-i] = pionWhite;



        }
    }

    public Piece[] getBoard() {
        return board;
    }
 }
