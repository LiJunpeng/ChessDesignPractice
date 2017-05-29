
public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Board b = new Board(2,2);
        b.setPiece(new ChessPiece("test1", 1), 0, 0);
        b.setPiece(new ChessPiece("test2", 2), 1,1);
        b.printBoard();
	}

}
