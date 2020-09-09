package day17;

public class ChessBoard {
    private static ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }
    public static void print(ChessBoard chessBoard) {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j]);
            }
            System.out.println();
        }
    }
}
