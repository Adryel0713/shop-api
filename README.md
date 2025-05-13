<h1 align="center">API de Produtos com Spring Boot, PostgreSQL e JWT </h1>
<h3>Este projeto envolve a criação de uma API de Produtos que faz uma conexão com o Banco de Dados PostgreSQL,e autenticação com o Spring Security e JwT.</h3>



##  Funcionalidades

-  Autenticação de usuários com JWT
-  Cadastro, listagem e exclusão de produtos
-  Integração com PostgreSQL
-  Validações e tratamento de erros

---

##  Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- PostgreSQL
- Maven

---

##  Estrutura do Projeto
![image](https://github.com/user-attachments/assets/c5ed30d0-ae9e-4c4d-b404-7179e4434e3a)

## Application.properties
```sql
spring.datasource.url=jdbc:postgresql://localhost:5432/shop <br>
spring.datasource.username=postgres <br>
spring.datasource.password=1234 <br>
spring.datasource.driver-class-name=org.postgresql.Driver <br>
spring.jpa.hibernate.ddl-auto=update <br>
spring.jpa.show-sql=true <br>
spring.jpa.properties.hibernate.format_sql=true <br>
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect <br>
```

## Endpoints de Autenticação
POST /auth/register → Criação de usuário
POST /auth/login → Autenticação e geração do token JWT

Use o token para acessar os endpoints protegidos enviando no header:

Authorization: Bearer SEU_TOKEN_JWT
![image](https://github.com/user-attachments/assets/1ccb3ef2-0dc9-43bb-8916-9bb79783f834)
![image](https://github.com/user-attachments/assets/7efc8efc-57c1-439b-b080-02e5b2576f90)

## Observações
O projeto não possui interface gráfica .



