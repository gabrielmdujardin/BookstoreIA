# Bookstore IA 



![Demonstração do projeto](src/main/java/com/bookstore/IA/assets/OllamaiIA.gif)



API inteligente desenvolvida em **Java 21** com **Spring Boot** integrada ao **Ollama** para geração automática de reviews e recomendações de livros utilizando Inteligência Artificial local.

##  Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring AI
- Ollama
- Maven
- Swagger / OpenAPI
- Postman

##  Sobre o Projeto

O **Bookstore IA** é uma aplicação backend que utiliza modelos de linguagem (LLM) executados localmente para criar análises completas de livros.

Ao informar o nome de um livro, a API gera automaticamente:

- Resumo da obra
- Pontos positivos
- Pontos negativos
- Recomendação de público
- Nota final

Tudo rodando offline, sem custos com APIs externas.

##  Como Funciona

Spring Boot → Spring AI → Ollama → Modelo LLM (Llama 3.2)

##  Configuração do Ambiente

1. Instale o Ollama: [Download](https://ollama.com/download)
2. Baixe o modelo:
   ```bash
   ollama run llama3.2

   Configure o arquivo application.properties:propertiesspring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.options.model=llama3.2

 Como Executar
Bash# Clone o repositório
git clone https://github.com/gabrielmdujardin/BookstoreIA.git

# Entre na pasta
cd BookstoreIA

# Execute a aplicação
mvn spring-boot:run
 Endpoints

