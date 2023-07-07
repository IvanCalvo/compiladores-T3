package compiladores;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import compiladores.AlgumaParser.Exp_aritmeticaContext;
import compiladores.AlgumaParser.ExpressaoContext;
import compiladores.AlgumaParser.FatorContext;
import compiladores.AlgumaParser.Fator_logicoContext;
import compiladores.AlgumaParser.ParcelaContext;
import compiladores.AlgumaParser.TermoContext;
import compiladores.AlgumaParser.Termo_logicoContext;
import compiladores.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d:%d - %s", linha, coluna, mensagem));
    }
    
    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (Termo_logicoContext ta : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (Fator_logicoContext ta : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Fator_logicoContext ctx) {
        return verificar(escopos, ctx.parcela_logica());
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Parcela_logicaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        if(ctx.exp_relacional() != null){
            ret = verificar(escopos, ctx.exp_relacional());
        } else{
            ret = TabelaDeSimbolos.TipoAlguma.LOGICO;
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Exp_relacionalContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        if(ctx.op_relacional() != null){
            for (Exp_aritmeticaContext ta : ctx.exp_aritmetica()) {
                TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, ta);
                Boolean auxNumeric = aux == TabelaDeSimbolos.TipoAlguma.REAL || aux == TabelaDeSimbolos.TipoAlguma.INTEIRO;
                Boolean retNumeric = ret == TabelaDeSimbolos.TipoAlguma.REAL || ret == TabelaDeSimbolos.TipoAlguma.INTEIRO;
                if (ret == null) {
                    ret = aux;
                } else if (!(auxNumeric && retNumeric) && aux != ret) {
                    ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
                }
            }
            if(ret != TabelaDeSimbolos.TipoAlguma.INVALIDO){
                ret = TabelaDeSimbolos.TipoAlguma.LOGICO;
            }
        } else {
            ret = verificar(escopos, ctx.exp_aritmetica(0));
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (TermoContext ta : ctx.termo()) {
            TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (FatorContext fa : ctx.fator()) {
            TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, fa);
            Boolean auxNumeric = aux == TabelaDeSimbolos.TipoAlguma.REAL || aux == TabelaDeSimbolos.TipoAlguma.INTEIRO;
            Boolean retNumeric = ret == TabelaDeSimbolos.TipoAlguma.REAL || ret == TabelaDeSimbolos.TipoAlguma.INTEIRO;
            if (ret == null) {
                ret = aux;
            } else if (!(auxNumeric && retNumeric) && aux != ret) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }
    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (ParcelaContext fa : ctx.parcela()) {
            TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }
    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.ParcelaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;

        if(ctx.parcela_nao_unario() != null){
            ret = verificar(escopos, ctx.parcela_nao_unario());
        }
        else {
            ret = verificar(escopos, ctx.parcela_unario());
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Parcela_nao_unarioContext ctx) {
        if (ctx.identificador() != null) {
            return verificar(escopos, ctx.identificador());
        }
        return TabelaDeSimbolos.TipoAlguma.CADEIA;
    }

    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.IdentificadorContext ctx) {//kk suspeitos
        String nomeVar = "";
        TabelaDeSimbolos.TipoAlguma ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
        for(int i = 0; i < ctx.IDENT().size(); i++){
            nomeVar += ctx.IDENT(i).getText();
            if(i != ctx.IDENT().size() - 1){
                nomeVar += ".";
            }
        }
        for(TabelaDeSimbolos tabela : escopos.percorrerEscoposAninhados()){
            if (tabela.existe(nomeVar)) {
                ret = verificar(escopos, nomeVar);
            }
        }
        System.out.println(nomeVar);
        return ret;
    }
    
    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, AlgumaParser.Parcela_unarioContext ctx) {
        if (ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoAlguma.INTEIRO;
        }
        if (ctx.NUM_REAL() != null) {
            return TabelaDeSimbolos.TipoAlguma.REAL;
        }
        if(ctx.identificador() != null){
            return verificar(escopos, ctx.identificador());
        }
        if (ctx.IDENT() != null) {
            TabelaDeSimbolos.TipoAlguma ret = null;
            ret = verificar(escopos, ctx.IDENT().getText());
            for (ExpressaoContext fa : ctx.expressao()) {
                TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, fa);
                if (ret == null) {
                    ret = aux;
                } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                    ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
                }
            }
            return ret;
        } else {
            TabelaDeSimbolos.TipoAlguma ret = null;
            for (ExpressaoContext fa : ctx.expressao()) {
                TabelaDeSimbolos.TipoAlguma aux = verificar(escopos, fa);
                if (ret == null) {
                    ret = aux;
                } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                    ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
                }
            }
            return ret;
        }
    }
    
    public static TabelaDeSimbolos.TipoAlguma verificar(Escopos escopos, String nomeVar) {
        TabelaDeSimbolos.TipoAlguma type = null;
        for(TabelaDeSimbolos tabela : escopos.percorrerEscoposAninhados()){
            type = tabela.verificar(nomeVar);
        }
        return type;
    }
}