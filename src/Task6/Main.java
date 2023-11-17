package Task6;

public class Main {
    public static void main(String[] args) {
        King king = new King(2, 4, "\u265A", "black");
        Queen queen = new Queen(3, 9, "\u265B", "white");
        Bishop bishop = new Bishop(11, 7, "\u265D", "white");
        Rook rook = new Rook(6, 1, "\u265C", "black");
        Pawn pawn = new Pawn(3, 11, "\u265F", "black");

        king.getCoordinates();
        king.move();
        king.getCoordinates();
        System.out.println(king);
        System.out.println();

        queen.getCoordinates();
        queen.move();
        queen.getCoordinates();
        System.out.println(queen);
        System.out.println();


        bishop.getCoordinates();
        bishop.move();
        bishop.getCoordinates();
        System.out.println(bishop);
        System.out.println();


        rook.getCoordinates();
        rook.move();
        rook.getCoordinates();
        System.out.println(rook);
        System.out.println();


        pawn.getCoordinates();
        pawn.move();
        pawn.getCoordinates();
        System.out.println(pawn);
        System.out.println();

    }
}
