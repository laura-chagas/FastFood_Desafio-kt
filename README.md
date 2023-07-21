### FASTFOOD TOTEM - DESAFIO EM KOTLIN
<hr>

# PAPA'S BURGUERIA BY LAURA XAVIER

## Open Classe Produto:

- Possui os atributos: **[var codigo: Int, var nome: String, var preco: Double, var qtd: Int]** em seu construtor.

### Classes Xburguer, Xsalada, Refrigerante e Suco

- Herdam os atributos de Produto, porém, possuem valores diferentes.
    - **Xburguer:** [Codigo = 100, Nome = Xburguer, Preco = 10.00]
    - **Xsalada:** [Codigo = 200, Nome = Xsalada, Preco = 12.00]
    - **Refrigerante:** [Codigo = 300, Nome = Refrigerante, Preco = 8.00]
    - **Suco:** [Codigo = 400, Nome = Suco, Preco = 6.00]

## Classe PapasBurgueriaClass:

- Possui:
    - **var carrinho = mutableListOf<Produto>()** - para armazenar as os objetos do tipo produto.
    - **var total: Double = 0.0** - para armazenar a soma dos valores de cada produto comprado.
  
- Recebe a instancia dos objetos:
    - **var newXburguer = Xburguer(100, "X-burguer", 10.00, 1)** - para registrar novos X-Burgueres
    - **var newXsalada = Xsalada(200, "X-salada", 12.00, 1)** - para registrar novos X-Saladas
    - **var newRefri = Refrigerante(300, "Refrigerante", 8.00, 1)** - para registrar novos Refrigerantes
    - **var newSuco = Suco(400, "Suco", 6.00, 1)** - para registrar novos Sucos

- Função **main()**: Seu objetivo é tornar o sistema feito executável.
- Função **criar(decisao: Int)**: Seu objetivo é gerar novos Produtos e adicionar no carrinho. Ele espera um inteiro para saber quantos serão adicionados, equanto a variável total recebe o seu valor acrescido da multiplicação do preço do produto com a sua quantidade (o produto é registrado por uma única unidade por vez)
- Função **remover()** - Seu objetivo é remover produtos já adicionados ao carrinho, em seguida, a variável total receberá um novo valor, que será o seu valor menos o preço do produto.
- Função **totalCarrinho()**: Seu objetivo é exibir a lista de produtos que contem em carrinho, em seguida, exibir o a soma de todos os objetos que ali estão.
- Função **pagarCompra(formaPagamento: Int)**: Seu objetivo é finalizar a compra que até então, foi efetuada. Ele espera um inteiro para decidir qual caminho recorrer, sendo:
  - **[1 - Cartão de Crédito, 2-Cartão de débito, 3 - Vale Refeição]** - Aqui é solicitado uma senha fictícia e em seguida, a mensagem do enunciado.
  - **[4 - Dinheiro]** - Nesse caso, o usuário precisa inserir quantos reais vai colocar, para que o sistema calcule e caso precise retorne o troco.
[...] Em seguida o método **.clear** é chamado para lista **carrinho** e a variável **total** é zerada, para que todo sistema seja reiniciado.

## Classe Menus:

- Função **menuPrincipal()**: Seu objetivo é direcionar o usuário para as demais funções, como escolher entre lanches e
  bebidas. Ele não permite a entrada de números (que não estão entre 1 e 2) e/ou letras/caracteres especiais.
- Função **menuLanches()**: Seu objetivo é direcionar o usuário para outras funções, como escolher entre os lanches:
  X-Burguer ou X-Salada. Ele não permite a entrada de números (que não estão entre 1 e 2) e/ou letras/caracteres
  especiais.
- Função **menuBebidas()**: Seu objetivo é direcionar o usuário para outras funções, como escolher entre as bebidas:
  Refrigerante ou Suco. Ele não permite a entrada de números (que não estão entre 1 e 2) e/ou letras/caracteres
  especiais.
- Função **decisaoFinal()**: Seu objetivo é direcionar o usuário para outras funções, como **[Comprar mais itens, Editar
  algum item, Remover algum item, Finalizar o pedido]**. Ele não permite a entrada de números (que não estão entre as
  opções) e/ou letras/caracteres especiais.
- Função **editarItem()**: Seu objetivo é fazer com que o usuário possa adicionar mais itens ao seu carrinho, através do
  código do produto, sendo **[100 - X-burguer], [200 - X-Salada], [300 - Refrigerante], [400 - Suco]**.
- Função **removerItem()**: Seu objetivo é fazer com que o usuário possa remover mais itens ao seu carrinho, através do
  código do produto, sendo **[100 - X-burguer], [200 - X-Salada], [300 - Refrigerante], [400 - Suco]**. Quando um código
  existente é inserido e não está no carrinho, o sistema exibe a mensagem "Ops, esse item não está no carrinho..."
- Função **finalizarPedido()**: Seu objetivo é fazer com que o usuário realize o pagamento de suas compras, sendo assim,
  ele deve escolher entre **[1 - Cartão de Crédito], [2-Cartão de débito], [3 - Vale Refeição], [4 - Dinheiro]**. Ele não
  permite a entrada de números (que não estão entre as opções) e/ou letras/caracteres especiais.


