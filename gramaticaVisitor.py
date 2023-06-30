# Generated from gramatica.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .gramaticaParser import gramaticaParser
else:
    from gramaticaParser import gramaticaParser

# This class defines a complete generic visitor for a parse tree produced by gramaticaParser.

class gramaticaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by gramaticaParser#programa.
    def visitPrograma(self, ctx:gramaticaParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#declaracoes.
    def visitDeclaracoes(self, ctx:gramaticaParser.DeclaracoesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#declaracao_local.
    def visitDeclaracao_local(self, ctx:gramaticaParser.Declaracao_localContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#variavel.
    def visitVariavel(self, ctx:gramaticaParser.VariavelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#identificador.
    def visitIdentificador(self, ctx:gramaticaParser.IdentificadorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#dimensao.
    def visitDimensao(self, ctx:gramaticaParser.DimensaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#tipo.
    def visitTipo(self, ctx:gramaticaParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#tipo_basico.
    def visitTipo_basico(self, ctx:gramaticaParser.Tipo_basicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#tipo_basico_ident.
    def visitTipo_basico_ident(self, ctx:gramaticaParser.Tipo_basico_identContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#tipo_estendido.
    def visitTipo_estendido(self, ctx:gramaticaParser.Tipo_estendidoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#valor_constante.
    def visitValor_constante(self, ctx:gramaticaParser.Valor_constanteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#registro.
    def visitRegistro(self, ctx:gramaticaParser.RegistroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#declaracao_global.
    def visitDeclaracao_global(self, ctx:gramaticaParser.Declaracao_globalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#parametro.
    def visitParametro(self, ctx:gramaticaParser.ParametroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#parametros.
    def visitParametros(self, ctx:gramaticaParser.ParametrosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#corpo.
    def visitCorpo(self, ctx:gramaticaParser.CorpoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmd.
    def visitCmd(self, ctx:gramaticaParser.CmdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdLeia.
    def visitCmdLeia(self, ctx:gramaticaParser.CmdLeiaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdEscreva.
    def visitCmdEscreva(self, ctx:gramaticaParser.CmdEscrevaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdSe.
    def visitCmdSe(self, ctx:gramaticaParser.CmdSeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdCaso.
    def visitCmdCaso(self, ctx:gramaticaParser.CmdCasoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdPara.
    def visitCmdPara(self, ctx:gramaticaParser.CmdParaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdEnquanto.
    def visitCmdEnquanto(self, ctx:gramaticaParser.CmdEnquantoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdFaca.
    def visitCmdFaca(self, ctx:gramaticaParser.CmdFacaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdAtribuicao.
    def visitCmdAtribuicao(self, ctx:gramaticaParser.CmdAtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdChamada.
    def visitCmdChamada(self, ctx:gramaticaParser.CmdChamadaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#cmdRetorne.
    def visitCmdRetorne(self, ctx:gramaticaParser.CmdRetorneContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#selecao.
    def visitSelecao(self, ctx:gramaticaParser.SelecaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#item_selecao.
    def visitItem_selecao(self, ctx:gramaticaParser.Item_selecaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#constantes.
    def visitConstantes(self, ctx:gramaticaParser.ConstantesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#numero_intervalo.
    def visitNumero_intervalo(self, ctx:gramaticaParser.Numero_intervaloContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op_unario.
    def visitOp_unario(self, ctx:gramaticaParser.Op_unarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#exp_aritmetica.
    def visitExp_aritmetica(self, ctx:gramaticaParser.Exp_aritmeticaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#termo.
    def visitTermo(self, ctx:gramaticaParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#fator.
    def visitFator(self, ctx:gramaticaParser.FatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op1.
    def visitOp1(self, ctx:gramaticaParser.Op1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op2.
    def visitOp2(self, ctx:gramaticaParser.Op2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op3.
    def visitOp3(self, ctx:gramaticaParser.Op3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#parcela.
    def visitParcela(self, ctx:gramaticaParser.ParcelaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#parcela_unario.
    def visitParcela_unario(self, ctx:gramaticaParser.Parcela_unarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#parcela_nao_unario.
    def visitParcela_nao_unario(self, ctx:gramaticaParser.Parcela_nao_unarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#exp_relacional.
    def visitExp_relacional(self, ctx:gramaticaParser.Exp_relacionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op_relacional.
    def visitOp_relacional(self, ctx:gramaticaParser.Op_relacionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#expressao.
    def visitExpressao(self, ctx:gramaticaParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#termo_logico.
    def visitTermo_logico(self, ctx:gramaticaParser.Termo_logicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#fator_logico.
    def visitFator_logico(self, ctx:gramaticaParser.Fator_logicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#parcela_logica.
    def visitParcela_logica(self, ctx:gramaticaParser.Parcela_logicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op_logico_1.
    def visitOp_logico_1(self, ctx:gramaticaParser.Op_logico_1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by gramaticaParser#op_logico_2.
    def visitOp_logico_2(self, ctx:gramaticaParser.Op_logico_2Context):
        return self.visitChildren(ctx)



del gramaticaParser