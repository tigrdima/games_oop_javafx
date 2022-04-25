package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BishopBlackTest {

    @Test
    public void moveIsDiagonalIsTrue() {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        logic.add(bishopBlack);
        Cell source = Cell.C8;
        Cell dest = Cell.A6;

        boolean rsl = bishopBlack.isDiagonal(source, dest);

        assertTrue(rsl);
    }

    @Test
    public void moveIsDiagonalIsFalse() {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        logic.add(bishopBlack);
        Cell source = Cell.C8;
        Cell dest = Cell.A7;

        boolean rsl = bishopBlack.isDiagonal(source, dest);

        assertFalse(rsl);
    }
}