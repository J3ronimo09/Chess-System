package boardgame;

public abstract class Piece {
    protected  Position Position;
    private  Board board;

    public Piece(Board board) {
        this.board = board;
        Position = null;
    }

    protected Board getBoard() {
        return board;
    }
    public abstract  boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColum()];
    }
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int e = 0; e < mat.length; e++){
            for (int l = 0; l <mat.length; l++){
                    if (mat[e][l]){
                        return true;
                    }
            }
        }
        return false;
    }


}
