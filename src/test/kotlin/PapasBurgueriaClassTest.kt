import PapasBurgueria.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
class PapasBurgueriaClassTest{
    val papas = PapasBurgueriaClass()
    @Test
    fun criarXburguerEretornarTrue(){
       val xBurguer = papas.criarXburguer(2)
        assertEquals(true, xBurguer)
    }
    @Test
    fun criarXsaladaEretornarTrue(){
        val xSalada = papas.criarXsalada(1)
        assertEquals(true, xSalada)
    }
    @Test
    fun criarRefrigeranteEretornarTrue(){
        val refrigerante = papas.criarRefrigerante(1)
        assertEquals(true, refrigerante)
    }
    @Test
    fun criarSucoEretornarTrue(){
        val suco = papas.criarSuco(1)
        assertEquals(true, suco)
    }

    @Test
    fun verificarSehaAlgoNoCarrinho(){
        carrinho.add(newXburguer)
        assertEquals(true, carrinho.contains(newXburguer))
    }

    @Test
    fun verificarSeNaoHaAlgoNoCarrinhoAposRemover(){
        carrinho.remove(newXburguer)
        assertEquals(false, carrinho.contains(newXburguer))

    }

    @Test
    fun gerarNovosLanchesEverificarOcarrinho(){
         val xburguer = Xburguer(100, "X-Burguer", 10.00, 1)
         val xsalada = Xsalada(200,"X-salada",12.00,1)
         carrinho.add(xburguer)
         assertTrue(carrinho.contains(xburguer))
         assertFalse(carrinho.contains(xsalada))

       for (i in carrinho) {
            println("nome: ${i.nome} codigo: ${i.codigo}  preco: ${i.preco}")
        }
    }
    @Test
    fun gerarNovasBebidasEverificarOcarrinho(){
         val refrigerante = Refrigerante(300, "Refrigerante", 8.00, 1)
         val suco = Suco(400, "Suco", 6.00, 1)
         carrinho.add(refrigerante)
         assertTrue(carrinho.contains(refrigerante))
         assertFalse(carrinho.contains(suco))

       for (i in carrinho) {
            println("nome: ${i.nome} codigo: ${i.codigo}  preco: ${i.preco}")
        }
    }

}