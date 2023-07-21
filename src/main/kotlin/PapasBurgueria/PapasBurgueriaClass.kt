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

fun criarXburguer(decisao: Int){
        for (i in 1..decisao) {
        total += newXburguer.qtd * newXburguer.preco
        carrinho.add(newXburguer)
    }
}

fun removerXburguer(){
    carrinho.remove(newXburguer)
    total -= newXburguer.preco
}

fun criarXsalada(decisao: Int){

    for (i in 1..decisao) {
        total += newXsalada.qtd * newXsalada.preco
        carrinho.add(newXsalada)
    }
}

fun removerXsalada(){
    carrinho.remove(newXsalada)
    total -= newXsalada.preco
}

fun criarRefrigerante(decisao: Int){
    for (i in 1..decisao) {
        total += newRefri.qtd * newRefri.preco
        carrinho.add(newRefri)
    }
}

fun removerRefrigerante(){
    carrinho.remove(newRefri)
    total -= newRefri.preco
}

fun criarSuco(decisao: Int){
    for (i in 1..decisao) {
        total += newSuco.qtd * newSuco.preco
        carrinho.add(newSuco)
    }
}

fun removerSuco(){
    carrinho.remove(newSuco)
    total -= newSuco.preco
}

fun totalCarrinho(){
    println("----------CARRINHO----------")
    for (i in carrinho) {
        println("nome: ${i.nome} codigo: ${i.codigo}  preco: ${i.preco}")
    }
    println("Total: $total")
}

fun pagarCompra(formaPagamento: Int){

    when (formaPagamento){
        1 -> {
            println("Digite a senha: ")
            readln().toInt()
            println("Pagamento efetuado, aguarde a notinha...")

            println("Compra finalizada com sucesso! Boa refeição! ")
        }
        2 -> {
            println("Digite a senha: ")
            readln().toInt()
            println("Pagamento efetuado, aguarde a notinha...")

            println("Compra finalizada com sucesso! Boa refeição! ")
        }
        3 -> {
            println("Digite a senha: ")
            readln().toInt()
            println("Pagamento efetuado, aguarde a notinha...")
            println("Compra finalizada com sucesso! Boa refeição! ")
        }
        4 -> {
            println("Qual valor (em nota) será pago? ")
            val pagamento = readln().toInt()
            if (pagamento > total){
              val troco =  pagamento - total
                println("Compra finalizada com sucesso! Boa refeição! ")
                println("Seu troco: $troco")
            }else {
                println("Compra finalizada com sucesso! Boa refeição! ")
            }
        }
    }
    carrinho.clear()
    total = 0.0


}
