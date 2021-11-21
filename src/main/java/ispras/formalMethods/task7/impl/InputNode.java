package ispras.formalMethods.task7.impl;

import ispras.formalMethods.task7.api.Node;
import ispras.formalMethods.task7.api.Symbol;
import java.util.Objects;

public class InputNode implements Node {
  private Symbol currentInputValue;

  public void setInput(Symbol value) {
    currentInputValue = value;
  }

  @Override
  public Symbol requestValue() {
    var result = Objects.requireNonNull(currentInputValue, "Pass input!");
    currentInputValue = null;
    return result;
  }
}
