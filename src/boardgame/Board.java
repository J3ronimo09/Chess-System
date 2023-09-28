package boardgame;

public class Board {
    private int rows;
    private int colum;
    private Piece[][]pieces;

    public Board(int rows, int colum) {
        this.rows = rows;
        this.colum = colum;
        pieces = new Piece[rows][colum];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }
}
