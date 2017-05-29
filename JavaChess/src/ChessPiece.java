
public class ChessPiece extends Piece {
    private String name;
    private int type;

    public ChessPiece(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public ChessPiece(String name, int type, int row, int col) {
        super.setRow(row);
        super.setCol(col);
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return String.valueOf(this.getType());
    }
}
