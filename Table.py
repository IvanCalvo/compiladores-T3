class Table:
    class Tipos:
        INT = 0
        REAL = 1
        CADEIA = 2
        LOGICO = 3
        INVALIDO = 4
        TIPO = 5
        IDENT = 6

    class InSymbol:
        def __init__(self, name, tipo):
            self.name = name
            self.tipo = tipo

    def __init__(self):
        self.myTable = {}

    def insert(self, name, tipo):
        input_symbol = self.InSymbol(name, tipo)
        self.myTable[name] = input_symbol

    def verify(self, name):
        return self.myTable[name].tipo

    def exists(self, name):
        return name in self.myTable

