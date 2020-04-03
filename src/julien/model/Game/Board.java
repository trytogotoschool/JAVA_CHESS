package julien.model.Game;

import julien.model.Pieces.Piece;

import java.util.HashMap;


public class Board {


     private final int IMGVIEWSIZE = 75;
     public  Piece[] board;
     private char turn;
     private int firstCase;
     private Piece[] old_board;
     private boolean canReset;

    public Board(){
        board = new Piece[64];
        createBoard();
        turn = 'w';
        firstCase = -1;
        canReset = false;


    }
    private void createBoard() {
        for (int i = 0; i < 64; i++){
             board[i] = null;
        }
      }

    public void startGame() {
        for (int i = 0; i < 8; i++) {
            int type = i > 4 ? 7%i : i;
            Piece pieceBlack = new Piece('b', type);
            Piece pieceWhite = new Piece('w', type);
            Piece pionBlack = new Piece('b', 5);
            Piece pionWhite = new Piece('w', 5);
            board[i] = pieceBlack;
            board[56+i] = pieceWhite;
            board[i+8] = pionBlack;
            board[55-i] = pionWhite;
        }
    }

    public void selected(int value) {
        if (firstCase == -1) {
            if (board[value] != null && board[value].getColor() == turn) {
                firstCase = value;
             }
        }
        else if (firstCase != -1) {
            if (board[value] == null) {
                 changePiece(value);
             }
            else if (board[value].getColor() == turn) {
                firstCase = value;
             } else {
                changePiece(value);
             }
        }
    }

    public char getTurn() {
        return  turn;
    }
    private  void changePiece(int value) {

        old_board = board.clone();
        board[value] = board[firstCase];
        board[firstCase] = null;
        firstCase = -1;
        canReset =  true;
        updatePlayer();

    }
    public void updatePlayer() {
        turn = (turn == 'w' ? 'b' : 'w');
    }

    public void reset() {
        updatePlayer();
        board = old_board.clone();
        canReset = false;
    }
    public Piece[] getBoard() {
        return board;
    }
    public Boolean getCanReset() {
        return canReset;
    }
 }
