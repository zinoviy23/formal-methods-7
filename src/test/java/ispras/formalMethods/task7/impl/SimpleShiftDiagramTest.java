package ispras.formalMethods.task7.impl;

import ispras.formalMethods.task7.api.Symbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleShiftDiagramTest {
  @Test
  void simpleTest() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(Symbol.ZERO, shiftDiagram.apply(Symbol.ZERO));
  }
}