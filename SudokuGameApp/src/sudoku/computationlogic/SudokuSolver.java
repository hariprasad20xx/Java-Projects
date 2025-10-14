package sudoku.computationlogic;

import sudoku.problemdomain.Coordinates;

import static sudoku.problemdomain.SudokuGame.GRID_BOUNDARY;

public class SudokuSolver {
    public static boolean puzzleIsSolvable(int[][] puzzle) {
        Coordinates[] emptyCells = typeWritereEnumerate(puzzle);
    }

    private static Coordinates[] typeWritereEnumerate(int[][] puzzle) {
        Coordinates[] emptyCells = new Coordinates[40];
        int iterator = 0;
        for (int y = 0; y < GRID_BOUNDARY; y++) {
            for (int x = 0; x < GRID_BOUNDARY; x++) {
                if (puzzle[x][y] == 0) {
                    emptyCells[iterator] = new Coordinates(x, y);
                    if (iterator == 39) {
                        return emptyCells;
                    }
                    iterator++;
                }
            }
        }
        return emptyCells;
    }
}
