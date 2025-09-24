# 🎰 Java-Byte-Bet

![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen)
![Java](https://img.shields.io/badge/linguagem-Java-blue)

---

## 📌 Descrição

**Java-Byte-Bet** é uma implementação simples de um **jogo de caça-níquel (slot machine)** em **Java**, jogado diretamente no console.
O jogador inicia com um saldo de R\$500, faz suas apostas e gira os rolos que exibem símbolos aleatórios (**👑, 🔔, 💰, 🍒, 🍉**).
Dependendo da combinação, o jogador pode multiplicar sua aposta e aumentar o saldo — ou perder para a casa.

---

## ⚙️ Funcionalidades

* 🎲 Sistema de apostas com saldo inicial.
* 🎰 Geração aleatória de símbolos em cada giro.
* 💸 Pagamentos proporcionais à aposta de acordo com a combinação de símbolos.
* 🚫 Validação de apostas (sem valores negativos ou acima do saldo).
* 🔁 Opção para jogar novamente até acabar o saldo ou o jogador sair.

---

## 📂 Estrutura de arquivos

```
Java-Byte-Bet/
│
├── Main.java
└── README.md
```

---

## 💡 Exemplo de execução

**Início do jogo:**

```
===========================
 Bem Vindo(a) ao Byte-Bet 
 Simbolos: 👑 🔔 💰 🍒 🍉 
===========================

Seu Saldo Atual: R$500
Digite o Valor da Aposta: 50
Girando...
================
 🍉 | 💰 | 🔔
================
Casa WIN, AHHAHHAHAHHAHHA!
Quer Jogar novamente? (S/N)
```

**Exemplo de vitória:**

```
Girando...
================
 👑 | 👑 | 👑
================
Você ganhou: R$1000
Seu Saldo Atual: R$1500
```

**Fim do jogo:**

```
Fim de Jogo! 
Seu Saldo: R$0
```

---


## ▶️ Como executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/java-byte-bet.git
   ```

2. Entre na pasta do projeto:

   ```bash
   cd java-byte-bet
   ```

3. Compile o programa:

   ```bash
   javac Main.java
   ```

4. Execute o jogo:

   ```bash
   java Main
   ```

---


