// Generated from java-escape by ANTLR 4.11.1
package compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(gramaticaParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(gramaticaParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(gramaticaParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(gramaticaParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(gramaticaParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(gramaticaParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(gramaticaParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(gramaticaParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(gramaticaParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(gramaticaParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(gramaticaParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(gramaticaParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(gramaticaParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(gramaticaParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(gramaticaParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(gramaticaParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(gramaticaParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(gramaticaParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(gramaticaParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(gramaticaParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(gramaticaParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(gramaticaParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(gramaticaParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(gramaticaParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(gramaticaParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(gramaticaParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(gramaticaParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(gramaticaParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(gramaticaParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(gramaticaParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(gramaticaParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(gramaticaParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(gramaticaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(gramaticaParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(gramaticaParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(gramaticaParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(gramaticaParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(gramaticaParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(gramaticaParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(gramaticaParser.Op_logico_2Context ctx);
}