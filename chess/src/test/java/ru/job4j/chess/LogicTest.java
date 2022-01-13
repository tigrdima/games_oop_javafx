package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {

        Logic logic = new Logic();

        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        logic.add(bishopBlack);
        Cell source = Cell.C1;
        Cell dest = Cell.H6;

        logic.move(source, dest);

        boolean rsl = bishopBlack.position().equals(dest);
        assertThat(rsl, is(true));
    }
}