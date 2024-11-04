# Projeto Gerador de Jogos da Mega-Sena

## Descrição Geral

Este projeto é uma aplicação em Java para console que gera jogos aleatórios para a Mega-Sena, o famoso jogo de loteria brasileiro. Com uma interface simples de linha de comando, o programa solicita ao usuário o número de jogos que deseja gerar e exibe cada jogo com seis números aleatórios entre 1 e 60, garantindo que cada número não se repita dentro do mesmo jogo.

A aplicação foi desenvolvida para fins de prática com conceitos de desenvolvimento de software em Java, integração contínua (CI) e análise de qualidade de código.

## Funcionalidades

- Geração de números aleatórios para jogos da Mega-Sena.
- Entrada de usuário para definir o número de jogos a serem gerados.
- Garantia de que os números em cada jogo são únicos.

## Estrutura do Projeto

O projeto é composto pelas seguintes partes principais:

- **Gerador de Jogos**: Classe principal que realiza a geração dos números para cada jogo.
- **Testes Unitários**: Inclui testes automatizados para validar a funcionalidade de geração de números.
- **Pipeline de Integração Contínua (CI)**: Configurado com GitHub Actions para executar:
  - Build automatizado da aplicação.
  - Testes automatizados para verificar a integridade do código.
  - Análise de qualidade e segurança do código usando SonarCloud e CodeQL.
  - Deploy de artefato, disponibilizando o JAR da aplicação para download.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal do projeto.
- **Maven**: Gerenciamento de dependências e automação de build.
- **GitHub Actions**: Configuração de CI para build, testes, análise de qualidade e deploy de artefatos.
- **SonarCloud e CodeQL**: Ferramentas de análise de qualidade e segurança do código.

## Como Executar

1. Clone o repositório: git clone https://github.com/seu-usuario/nome-do-repositorio.git

2. Compile o projeto usando Maven: mvn clean compile

3. Execute a aplicação: java -cp target/nome-do-jar.jar com.exemplo.megasena.MegaSenaApp

## Diagrama Pipeline CI/CD

```mermaid
graph TD;
    A[Início: Push para Branchs feat-* ou fix-* ou PR para Branchs main ou develop] --> B(Build)
    B --> C[Testes]
    C --> D{Code-Scan}
    D --> E[SonarCloud]
    D --> F[CodeQL]
    E --> G[Deploy]
    F --> G[Deploy]
    G --> H[Artefato Disponível]
