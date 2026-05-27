# 🏦 Banking System OOP

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![OOP](https://img.shields.io/badge/OOP-Orientação%20a%20Objetos-4CAF50?style=for-the-badge)](https://github.com/YuriiFreitass/banking-system-oop)
[![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)](https://github.com/YuriiFreitass/banking-system-oop)

Sistema bancário desenvolvido em Java com foco em **Programação Orientada a Objetos**.

O projeto simula operações bancárias básicas utilizando modelagem orientada a objetos, regras de negócio e separação de responsabilidades.

---

## ⚙️ Funcionalidades

| Módulo | Funcionalidades |
|--------|----------------|
| 🏛️ Contas | Conta Corrente e Conta Poupança |
| 💰 Operações | Depósito, saque e transferência |
| 🔍 Busca | Busca de conta por número |
| ✅ Validações | Saldo insuficiente com exception customizada |

---

## 🧠 Conceitos aplicados

| Conceito | Descrição |
|----------|-----------|
| 🔒 Encapsulamento | Atributos protegidos com getters |
| 🧬 Herança | `ContaCorrente` e `ContaPoupanca` herdam de `Conta` |
| 🔗 Associação | Cada conta possui um `Cliente` como titular |
| 🏗️ Service Layer | `BancoService` centraliza as regras de negócio |
| ⚠️ Exception customizada | `SaldoInsuficienteException` para saques inválidos |

---

## 🗂️ Estrutura do projeto
src/
├── model/
│    ├── Cliente.java
│    ├── Conta.java
│    ├── ContaCorrente.java
│    └── ContaPoupanca.java
├── service/
│    └── BancoService.java
├── exception/
│    └── SaldoInsuficienteException.java
└── Main.java

---


## 🚀 Como executar

```bash
# Clone o repositório
git clone https://github.com/YuriiFreitass/banking-system-oop.git

# Abra o projeto no IntelliJ IDEA e execute Main.java
```

> Requisito: **Java 17+**

---

## 💡 Exemplo de uso

```java
conta.depositar(500);
conta.sacar(200);
banco.transferir(conta1, conta2, 100);
```

---

## 🔮 Melhorias futuras

- [ ] Menu interativo com Scanner
- [ ] Persistência de dados
- [ ] Integração com banco de dados
- [ ] Conta abstrata com polimorfismo
- [ ] Extrato com histórico de transações

---

## 🛠️ Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=flat-square&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white)

---

## 👨‍💻 Autor

Feito com 💙 por **Yuri Freitas**

[![GitHub](https://img.shields.io/badge/GitHub-YuriiFreitass-181717?style=flat-square&logo=github)](https://github.com/YuriiFreitass)
