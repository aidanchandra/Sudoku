
/**
 * Kenny Akers
 * Mr. Paige
 * Homework #
 *
 */
public class Tester {

    public static void main(String[] args) {
        int[][] array = {
            {0, 0, 0, 3},
            {0, 0, 3, 0},
            {0, 3, 0, 0},
            {3, 0, 0, 0}
        };
        
        Board board = new Board(array);
        /*
        if (board.solve(0, 0, 1)) {
            board.print();
        }
        else {
            System.out.println("Did not solve");
        }
        */
        Board.Coordinate a = board.new Coordinate(0,0);
        for(int i = 0; i < 18; i++){
            System.out.println(a);
            a = a.nextCoordnate();
        }
        
    }

    /*
    4 5 1 2 3
    5 1 2 3 4
    1 2 3 4 5
    2 3 4 5 1
    3 4 5 1 2
     */
}
