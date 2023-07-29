import PapasBurgueria.Produto
import PapasBurgueria.Refrigerante
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class ProdutoTest {
    @Test
    fun `conferir se o nome de um novo produto esta sendo atribuido ao objeto corretamente`(){
        val newProduct = Produto(600, "Sorvete", 5.50, 1)
        assertEquals("Sorvete", newProduct.nome)
    }
    @Test
    fun `conferir se o codigo de um novo refrigerante esta sendo atribuido ao objeto corretamente`(){
        val newSoda = Refrigerante(100, "Refrigerante", 10.00, 1)
        assertEquals(100, newSoda.codigo)
    }
}