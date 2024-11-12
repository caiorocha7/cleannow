# CleanNow

## Descrição do Projeto

O **CleanNow** é um sistema de gerenciamento para lavanderias que oferece funcionalidades como cadastro de clientes, agendamento de serviços, rastreamento de pedidos, gerenciamento de planos de assinatura e muito mais. O projeto é construído utilizando **Spring Boot** com **Thymeleaf** para a interface de usuário, e possui suporte para persistência de dados com **Spring Data JPA** e banco de dados **H2**.
E criado para a matéria de Programação Orientada a Objetos ministrada pelo professor Samuel Vinicius.

## Estrutura do Projeto

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

## Funcionalidades

- **Cadastro de Clientes**: Permite criar, atualizar, listar e remover clientes.
- **Agendamento de Coletas e Entregas**: Gerenciamento de serviços de coleta e entrega.
- **Gerenciamento de Pedidos**: Criação, edição, listagem e exclusão de pedidos.
- **Gerenciamento de Serviços**: Cadastro e manutenção de tipos de serviços (lavagem, secagem, etc).
- **Planos de Assinatura**: Gestão de planos para clientes VIP com descontos e benefícios.
- **Interface com Thymeleaf**: Interface web para exibição de dados.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Web**
- **Thymeleaf**
- **H2 Database** (para desenvolvimento e testes)
- **Lombok**

## Configuração do Projeto

### Pré-requisitos

- Java 17 ou superior instalado
- Maven instalado

### Configuração e Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/cleannow.git
   cd cleannow
   ```

2. Compile e instale as dependências:

   ```bash
   mvn clean install
   ```

3. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação no navegador em: [http://localhost:8080](http://localhost:8080)

### Banco de Dados H2

- Acesse a interface de administração do banco de dados H2 em: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - **JDBC URL**: `jdbc:h2:mem:testdb`
  - **User**: `sa`
  - **Password**: (deixe em branco)

## Uso da Aplicação

- **Clientes**: `/clientes`
- **Clientes VIP**: `/clientes-vip`
- **Agendamentos**: `/agendamentos`
- **Pedidos**: `/pedidos`
- **Serviços**: `/servicos`
- **Planos de Assinatura**: `/planos-assinatura`

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionei nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto é licenciado sob os termos da [sua licença escolhida].
