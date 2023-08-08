package PapasBurgueria

class Remocao {

    fun removerXburguer() {
        carrinho.remove(newXburguer)
        total -= newXburguer.preco
    }

    fun removerXsalada() {
        carrinho.remove(newXsalada)
        total -= newXsalada.preco
    }

    fun removerRefrigerante() {
        carrinho.remove(newRefri)
        total -= newRefri.preco
    }

    fun removerSuco() {
        carrinho.remove(newSuco)
        total -= newSuco.preco
    }

}