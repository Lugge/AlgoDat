package AlgoDat.lexer;

import AlgoDat.token.IToken;
import java.io.IOException;

public interface ILexer {
    IToken getNextToken() throws IOException;
    String decode (IToken tk);
}
