# ✅ API de Gerenciamento de Tarefas

Este é um projeto de API REST para um sistema de **To-Do List**, desenvolvido com **Java 21** e **Spring Boot**.  
Permite criar, listar, atualizar e deletar tarefas. Ideal para estudos de back-end com Spring, JPA e MySQL.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Lombok**
- **Postman (para testes)**

---

## ✨ Funcionalidades

- Criar uma nova tarefa
- Listar todas as tarefas
- Buscar tarefa por ID
- Atualizar tarefa existente
- Deletar tarefa

---
## 📫 Endpoints da API

| Método | URL                  | Descrição                          |
|--------|----------------------|------------------------------------|
| POST   | `/api/tarefas`       | Cria uma nova tarefa               |
| GET    | `/api/tarefas`       | Lista todas as tarefas             |
| GET    | `/api/tarefas/{id}`  | Busca uma tarefa por ID            |
| PUT    | `/api/tarefas/{id}`  | Atualiza uma tarefa existente      |
| DELETE | `/api/tarefas/{id}`  | Deleta uma tarefa pelo ID          |

## 🔍 Exemplo de corpo JSON para POST/PUT:

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Finalizar módulo de API REST",
  "concluida": false
}
```
---

## ⚙️ Como Executar o Projeto

## 1. Pré-requisitos

- Java 21 instalado
- Maven configurado
- MySQL em execução
- IDE como IntelliJ IDEA (ou Eclipse)

## 2. Clonar o Repositório

```bash
git clone ttps://github.com/ThiagoMarangoni-dev/gerenciador-de-tarefas-api.git
cd gerenciador-de-tarefas-api
```
## 3. Criar o Banco de Dados
Acesse seu MySQL e execute:

```
CREATE DATABASE gerenciador_db;
```

## Configurar application.properties
Abra o arquivo src/main/resources/application.properties e edite com suas credenciais:

```
spring.datasource.url=jdbc:mysql://localhost:3306/gerenciador_db
spring.datasource.username=seu_usuario_mysql
spring.datasource.password=sua_senha_mysql
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8080
```

## 5. Rodar o Projeto
Pelo terminal:

```
mvn spring-boot:run
```
Ou pela IDE:

Abra o projeto no IntelliJ
Aguarde o Maven importar as dependências
Vá até a classe GerenciadorTarefasApplication.java e clique em Run

## 🔎 Testando a API com Postman
Base URL:
```
http://localhost:8080/api/tarefas
```
## Exemplo de JSON para criação de tarefa (POST):
```
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Terminar o módulo de CRUD",
  "concluida": false
}
```
## 📘 Licença
Este projeto é livre para uso educacional.

## 👨‍💻 Autor
Desenvolvido por Thiago Marangoni

