package AlgoDat.lexer;

import AlgoDat.actionsPackage.*;
import AlgoDat.log.Log;
import AlgoDat.mapPackage.IMapFactory;
import AlgoDat.mapPackage.TreeMapFactory;
import AlgoDat.token.IToken;
import AlgoDat.token.Token;
import AlgoDat.triePackage.ITrie;
import AlgoDat.triePackage.ITrieReference;
import AlgoDat.triePackage.Trie;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class SimpleLexer implements ILexer{
    final private BufferedReader reader;
    final private IMapFactory mapFactory = new TreeMapFactory();
    final private IActionAtInsert action = new StringCoding(4711);
    final private ITrie trie;
    private String line;
    private StringTokenizer tk = null;

    public SimpleLexer(BufferedReader reader) throws IOException {
        this.reader = reader;
        line = reader.readLine();
        if (line != null) tk = new StringTokenizer(line);
        this.trie = new Trie(mapFactory);
    }

    public IToken getNextToken() throws IOException
    {
        Log.println(Log.URGENT, "--> next Token");
        ITrieReference ref = null;
        IToken result = null;
        boolean foundToken = false;
        boolean noMoreToken = false;
        do {
            result = null;
            if(tk != null) {
                if(tk.hasMoreTokens()) {
                    String intermediate = tk.nextToken();
                    Log.println(Log.URGENT, "--- next Token: "+ intermediate);
                    ref = trie.insert(intermediate, action);
                    result = new Token(-1, -1);
                    foundToken = true;
                }
                else
                {
                    tk = null;
                    line = reader.readLine();
                    if (line != null){
                        tk = new StringTokenizer(line);
                    }
                }
            }
            else
            {
                noMoreToken = true;
            }
        }

        while (!foundToken && !noMoreToken);
        Log.println(Log.URGENT, "<--- result Token: "+result);
        return result;
    }

    public String decode (IToken tk) throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("nochnichtimplementiert");
    }
    public String toString() {
        return "\nResult Trie \n" + trie;
    }
}