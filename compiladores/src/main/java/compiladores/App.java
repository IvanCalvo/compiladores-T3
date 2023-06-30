package compiladores;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
//import compiladores.t3.AlgumaParser;

//import compiladores.t3.AlgumaParser.ProgramaContext;

public class App 
{
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        gramaticaLexer lexer = new gramaticaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramaticaParser parser = new gramaticaParser(tokens);
        int val = parser.programa().val;
        System.out.println("Valor = " + val);
}
}
