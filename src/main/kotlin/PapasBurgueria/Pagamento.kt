package PapasBurgueria

class Pagamento {

    fun pagarCompra(formaPagamento: Int) {

        when (formaPagamento) {
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
                if (pagamento > total) {
                    val troco = pagamento - total
                    println("Compra finalizada com sucesso! Boa refeição! ")
                    println("Seu troco: $troco")
                } else {
                    println("Compra finalizada com sucesso! Boa refeição! ")
                }
            }
        }
        carrinho.clear()
        total = 0.0

    }
}