package ispras.formalMethods.task7.impl;

import org.junit.jupiter.api.Test;

import static ispras.formalMethods.task7.api.Symbol.ONE;
import static ispras.formalMethods.task7.api.Symbol.ZERO;
import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTests {
  // 0/0 0/0 0/0 0/0
  @Test
  void test1() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
  }

  // 1/0 0/0 0/0 0/1 0/1 0/1 0/1
  @Test
  void test2() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
  }

  // 1/0 0/0 0/0 1/1 0/1 0/1 0/0
  @Test
  void test3() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ONE));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
  }

  // 1/0 0/0 1/0 0/1 0/1 0/0 0/0
  @Test
  void test4() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
  }

  // 1/0 0/0 1/0 1/1 0/1 0/0 0/1
  @Test
  void test5() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ONE, shiftDiagram.apply(ONE));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
  }

  // 1/0 1/0 0/0 0/1 0/0 0/0 0/0
  @Test
  void test6() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
  }

  // 1/0 1/0 0/0 1/1 0/0 0/0 0/1
  @Test
  void test7() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
  }

  // 1/0 1/0 1/0 0/1 0/0 0/1 0/1
  @Test
  void test8() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
  }

  // 1/0 1/0 1/0 1/1 0/0 0/1 0/0
  @Test
  void test9() {
    var shiftDiagram = new ShiftDiagram();
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ONE));
    assertEquals(ONE, shiftDiagram.apply(ONE));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
    assertEquals(ONE, shiftDiagram.apply(ZERO));
    assertEquals(ZERO, shiftDiagram.apply(ZERO));
  }
}
