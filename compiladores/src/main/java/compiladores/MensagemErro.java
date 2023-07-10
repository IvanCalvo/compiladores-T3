package compiladores;

import compiladores.AlgumaLexer;
import compiladores.AlgumaParser;

import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import java.util.BitSet;



public class MensagemErro implements ANTLRErrorListener {
    public PrintWriter p;

    static boolean got_error = false; // utilizado para evitar impressões após encontrar primeiro erro
    public MensagemErro(PrintWriter p){
        this.p = p;
    }

   

    @Override
    public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
            RecognitionException arg5) {
        
        // TODO Auto-generated method stub
        // Conversão do token stream para token unico
        Token t = (Token) arg1;
        String text = t.getText();
        // o texto de EOF vem com <>, portanto aqui realiza uma conversão em tal caso
        if(text == "<EOF>")
            text = "EOF";
        String aType = AlgumaLexer.VOCABULARY.getDisplayName(t.getType()); // Converte o tipo desse token para string
        if(!got_error){

            if(aType == "Nao_Fechado"){ //Caso seja comentario nao fechado
                p.println("Linha " + t.getLine() + ": " + "comentario nao fechado");
                MensagemErro.got_error = true;
            }
            else if(aType == "Literal_Nao_Fechada"){ //Caso seja literal "" nao fechado
                p.println("Linha " + t.getLine() + ": " + "cadeia literal nao fechada");
                MensagemErro.got_error = true;
            }
            else if(aType == "ERR"){ //Em caso de Simbolo nao identificado
                p.println("Linha " + t.getLine() + ": " + text + " - simbolo nao identificado");
                MensagemErro.got_error = true;
            }
            else{
                p.println("Linha " + arg2 + ": erro sintatico proximo a " + text);
                MensagemErro.got_error = true;
            }
        }

        
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
            BitSet ambigAlts, ATNConfigSet configs) {
        // Implementação vazia, caso não precise ser tratada a ambiguidade
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
            BitSet conflictingAlts, ATNConfigSet configs) {
        // Implementação vazia, caso não precise ser relatada uma tentativa de contexto
        // completo
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
            ATNConfigSet configs) {
        // Implementação vazia, caso não precise ser relatada uma sensibilidade de
        // contexto
    }
}