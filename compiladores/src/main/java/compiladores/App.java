package compiladores;
import java.io.File;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class App {

    public static void main(String args[]) {
        try(PrintWriter p = new PrintWriter(new File(args[1]))) {//saida
            CharStream c = CharStreams.fromFileName(args[0]);//entrada
            AlgumaLexer lex = new AlgumaLexer(c);
            CommonTokenStream cs = new CommonTokenStream(lex); //conversão para token stream
            AlgumaParser parser = new AlgumaParser(cs);
            AlgumaParser.ProgramaContext arvore = parser.programa();   
            AlgumaSemantico as = new AlgumaSemantico();  
            as.visitPrograma(arvore);
            for(String err: AlgumaSemanticoUtils.errosSemanticos){
                p.println(err);
            }
            p.println("Fim da compilacao");
            p.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}