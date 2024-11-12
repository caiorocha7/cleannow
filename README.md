# CleanNow
Sistema de Gestão para **Lavanderias** com Interface de Desktop e API

![logo](/docs/assets/logo.png)

## Descrição do Projeto
**CleanNow** é uma solução integrada para gestão de lavanderias, projetada com uma interface de desktop desenvolvida em **Electron**, um backend robusto em **Spring Boot** e possui suporte para persistência de dados com **Spring Data JPA** e banco de dados **H2**. A aplicação foi criada para facilitar o gerenciamento de serviços de lavanderia, pacotes de assinatura, agendamentos e atendimento a clientes, oferecendo uma experiência fluida tanto para usuários regulares quanto para clientes VIP. Esta aplicação foi desenvolvida como trabalho final da disciplina de Programação Orientada a Objetos do curso de Engenharia de Software - ICEV, ministrada pelo professor Samuel Vinicius.

## Estrutura do Projeto
A arquitetura do projeto foi projetada para garantir uma experiência de uso eficiente e segura, com uma interface de desktop amigável em Electron e um backend organizado e escalável em Spring Boot, utilizando os princípios de POO.

```plaintext
cleannow
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cleannow
│   │   │           └── cleannow
│   │   │               ├── model
│   │   │               │   ├── Agendamento.java
│   │   │               │   ├── Cliente.java
│   │   │               │   ├── ClienteVIP.java
│   │   │               │   ├── Pedido.java
│   │   │               │   ├── PlanoAssinatura.java
│   │   │               │   └── Servico.java
│   │   │               ├── controller
│   │   │               │   ├── AgendamentoController.java
│   │   │               │   ├── ClienteController.java
│   │   │               │   ├── ClienteVIPController.java
│   │   │               │   ├── PedidoController.java
│   │   │               │   ├── PlanoAssinaturaController.java
│   │   │               │   └── ServicoController.java
│   │   │               ├── repository
│   │   │               │   ├── AgendamentoRepository.java
│   │   │               │   ├── ClienteRepository.java
│   │   │               │   ├── ClienteVIPRepository.java
│   │   │               │   ├── PedidoRepository.java
│   │   │               │   ├── PlanoAssinaturaRepository.java
│   │   │               │   └── ServicoRepository.java
│   │   │               └── CleanNowApplication.java
│   │   └── resources
│   │       ├── templates
│   │       │   ├── agendamentos.html
│   │       │   ├── clientes.html
│   │       │   ├── clientes-vip.html
│   │       │   ├── pedidos.html
│   │       │   ├── planos-assinatura.html
│   │       │   └── servicos.html
│   │       └── application.properties
└── pom.xml
```

### Interface de Desktop com Electron
A interface da aplicação foi desenvolvida em Electron, permitindo que o sistema funcione como uma aplicação desktop nativa, com acesso direto às funcionalidades sem depender de um navegador. Com uma UI intuitiva e moderna, usuários podem acessar rapidamente o cadastro de clientes, pedidos, agendamentos, e realizar operações comuns de lavanderia. A integração com o backend ocorre via API, garantindo um fluxo contínuo de dados entre a interface e o servidor.

### Backend em Spring Boot com Boas Práticas de POO
O backend foi desenvolvido seguindo as melhores práticas de Programação Orientada a Objetos (POO), garantindo organização, manutenção facilitada e expansão futura. Entre as principais práticas aplicadas estão:

- **Encapsulamento**: Todas as propriedades das classes são privadas e acessadas por meio de métodos get e set, protegendo os dados internos e evitando acesso direto.

- **Abstração**: As responsabilidades foram separadas, com a criação de interfaces específicas para diferentes ações, como as operações de coleta e entrega, que podem variar conforme o tipo de cliente ou pedido.

- **Herança**: A classe ClienteVIP herda de Cliente, adicionando atributos e métodos específicos, como a possibilidade de descontos e planos de assinatura, permitindo reuso de código e especialização.

- **Polimorfismo**: Métodos se comportam de maneira distinta para clientes VIP e regulares. Por exemplo, a aplicação de descontos é feita de forma diferente para clientes VIP, onde um método especializado calcula automaticamente o valor reduzido.

## Funcionalidades
- **Aplicação Independente**: Uso de interface gráfica sem necessidade de navegadores ou conexão com internet.
- **Cadastro de Serviços e Pacotes**: Possibilidade de registrar diferentes tipos de serviços (ex.: lavagem a seco, passadoria) e pacotes de assinatura com preços diferenciados.
- **Gestão de Clientes**: Controle de clientes regulares e VIPs, com funcionalidades adicionais para os VIPs, como plano de assinatura e desconto automático.
- **Agendamento de Coletas e Entregas**: Interface prática para agendar e gerenciar coletas e entregas de roupas, com notificações e acompanhamento do status.
- **Cadastro de Pedidos**: Cada pedido é registrado com detalhes dos serviços solicitados, status, e valores aplicados, permitindo o controle financeiro e histórico de serviços.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Web**
- **NextJS**
- **Nextron**
- **H2 Database** (para desenvolvimento e testes)
- **Lombok**

## Screenshots
**Aplicação**
![aplicação inicial](/docs/assets/home-page.png)
**API**
![documentação api](/docs/assets/api-swagger.png)

## Configuração do Projeto
### Pré-requisitos
- Java 17 ou superior instalado
- Maven instalado

### Configuração e Execução
1. Clone o repositório:

   ```bash
   git clone https://github.com/caiorocha7/cleannow.git
   cd cleannow
   ```
#### API
   2. Acesse o projeto da API:

      ```bash
      cd api/cleannow
      ```

   3. Compile e instale as dependências:

      ```bash
      mvn clean install
      ```

   4. Execute a aplicação:

      ```bash
      mvn spring-boot:run
      ```

   5. Acesse a documentação no navegador em: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

#### Aplicação Electron
...

### Banco de Dados H2
- Acesse a interface de administração do banco de dados H2 em: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - **JDBC URL**: `jdbc:h2:mem:testdb`
  - **User**: `sa`
  - **Password**: (deixe em branco)

## Uso da API da Aplicação
| Recurso              | Endpoint             |
|----------------------|----------------------|
| **Clientes**         | `/clientes`          |
| **Clientes VIP**     | `/clientes-vip`      |
| **Agendamentos**     | `/agendamentos`      |
| **Pedidos**          | `/pedidos`           |
| **Serviços**         | `/servicos`          |
| **Planos de Assinatura** | `/planos-assinatura` |

## Contribuição
1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionei nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.