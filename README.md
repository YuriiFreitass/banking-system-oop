# Banking System OOP

Sistema bancário desenvolvido em Java com foco em Programação Orientada a Objetos (OOP).

O projeto simula operações bancárias básicas utilizando modelagem orientada a objetos, regras de negócio e separação de responsabilidades.

---

# Features

## Contas bancárias

* Criação de contas
* Conta Corrente
* Conta Poupança
* Associação entre Cliente e Conta

## Operações

* Depósito
* Saque
* Transferência entre contas
* Busca de conta por número

## Regras de negócio

* Validação de saldo insuficiente
* Exception customizada para operações inválidas

---

# Conceitos aplicados

## Encapsulamento

Os atributos foram protegidos com `private` e acessados através de getters.

## Herança

`ContaCorrente` e `ContaPoupanca` herdam da classe `Conta`.

## Associação

Cada conta possui um titular do tipo `Cliente`.

## Service Layer

A lógica principal do sistema foi separada na classe:

```java
BancoService
```

Responsável por:

* cadastrar contas
* buscar contas
* transferências

## Exceptions customizadas

Foi criada a exception:

```java
SaldoInsuficienteException
```

Utilizada para impedir saques inválidos.

---

# Estrutura do projeto

```text
src
 ├── model
 │    ├── Cliente
 │    ├── Conta
 │    ├── ContaCorrente
 │    └── ContaPoupanca
 │
 ├── service
 │    └── BancoService
 │
 ├── exception
 │    └── SaldoInsuficienteException
 │
 └── Main
```

---

# Exemplo de uso

```java
conta.depositar(500);
conta.sacar(200);
banco.transferir(conta1, conta2, 100);
```

---

# Objetivo do projeto

Este projeto foi desenvolvido para consolidar fundamentos de Java e Programação Orientada a Objetos através da construção de um sistema bancário simples.

Durante o desenvolvimento foram praticados conceitos importantes de backend, modelagem de entidades e organização de código.

---

# Melhorias futuras

* Menu interativo com Scanner
* Persistência de dados
* Conta abstrata
* Polimorfismo avançado
* Interface gráfica
* Integração com banco de dados

---

# Tecnologias

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# Autor

Yuri Freitas
