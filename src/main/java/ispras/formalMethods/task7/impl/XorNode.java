package ispras.formalMethods.task7.impl;

import ispras.formalMethods.task7.api.Node;
import ispras.formalMethods.task7.api.Symbol;

import static ispras.formalMethods.task7.api.Symbol.ZERO;

public class XorNode implements Node {
  private final Node firstArgument;
  private final Node secondArgument;

  public XorNode(Node firstArgument, Node secondArgument) {
    this.firstArgument = firstArgument;
    this.secondArgument = secondArgument;
  }

  @Override
  public Symbol requestValue() {
    var firstArgumentValue = firstArgument.requestValue();
    var secondArgumentValue = secondArgument.requestValue();
    return xor(firstArgumentValue, secondArgumentValue);
  }

  private static Symbol xor(Symbol a, Symbol b) {
    if (a == ZERO) {
      return b;
    }
    if (b == ZERO) {
      return a;
    }
    return ZERO;
  }
}
