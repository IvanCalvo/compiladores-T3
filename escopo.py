class Escopo:
    def __init__(self):
        self.pilha = []  # empilhando tabelas

    def create(self):
        self.pilha.append(Table())

    def getEscopo(self):
        return self.pilha[-1]

    def getPilha(self):
        return self.pilha

    def dropEscopo(self):
        self.pilha.pop()