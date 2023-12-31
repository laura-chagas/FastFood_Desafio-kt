package PapasBurgueria

import kotlin.NumberFormatException

class Menus {
    fun menuInicial() {
        var dec = 0
        println("---------BEM VINDO---------")
        do {
            try {
                println("     ESCOLHA UMA OPÇÃO:    ")
                println("[1] LANCHES       [2] BEBIDAS")
                dec = readln().toInt()
                when (dec) {
                    1 -> {
                        menuLanches()
                    }

                    2 -> {
                        menuBebidas()
                    }

                    else -> {
                        println("Opção inválida, tente novamente")
                    }
                }
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
            }

        } while (dec != 1 && dec != 2)

    }

    private fun menuLanches() {
        var dec = 0
        do {
            try {
                println("          ESCOLHA A OPÇÃO:    ")
                println("[1] X-burguer          [2] X-salada")
                dec = readln().toInt()
                when (dec) {
                    1 -> {
                        println("Quantos X-burgueres você deseja? ")
                        val qtdxburguer = readln().toInt()
                        criarXburguer(qtdxburguer)
                    }

                    2 -> {
                        println("Quantos X-saladas você deseja? ")
                        val qtdXsalada = readln().toInt()
                        criarXsalada(qtdXsalada)
                    }

                    else -> {
                        println("Opção inválida, tente novamente")
                    }
                }
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
                menuLanches()
            }

        } while (dec != 1 && dec != 2)

        totalCarrinho()
        decisaoFinal()
    }

    private fun menuBebidas() {
        var dec = 0
        do {
            try {
                println("          ESCOLHA A OPÇÃO:    ")
                println("[1] Refrigerante          [2] Suco")
                dec = readln().toInt()
                when (dec) {
                    1 -> {
                        println("Quantos Refrigerantes você deseja? ")
                        val qtdRefri = readln().toInt()
                        criarRefrigerante(qtdRefri)
                    }

                    2 -> {
                        println("Quantos Sucos você deseja? ")
                        val qtdSuco = readln().toInt()
                        criarSuco(qtdSuco)
                    }

                    else -> {
                        println("Opção inválida, tente novamente")
                    }
                }
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
                menuBebidas()
            }

        } while (dec != 1 && dec != 2)
        totalCarrinho()
        decisaoFinal()
    }

    private fun decisaoFinal() {
        var dec = 0
        do {
            try {
                println("Você deseja: \n[1] Comprar mais itens     [2] Editar algum item     [3] Remover algum item    [4] Finalizar o pedido")
                val decisao = readln().toInt()

                when (decisao) {
                    1 -> {
                        menuInicial()
                    }

                    2 -> {
                        editarItem()
                    }

                    3 -> {
                        removerItem()
                    }

                    4 -> {
                        Thread.sleep(2000)
                        totalCarrinho()
                        finalizarPedido()
                    }
                }

            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
            }

        } while (dec !in 1..4)

    }

    private fun editarItem() {
        println("---------------------------Códigos---------------------------")
        println("[100] X-burguer  [200] X-Salada  [300] Refrigerantes    [400] Sucos\n")
        print("Por favor, digite o código do item o qual você deseja editar: ")
        var dec = 0
        do {
            try {
                val receberCodigo = readln().toInt()
                println()
                when (receberCodigo) {
                    100 -> {
                        print("Agora me diga quantos itens você deseja adicionar: ")
                        val receberquantidade = readln().toInt()
                        criarXburguer(receberquantidade)
                        totalCarrinho()

                    }

                    200 -> {
                        print("Agora me diga quantos itens você deseja adicionar: ")
                        val receberquantidade = readln().toInt()
                        criarXsalada(receberquantidade)
                    }

                    300 -> {
                        print("Agora me diga quantos itens você deseja adicionar: ")
                        val receberquantidade = readln().toInt()
                        criarRefrigerante(receberquantidade)
                    }

                    400 -> {
                        print("Agora me diga quantos itens você deseja adicionar: ")
                        val receberquantidade = readln().toInt()
                        criarSuco(receberquantidade)
                    }

                    else -> {
                        println("Opção inválida...\n")
                    }
                }
                totalCarrinho()
                decisaoFinal()

            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
            }

        }while (dec != 100 && dec != 200 && dec != 300 && dec != 400)
    }

    private fun removerItem() {
        println("---------------------------Códigos---------------------------")
        println("[100] X-burguer  [200] X-Salada  [300] Refrigerantes    [400] Sucos\n")
        print("Por favor, digite o código do item o qual você deseja remover: ")
        var dec = 0
        do {
            try {
                val receberCodigo = readln().toInt()
                println()
                when (receberCodigo) {
                    100 -> {
                        if (carrinho.contains(newXburguer)) {
                            println("X-BURGUER REMOVIDO COM SUCESSO :P\n")
                            removerXburguer()
                            totalCarrinho()

                        } else {
                            println("Ops, esse item não está no carrinho...\n")
                        }
                    }

                    200 -> {
                        if (carrinho.contains(newXsalada)) {
                            println("X-SALADA REMOVIDO COM SUCESSO :P\n")
                            removerXsalada()
                            totalCarrinho()

                        } else {
                            println("Ops, esse item não está no carrinho...\n")
                        }
                    }

                    300 -> {
                        if (carrinho.contains(newRefri)) {
                            println("REFRIGERANTE REMOVIDO COM SUCESSO :P\n")
                            removerRefrigerante()
                            totalCarrinho()

                        } else {
                            println("Ops, esse item não está no carrinho...\n")
                        }
                    }

                    400 -> {
                        if (carrinho.contains(newSuco)) {
                            println("SUCO REMOVIDO COM SUCESSO :P\n")
                            removerSuco()
                            totalCarrinho()

                        } else {
                            println("Ops, esse item não está no carrinho...\n")
                        }
                    }

                    else -> {
                        println("Opção inválida...\n")
                    }
                }
                decisaoFinal()

            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
            }
        } while (dec != 100 && dec != 200 && dec != 300 && dec != 400)
    }

    private fun finalizarPedido() {
        var dec = 0
        do {
            try {
                println("\nSelecione a forma de pagamento: \n[1]Cartão de Crédito \n[2]Cartão de débito \n[3]Vale Refeição  \n[4]Dinheiro")
                val formaDePagar = readln().toIntOrNull() ?: 0

                while (!(formaDePagar == 1 || formaDePagar == 2 || formaDePagar == 3 || formaDePagar == 4)) {
                    println("Opção inválida, tente novamente")
                    finalizarPedido()
                }
                pagarCompra(formaDePagar)
                println()
                Thread.sleep(5000)
                menuInicial()
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                println("Formato inválido, para escolher o item, você deve informar o número dele")
            }

        } while (dec !in 1..4)

            menuInicial()
    }

}