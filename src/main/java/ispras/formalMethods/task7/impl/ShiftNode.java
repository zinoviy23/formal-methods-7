package ispras.formalMethods.task7.impl;

import ispras.formalMethods.task7.api.Node;
import ispras.formalMethods.task7.api.Symbol;

import java.util.Objects;

public class ShiftNode implements Node {
  private boolean isRequestingValue;
  private Symbol previousValue;

  private Node input;
  private Symbol currentValue = Symbol.ZERO;

  public ShiftNode(Node input) {
    this.input = input;
  }

  public ShiftNode() {
  }

  void setInput(Node input) {
    this.input = input;
  }

  @Override
  public Symbol requestValue() {
    if (isRequestingValue) {
      return previousValue;
    }

    previousValue = currentValue;

    isRequestingValue = true;
    currentValue = Objects.requireNonNull(input.requestValue(), "Call setInput");
    isRequestingValue = false;

    return previousValue;
  }
}
