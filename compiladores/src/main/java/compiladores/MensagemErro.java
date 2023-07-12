package compiladores;

import compiladores.AlgumaLexer;
import compiladores.AlgumaParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Interval;

public class MensagemErro implements ANTLRErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int column, String msg,
            RecognitionException e) {
        String erro = recognizer.getInputStream()
                .getText(new Interval(e.getOffendingToken().getStartIndex(), e.getOffendingToken().getStopIndex()));

        if (erro.equals("\"")) {
            throw new RuntimeException("Linha " + line + ": cadeia literal nao fechada");
        } else if (erro.equals("{")) {
            throw new RuntimeException("Linha " + line + ": comentario nao fechado");
        } else {
            throw new RuntimeException("Linha " + line + ": " + erro + " - simbolo nao identificado");
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