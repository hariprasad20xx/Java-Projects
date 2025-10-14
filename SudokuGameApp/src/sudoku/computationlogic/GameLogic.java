package sudoku.computationlogic;

import sudoku.constants.GameState;
import sudoku.problemdomain.SudokuGame;

public class GameLogic {

    public static SudokuGame getNewGame() {
        return new SudokuGame(
                GameState.NEW,
                GameGenerator.getNewGameGrid()
        );
    }

}
