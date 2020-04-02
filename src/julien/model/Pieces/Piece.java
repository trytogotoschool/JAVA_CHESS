package julien.model.Pieces;

public class Piece {

    private char color;
    private int type;
   public Piece(char color, int type) {
       this.color = color;
       this.type = type;
   }
   public int getColor() {
       return color;
   }
   public int getType() {
       return type;
   }
}
