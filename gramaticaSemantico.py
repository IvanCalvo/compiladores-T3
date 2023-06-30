from gramaticaParser import *

import gramaticaVisitor
from escopo import Escopo

class gramaticaSemantico(gramaticaVisitor):
    def __init__(self):
        self.escopos = Escopo()

    def visitPrograma(self, ctx):
        return super().visitPrograma(ctx)

    def visitDeclaracao_constante(self, ctx):
        escopoAtual = self.escopos.getEscopo()
        if escopoAtual.exists(ctx.IDENT().getText()):
            SemanticoUtils.adicionarErroSemantico(ctx.start, "constante" + ctx.IDENT().getText() + " ja declarado anteriormente")
        else:
            tipo = Table.Tipos.INT
            if ctx.tipo_basico().getText() == "literal":
                tipo = Table.Tipos.CADEIA
            elif ctx.tipo_basico().getText() == "inteiro":
                tipo = Table.Tipos.INT
            elif ctx.tipo_basico().getText() == "real":
                tipo = Table.Tipos.REAL
            elif ctx.tipo_basico().getText() == "logico":
                tipo = Table.Tipos.LOGICO
            escopoAtual.insert(ctx.IDENT().getText(), tipo)

        return super().visitDeclaracao_constante(ctx)
    
    def visitDeclaracao_tipo(self, ctx):
        escopoAtual = self.escopos.getEscopo()
        if escopoAtual.exists(ctx.IDENT().getText()):
            SemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText() + " declarado duas vezes num mesmo escopo")
        else:
            escopoAtual.insert(ctx.IDENT().getText(), Table.Tipos.TIPO)
        return super().visitDeclaracao_tipo(ctx)

    def visitDeclaracao_variavel(self, ctx):
        escopoAtual = self.escopos.getEscopo()
        for id in ctx.variavel().identificador():
            if escopoAtual.exists(id.getText()):
                SemanticoUtils.adicionarErroSemantico(id.start, "identificador " + id.getText() + " ja declarado anteriormente")
            else:
                tipo = Table.Tipos.INT
                if ctx.variavel().tipo().getText() == "literal":
                    tipo = Table.Tipos.CADEIA
                elif ctx.variavel().tipo().getText() == "inteiro":
                    tipo = Table.Tipos.INT
                elif ctx.variavel().tipo().getText() == "real":
                    tipo = Table.Tipos.REAL
                elif ctx.variavel().tipo().getText() == "logico":
                    tipo = Table.Tipos.LOGICO
                escopoAtual.insert(id.getText(), tipo)
        return super().visitDeclaracao_variavel(ctx)

    def visitDeclaracao_global(self, ctx):
        escopoAtual = self.escopos.getEscopo()
        if escopoAtual.exists(ctx.IDENT().getText()):
            SemanticoUtils.adicionarErroSemantico(ctx.start, ctx.IDENT().getText() + " ja declarado anteriormente")
        else:
            escopoAtual.insert(ctx.IDENT().getText(), Table.Tipos.TIPO)
        return super().visitDeclaracao_global(ctx)

    def visitTipo_basico_ident(self, ctx):
        if ctx.IDENT() is not None:
            for escopo in self.escopos.getPilha():
                if not escopo.exists(ctx.IDENT().getText()):
                    SemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText() + " nao declarado")
        return super().visit
