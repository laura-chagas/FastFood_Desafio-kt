package PapasBurgueria

open class Produto(var codigo: Int, var nome: String, var preco: Double, var qtd: Int){

}

class Xburguer(codigo: Int,  nome: String, preco: Double, qtd: Int): Produto(codigo, nome, preco, qtd) {

}

class Xsalada(codigo: Int,  nome: String, preco: Double, qtd: Int): Produto(codigo, nome, preco, qtd) {
}

class Refrigerante(codigo: Int,  nome: String, preco: Double, qtd: Int): Produto(codigo, nome, preco, qtd) {
}

class Suco(codigo: Int,  nome: String, preco: Double, qtd: Int): Produto(codigo, nome, preco, qtd) {
}