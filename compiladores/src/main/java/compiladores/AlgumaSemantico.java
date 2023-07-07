package compiladores;

import compiladores.AlgumaParser.Declaracao_globalContext;
import compiladores.AlgumaParser.Declaracao_localContext;
import compiladores.AlgumaParser.DeclaracoesContext;
import compiladores.AlgumaParser.ProgramaContext;
import compiladores.AlgumaParser.IdentificadorContext;
import compiladores.AlgumaParser.CmdAtribuicaoContext;
import compiladores.AlgumaParser.Tipo_basico_identContext;
import compiladores.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {
    TabelaDeSimbolos tabela;

    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(AlgumaParser.Declaracao_localContext ctx){
        String nomeVar = ctx.variavel().getText();
        String strTipoVar = ctx.tipo().getText();
        TipoAlguma tipoVar = TipoAlguma.INVALIDO;
        switch (strTipoVar) {
            case "INTEIRO":
                tipoVar = TipoAlguma.INTEIRO;
                break;
            case "REAL":
                tipoVar = TipoAlguma.REAL;
                break;
            default:
                // Nunca irá acontecer, pois o analisador sintático
                // não permite
                break;
        }

        // Verificar se a variável já foi declarada
        if (tabela.existe(nomeVar)) {
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.variavel().getSymbol(), "Variável " + nomeVar + " já existe");
        } else {
            tabela.adicionar(nomeVar, tipoVar);
        }

        return super.visitDeclaracao_local(ctx);

    }


}