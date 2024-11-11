CleanNow - Sistema de Lavanderia
Descrição do Projeto
CleanNow é um sistema de gerenciamento para lavanderias, com funcionalidades que incluem:

Cadastro de clientes, incluindo clientes VIP com plano de assinatura.
Cadastro de serviços como lavagem, secagem, etc.
Agendamento de coleta e entrega de pedidos.
Rastreamento e atualização de status de pedidos.
Histórico de serviços realizados.
Pagamentos com opção de assinatura.
Estrutura do Projeto
css
Copiar código
CleanNow
├── src
│   ├── Agendamento
│   │   └── Agendamento.java
│   ├── Cliente
│   │   ├── Cliente.java
│   │   ├── ClienteVIP.java
│   │   └── HistoricoCliente.java
│   ├── Main
│   │   └── Main.java
│   ├── Pagamento
│   │   └── Pagamento.java
│   ├── Pedido
│   │   ├── Pedido.java
│   │   └── StatusPedido.java
│   ├── PlanoAssinatura
│   │   └── PlanoAssinatura.java
│   └── Servico
│       └── Servico.java
└── README.md
Pré-requisitos
Java JDK 8 ou superior.
Um editor de código ou IDE que suporte Java (Visual Studio Code, IntelliJ IDEA, Eclipse, etc).
Extensão Java para Visual Studio Code (caso utilize este editor).
Passo a Passo para Executar o Projeto
1. Clonar ou Baixar o Projeto
Você pode clonar ou baixar este repositório usando o comando:

bash
Copiar código
git clone <URL_DO_REPOSITORIO>
2. Navegar para o Diretório do Projeto
bash
Copiar código
cd CleanNow
3. Estrutura do Projeto
O código-fonte está localizado na pasta src. Certifique-se de que os arquivos estão organizados corretamente de acordo com os pacotes.

4. Compilar o Projeto Usando a Linha de Comando
Navegue para o diretório src:

bash
Copiar código
cd src
Compile os arquivos .java:

bash
Copiar código
javac -d out Main/Main.java
Isso compilará os arquivos e os colocará no diretório out.

5. Executar o Projeto Usando a Linha de Comando
Após a compilação, execute o projeto usando o comando:

bash
Copiar código
java -cp out Main.Main
6. Executar Usando um IDE
Se você preferir usar um IDE (Visual Studio Code, IntelliJ IDEA, Eclipse):

Abra o projeto na sua IDE.
Navegue até o arquivo Main.java.
Clique com o botão direito e selecione Run ou use o atalho de execução (por exemplo, Ctrl + F5 no Visual Studio Code).
7. Funcionalidades do Sistema
Cadastro de Clientes: A classe Cliente permite criar clientes regulares e ClienteVIP permite criar clientes VIP com planos de assinatura.
Cadastro de Serviços: A classe Servico permite definir diferentes tipos de serviços com preços.
Agendamento: A classe Agendamento permite agendar a coleta e entrega dos pedidos.
Pedidos: A classe Pedido permite gerenciar pedidos, incluindo seu status.
Histórico: A classe HistoricoCliente gerencia o histórico de serviços dos clientes.
8. Exemplos de Uso
O arquivo Main.java contém um exemplo básico de uso:

java
Copiar código
Cliente cliente = new Cliente("João Silva", "123456789", "Normal");
PlanoAssinatura planoVIP = new PlanoAssinatura("Gold", 99.99);
ClienteVIP clienteVIP = new ClienteVIP("Maria Oliveira", "987654321", planoVIP, 0.10);

Servico lavagem = new Servico("Lavagem", 20.0);
Pedido pedido1 = new Pedido(1, lavagem);
cliente.adicionarPedido(pedido1);

Agendamento agendamento = new Agendamento(new Date(), new Date());

System.out.println("Cliente: " + cliente.getNome());
System.out.println("Pedido Status: " + pedido1.getStatus());
9. Melhorias Futuras
Interface gráfica para interações mais amigáveis com o usuário.
Notificações automáticas sobre o status do pedido.
Persistência de dados em um banco de dados ou arquivo.
Validações e tratamento de erros mais robustos.
Problemas e Soluções
Problema Comum: Pacote Não Reconhecido
Se você encontrar um erro como package does not exist, verifique:

Se a estrutura de diretórios está correta.
Se a declaração de package nos arquivos está alinhada com o caminho do diretório.
Recompilação do Projeto
Em caso de mudanças, limpe e recompile o projeto para garantir que todas as mudanças sejam aplicadas corretamente.

bash
Copiar código
javac -d out Main/Main.java
Isso conclui a configuração e execução básica do projeto "CleanNow"! Sinta-se à vontade para fazer melhorias e personalizar de acordo com as suas necessidades.