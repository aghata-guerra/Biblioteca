# 📚 Biblioteca

Sistema de gerenciamento de biblioteca desenvolvido em Java, aplicando os conceitos de Orientação a Objetos (OO).

## 📋 Sobre o projeto

Exercício acadêmico da disciplina de Programação Orientada a Objetos do curso de Análise e Desenvolvimento de Sistemas (ADS) — Universidade Tiradentes (UNIT).

O sistema modela o funcionamento básico de uma biblioteca, permitindo cadastrar livros, mídias e edições (exemplares), além de realizar empréstimos e devoluções.

## 🗂️ Estrutura das classes

### `Livro`
Representa um livro do acervo.
- `idLivro` — identificador único (não pode ser alterado)
- `titulo` — título do livro
- `assunto` — assunto/gênero do livro

### `Midia`
Representa o formato físico ou digital de uma edição.
- `idMidia` — identificador único (não pode ser alterado)
- `descricao` — tipo da mídia (Papel, PDF, Áudio...)

### `Edicao`
Representa um exemplar de um livro em determinada mídia.
- `idEdicao` — identificador único (não pode ser alterado)
- `ano` — ano de lançamento da edição
- `situacao` — `'D'` (Disponível) ou `'E'` (Emprestado), inicia com `'D'`
- `ultimoEmprestimo` — data do último empréstimo, inicia com `null`
- `livro` — referência ao livro da edição
- `midia` — referência à mídia da edição

**Métodos:**
- `emprestimo(String data)` — realiza o empréstimo se o exemplar estiver disponível, retorna `true` se realizado
- `devolucao()` — realiza a devolução se o exemplar estiver emprestado, retorna `true` se realizada

### `Biblioteca` (aplicação principal)
- Cadastra 3 mídias, 2 livros e 5 exemplares
- Realiza 3 empréstimos com validação de disponibilidade
- Realiza 1 devolução com validação
- Exibe listagem completa dos exemplares

## 💻 Tecnologias

- Java
- IntelliJ IDEA

## ▶️ Como executar

1. Clone o repositório
```bash
git clone https://github.com/aghata-guerra/Biblioteca.git
```
2. Abra o projeto no IntelliJ IDEA
3. Execute a classe `Biblioteca.java` localizada em `src/application`

## 👩‍💻 Autora

**Aghata Guerra**  
Estudante de ADS — UNIT Recife  
[github.com/aghata-guerra](https://github.com/aghata-guerra)
