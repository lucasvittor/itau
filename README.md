# Itaú Backend


## 📌 Sobre

O objetivo é criar uma API REST para receber transações e gerar estatísticas sobre elas.

## 🚀 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Maven
- JUnit

## 🔥 Endpoints da API

### Criar uma Transação (POST /transacao)

**Requisição:**
```json
{
  "valor": 300.00,
  "dataHora": "2025-03-11T15:25:30.119+00:00"
}

```
📷 ![POST /transacao](./img/post.png)

### Apagar Todas as Transações (DELETE /transacao)

**Requisição:**
```http
DELETE /transacao
```
📷 ![DELETE /transacao](./img/delete.png)

### Obter Estatísticas (GET /estatistica)

**Resposta:**
```json
{
    "count": 3,
    "min": 100.456,
    "max": 300.0,
    "avg": 200.304,
    "sum": 600.912
}
```
📷 ![GET /estatistica](./img/get_estatistica.png)

