package ispras.formalMethods.task7.impl;

import ispras.formalMethods.task7.api.Diagram;
import ispras.formalMethods.task7.api.Node;
import ispras.formalMethods.task7.api.Symbol;

public class ShiftDiagram implements Diagram {
  private final InputNode inputNode;
  private final Node outputNode;

  public ShiftDiagram() {
    inputNode = new InputNode();
    Node firstShift = new ShiftNode(inputNode);
    Node secondShift = new ShiftNode(firstShift);
    ShiftNode thirdShift = new ShiftNode();
    Node xorNode = new XorNode(secondShift, thirdShift);
    thirdShift.setInput(xorNode);
    outputNode = thirdShift;
  }

  @Override
  public Symbol apply(Symbol input) {
    inputNode.setInput(input);
    return outputNode.requestValue();
  }
}
