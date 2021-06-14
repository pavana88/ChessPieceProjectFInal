
public class Knight extends Piece implements ChessPiece{

    public Knight(int row, int column, boolean isWhite){
        super(row, column, "Knight", isWhite);
    }

    @Override
    public boolean pieceMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();

        if((Math.abs(row - currentRow) == 2 && Math.abs(col - currentCol) == 1) ||
                (Math.abs(row - currentRow) == 1 && Math.abs(col - currentCol) == 2)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean pieceKill(int row, int col) {
        if(pieceMove(row, col)){

            return true;
        }else{
            return false;
        }    }
}