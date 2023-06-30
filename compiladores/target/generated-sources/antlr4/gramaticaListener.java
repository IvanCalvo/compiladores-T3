// Generated from gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(gramaticaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(gramaticaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(gramaticaParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(gramaticaParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(gramaticaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(gramaticaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(gramaticaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(gramaticaParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(gramaticaParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(gramaticaParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(gramaticaParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(gramaticaParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(gramaticaParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(gramaticaParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(gramaticaParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(gramaticaParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(gramaticaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(gramaticaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(gramaticaParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(gramaticaParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(gramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(gramaticaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(gramaticaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(gramaticaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(gramaticaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(gramaticaParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(gramaticaParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(gramaticaParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(gramaticaParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(gramaticaParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(gramaticaParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(gramaticaParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(gramaticaParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(gramaticaParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(gramaticaParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(gramaticaParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(gramaticaParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(gramaticaParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(gramaticaParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(gramaticaParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(gramaticaParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(gramaticaParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(gramaticaParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(gramaticaParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(gramaticaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(gramaticaParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(gramaticaParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(gramaticaParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(gramaticaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(gramaticaParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(gramaticaParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(gramaticaParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(gramaticaParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(gramaticaParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(gramaticaParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(gramaticaParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(gramaticaParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(gramaticaParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(gramaticaParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(gramaticaParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(gramaticaParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(gramaticaParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(gramaticaParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(gramaticaParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(gramaticaParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(gramaticaParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(gramaticaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(gramaticaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(gramaticaParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(gramaticaParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(gramaticaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(gramaticaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(gramaticaParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(gramaticaParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(gramaticaParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(gramaticaParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(gramaticaParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(gramaticaParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(gramaticaParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(gramaticaParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(gramaticaParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(gramaticaParser.Op_logico_2Context ctx);
}