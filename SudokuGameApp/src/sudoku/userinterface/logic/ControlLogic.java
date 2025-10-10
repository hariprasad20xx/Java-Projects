package sudoku.userinterface.logic;

import sudoku.problemdomain.IStorage;
import sudoku.userinterface.IUserInterfaceContract;

public class ControlLogic implements IUserInterfaceContract.EventListener {

    private IStorage storage;

    private IUserInterfaceContract.View view;

    public ControlLogic(IStorage storage, IUserInterfaceContract.View view) {
        this.storage = storage;
        this.view = view;
    }

    @Override
    public void onSudokuInput(int x, int y, int input) {

    }

    @Override
    public void onDialogClick() {

    }
}
