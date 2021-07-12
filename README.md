# Trabalhando com banco de dados usando JPA
- No arquivo persistent.xml apresenta configurações específicas do Hibernate. <br>
- No arquivo build.gradle estão as dependências necessárias para os projetos. <br>
- Primeira parte: cria um gerenciador de entidades com o banco de dados. A IDE irá validar as annotations porque foi utilizada a API do JPA. Porém o código não executará, pois não foi utilizada nenhuma API de implementação do JPA, e sim apenas API com as especificações.<br>
- Segunda parte: 1) Configure a aplicação desenvolvida com JPA na parte 1 para utilizar o Hibernate. 2) Configure a aplicação desenvolvida com JPA na parte 1 para utilizar o EclipseLink. <br>
- Terceira parte: 1) Crie uma consulta SQL e execute diretamente no Banco de Dados. 2) Realize a mesma consulta realizada no passo 1, porém no JPQL e execute na sua aplicação JPA. 3) Realize a mesma consulta realizada no passo 1, porém com o JPA Criteria API e execute na sua aplicação JPA.

## Passos iniciais

### Pré-requisitos 
- Java Development Kit (JDK) – 1.8 ou superior.
- IntelliJ IDEA (É recomendável seguir com essa IDE, porém pode ser selecionada outra).
- Gradle 5.3.1 (É utilizado para baixar o Driver JDBC. Se quiser, pode ser instalado manualmente ou com o Maven).
- <a href="https://github.com/danielkv7/jdbc-basico/blob/master/src/main/java/part1/DatabaseInstructions">MySQL (Passos para instalação estão no arquivo "DatabaseInstructions).</a>

### Instalação
Com os pré requisitos instalados, basta baixar esse projeto no seu IDE (através do comando "git clone") e seguir os passos que estão no arquivo <a href="https://github.com/danielkv7/jdbc-basico/blob/master/src/main/java/part1/DatabaseInstructions">DatabaseInstructions</a> para instanciar os bancos de dados, tabelas e alguns registros para teste.

## Executar
Basta rodar a função "main" da classe compilada de uma das seguintes classes:

- <a href="https://github.com/danielkv7/jpa-basico/blob/master/src/main/java/part1/ExecutionPart1.java">ExecutionPart1.java.</a>
- <a href="https://github.com/danielkv7/jpa-basico/blob/master/src/main/java/part2/ExecutionPart2.java">ExecutionPart2.java.</a>
- <a href="https://github.com/danielkv7/jpa-basico/blob/master/src/main/java/part3/ExecutionPart3.java">ExecutionPart3.java.</a>
