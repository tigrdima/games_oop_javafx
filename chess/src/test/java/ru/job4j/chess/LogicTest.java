package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void figureNotFound() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        Cell source = Cell.C8;
        Cell dest = Cell.A6;
        logic.move(source, dest);
    }

    @Test(expected = OccupiedCellException.class)
    public void occupiedCell() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.clean();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new BishopBlack(Cell.A6));

        Cell source = Cell.C8;
        Cell dest = Cell.A6;
        logic.move(source, dest);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void impossibleMove() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));

        Cell source = Cell.C8;
        Cell dest = Cell.A7;
        logic.move(source, dest);
    }
}