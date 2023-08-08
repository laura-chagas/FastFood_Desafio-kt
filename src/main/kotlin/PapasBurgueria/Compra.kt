package PapasBurgueria

class Compra {

    fun criarXburguer(decisao: Int): Boolean {
        for (i in 1..decisao) {
            total += newXburguer.qtd * newXburguer.preco
            carrinho.add(newXburguer)
        }
        return true
    }

    fun criarXsalada(decisao: Int): Boolean {

        for (i in 1..decisao) {
            total += newXsalada.qtd * newXsalada.preco
            carrinho.add(newXsalada)
        }
        return true
    }

    fun criarRefrigerante(decisao: Int): Boolean {
        for (i in 1..decisao) {
            total += newRefri.qtd * newRefri.preco
            carrinho.add(newRefri)
        }
        return true
    }

    fun criarSuco(decisao: Int): Boolean {
        for (i in 1..decisao) {
            total += newSuco.qtd * newSuco.preco
            carrinho.add(newSuco)
        }
        return true
    }

}