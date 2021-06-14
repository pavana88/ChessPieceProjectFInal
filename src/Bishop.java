public class Bishop extends Piece implements ChessPiece{

    public Bishop(int row, int column, boolean isWhite){
        super(row, column, "Bishop", isWhite);
    }

    @Override
    public boolean pieceMove(int row, int col) {
        if(row > 9 || col > 9){
            return false;
        }
        int currentRow = this.getRow();
        int currentCol = this.getColumn();


        if(Math.abs(currentRow-row) == Math.abs(currentCol - col)){
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