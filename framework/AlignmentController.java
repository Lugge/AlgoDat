package AlgoDat.framework;


import AlgoDat.lexer.ILexer;
import AlgoDat.lexer.SimpleLexer;
import AlgoDat.token.IToken;

import java.io.*;


public class AlignmentController {
    final private String original;
    final private String suspect;

    public AlignmentController (String original, String suspect) {
        this.original = original;
        this.suspect = suspect;
    }

    public void run() throws FileNotFoundException, IOException
    {
        InputStream istreamOriginal = new FileInputStream(original);
        Reader readerOriginal = new InputStreamReader(istreamOriginal);
        BufferedReader inputOriginal = new BufferedReader(readerOriginal);

        ILexer lexer = new SimpleLexer(inputOriginal);
        IToken token = lexer.getNextToken();
        while (token != null) {
            System.out.println("Gelesen: " + token);
            token = lexer.getNextToken();
        }
    }

}
