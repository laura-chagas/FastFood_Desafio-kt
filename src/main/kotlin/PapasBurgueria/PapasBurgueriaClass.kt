package PapasBurgueria

var carrinho = mutableListOf<Produto>()
var total: Double = 0.0
var newXburguer = Xburguer(100, "X-burguer", 10.00, 1)
var newXsalada = Xsalada(200, "X-salada", 12.00, 1)
var newRefri = Refrigerante(300, "Refrigerante", 8.00, 1)
var newSuco = Suco(400, "Suco", 6.00, 1)

fun main() {
    val newMenu = Menus()
    newMenu.menuInicial()
}
class PapasBurgueriaClass {
    fun totalCarrinho() {
        println("----------CARRINHO----------")
        for (i in carrinho) {
            println("nome: ${i.nome} codigo: ${i.codigo}  preco: ${i.preco}")
        }
        println("Total: $total")
    }

}