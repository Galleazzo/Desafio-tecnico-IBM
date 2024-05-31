# Teste Técnico de Desenvolvimento de Aplicação Web da IBM

O teste consiste em um banco que simule transações financeiras de um banco!

Clone o repositorio em sua maquina antes de tudo !!!!!

O back end está na pasta "Banco", e o front end está na pasta "banco-front-end".

## Passos para rodar o projeto

### 1. Pré-requisitos
- **IDE para o back end**: Recomendo o IntelliJ IDEA. [Baixe aqui](https://www.jetbrains.com/).
- **IDE para o front end**: Recomendo o VS Code. [Baixe aqui](https://code.visualstudio.com/download).

### 2. Instalação de dependências
- **Java 17**: [Baixe aqui](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
- **Node.js**: [Baixe aqui](https://nodejs.org/en/download/package-manager).

### 3. Configuração do Banco de Dados
Para o banco de dados, utilizei uma conexão MySQL Docker. Caso prefira outra configuração, siga os passos abaixo:

- **MySQL Workbench**: [Baixe aqui](https://dev.mysql.com/downloads/workbench/).
- Conecte-se a um banco de sua preferência e crie o schema com o comando:
  ```sql
  CREATE DATABASE banco_ibm_teste;

### 4. Configuração do Projeto
1. No projeto back end, configure o arquivo `application.properties` com as credenciais do seu banco de dados MySQL.

### 5. Executar o Projeto
- **Back end**:
  1. Importe o projeto na sua IDE (IntelliJ IDEA).
  2. Instale todas as dependências necessárias.

- **Front end**:
  1. No diretório do front end, rode os seguintes comandos:
     ```sh
     npm install --force
     npm start
     ```

Pronto! Agora você deve estar apto a rodar a aplicação.
