<h1 align="center">API de Produtos com Spring Boot, PostgreSQL e JWT </h1>
<h3>Este projeto envolve a criação de uma API de Produtos que faz uma conexão com o Banco de Dados PostgreSQL,e autenticação com o Spring Security e JwT.</h3>



##  Funcionalidades

-  Autenticação de usuários com JWT
-  Cadastro, listagem e exclusão de produtos
-  Integração com PostgreSQL
-  Validações e tratamento de erros

---

##  Tecnologias Utilizadas

- Java 21+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- PostgreSQL
- Maven

---

##  Estrutura do Projeto
![image](https://github.com/user-attachments/assets/c5ed30d0-ae9e-4c4d-b404-7179e4434e3a)


## Endpoints de Autenticação
POST /auth/register → Criação de usuário <br>
POST /auth/login → Autenticação e geração do token JWT

Use o token para acessar os endpoints protegidos enviando no header: 

Authorization: Bearer SEU_TOKEN_JWT


![image](https://github.com/user-attachments/assets/7efc8efc-57c1-439b-b080-02e5b2576f90)
## 🚀 Como executar o projeto

Certifique-se de ter o **Java 21+** e o **Maven** instalados. Para verificar:

```bash
java -version
mvn -version
```
## 🔧 Passos para execução
Clone o repositório:
```
git clone https://github.com/Adryel0713/shop-api.git
cd shop-api
```

# Compile e instale as dependências:

```bash
mvn clean install
```
# Execute o projeto:

```bash
mvn spring-boot:run
```
A aplicação será iniciada em http://localhost:8080

## 📜 Logs e registros
Durante a execução, os logs serão exibidos diretamente no terminal. Eles incluem:

Status de inicialização do Spring Boot

Erros e exceções

Conexões com o banco de dados

## Requisições HTTP recebidas

```
# Listar todos os produtos (GET)
http://localhost:8080/api/products

# Procurar produtos por id (GET)
http://localhost:8080/api/products/{id}

# Deletar produtos por id (DELETE)
http://localhost:8080/api/products/{id}

# Inserir produtos (POST)
http://localhost:8080/api/products

# Registrar usuário (POST)
http://localhost:8080/auth/register

# Logar (POST)
http://localhost:8080/auth/login
```

## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.



