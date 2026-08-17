## 📌 Sobre os Projetos

### 1. Sistema de Pedidos — Sabor & Arte (`ModuloUm.java`)

Aplicação focada no atendimento ao cliente de um restaurante, simulando o lançamento de itens em uma comanda digital.

* **Objetivo:** Permitir ao usuário escolher pratos do cardápio até desejar encerrar, exibindo o total acumulado ao final.
* **Fluxo de Funcionamento:**
1. Exibe a tabela de cardápio fixa com código, prato e preço.
2. Solicita a digitação do código do item desejado.
3. Soma o valor do prato selecionado à comanda total.
4. Pergunta se o usuário deseja adicionar outro prato (`S/N`).
5. Repete o ciclo enquanto a resposta for `'S'` ou `'s'`.
6. Exibe a comanda final formatada em Reais (R$).


* **Conceitos Utilizados:** Laço `do-while`, estrutura condicional `switch-case`, tratamento de entrada com `Scanner` e formatação monetária com `System.out.printf`.

#### Exemplo de Uso

```text
===========================================
          CARDÁPIO SABOR & ARTE            
===========================================
 Código | Prato           | Valor          
    1   | Pão com ovo     | R$ 5,00        
    2   | Bife acebolado  | R$ 15,00       
    ...
Selecione um Prato: 1
-> Pão com ovo adicionado!
Deseja adicionar outro prato? (S/N): N

==========================================
Pedido finalizado! Total a pagar: R$ 5,00
==========================================

```

---

### 2. Painel de Indicadores Regionais (`ModuloDois.java`)

Sistema de coleta de dados demográficos e geração de relatórios estatísticos simples.

* **Objetivo:** Cadastrar habitantes, acumular dados estatísticos e permitir a visualização do relatório no menu.
* **Fluxo de Funcionamento:**
1. Apresenta um menu principal contínuo (1: Adicionar, 2: Exibir, 3: Sair).
2. **Opção 1:** Solicita idade, sexo (`M`/`F`) e salário. Atualiza imediatamente os dados globais.
3. **Opção 2:** Calcula a média salarial e exibe a maior idade, menor idade e número de mulheres com salário $\ge$ R$ 5.000,00.
4. **Opção 3:** Encerra o laço de execução da aplicação.


* **Conceitos Utilizados:** Acumuladores, inicialização de extremos (`Integer.MAX_VALUE` / `Integer.MIN_VALUE`), operadores lógicos compostos (`&&`) e controle de menu com laço condicional.

#### Exemplo de Uso

```text
1 | Adicionar pessoa
2 | Exibir resultados
3 | Sair
> Escolha uma opção: 1
> Idade: 28
> Sexo (M/F): F
> Salário: 5200.00
> Registro incluído. Retornando ao menu...

```

---

## 🛠️ Conceitos Técnicos Explicados

* **`Scanner`**: Utilizado para capturar dados digitados pelo usuário no terminal (`nextInt()`, `nextDouble()`, `next()`).
* **`do-while` vs `while**`: Utilizou-se `do-while` para garantir que o menu ou prompt de opções seja executado **pelo menos uma vez** antes de validar a condição de parada.
* **`Integer.MIN_VALUE` / `MAX_VALUE**`: Utilizados na busca da maior e menor idade. Garantem que a primeira pessoa cadastrada assuma o papel de "maior" e "menor" idade inicial sem a necessidade de criar regras complexas de contagem.
* **`printf`**: Permite formatar números com casas decimais fixas (ex: `%.2f` garante exibições como `25.00` em vez de `25.0`).

---

## ⚙️ Requisitos e Pré-requisitos

Para compilar e executar qualquer um dos programas, certifique-se de possuir instalado:

* **Java Development Kit (JDK):** Versão 8 ou superior.
* **Terminal de Comando:** Prompt de Comando (CMD), PowerShell, Git Bash ou Terminal do Linux/macOS.

---

## 🚀 Como Compilar e Executar

Siga os passos abaixo utilizando o terminal da sua preferência.

### Passo 1: Navegar até o diretório dos arquivos

Abra o terminal e navegue até a pasta onde os arquivos `.java` foram salvos:

```bash
cd /caminho/para/a/sua/pasta

```

### Passo 2: Compilação dos arquivos (JDK 8 ou superior)

O comando `javac` converte o código-fonte `.java` em *bytecode* `.class`.

```bash
javac ModuloUm.java ModuloDois.java

```

### Passo 3: Execução

O comando `java` inicia a Máquina Virtual Java (JVM) e executa o programa.

* **Para rodar o Sistema de Pedidos (Sabor & Arte):**
```bash
java ModuloUm

```


* **Para rodar o Painel de Indicadores Regionais:**
```bash
java ModuloDois

```



> **Atalho para Java 11 ou superior:** Você pode rodar o arquivo diretamente sem gerar os arquivos `.class` previamente:
> ```bash
> java ModuloUm.java
> java ModuloDois.java
> 
> ```
> 
> 

---

## ❓ Resolução de Problemas Frequentes

| Erro Encontrado | Causa Provável | Como Resolver |
| --- | --- | --- |
| `class X is public, should be declared in a file named X.java` | O nome da classe no código diverge do nome do arquivo salvo no disco. | Renomeie o arquivo `.java` exatamente com o mesmo nome da classe, respeitando maiúsculas e minúsculas (`ModuloUm.java` ou `ModuloDois.java`). |
| `variable continuar might not have been initialized` | O código tenta ler uma variável antes de atribuir um valor inicial a ela. | Declare a variável atribuindo um valor inicial padrão, como `char continuar = 'S';`. |
| Comandos em bloco sendo colados diretamente no terminal gerando `ParserError` | Tentativa de colar o código fonte Java dentro do terminal do PowerShell. | Salve o código dentro de um arquivo de texto `.java` antes de chamar o compilador `javac`. |
