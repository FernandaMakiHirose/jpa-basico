# Trabalhando com banco de dados usando JPA
1- Realizar download do JPA (Java Persistence API) e do driver JDBC para o BC MySQL (Foram adicionados no arquivo build.gradle nas linhas 24 e 30). <br>
2- Criar o arquivo persistence.xml e configurar os seguintes parâmetros: URL da string de conexão (driver, endereço do BD e nome do BD), usuário do BD, senha do BD, driver e classes que serão mapeadas para serem usadas pelo JPA (no arquivo Aluno.java). <br>
3- Utilizar as annotations nas classes que serão mapeadas para uso do Hibernate. <br>
4- Configurar o entityManager (no arquivo ExecutionPart1). <br>

## Entendendo o JPA
Entre os principais artefatos do JPA, podem ser destacados:
- Anotações `@Entity` - indica a aplicação que os objetos da classe especificada serão persistidos no banco de dados. Também podem ser usadas outras anotações para auxiliar no mapeamento de classes, tais como: @id, @column, @table, @OneToMany e @ManyToOne. 
- Interface `EntityManager` - é utilizada para gerenciar o ciclo de vida das entidades. Os principais métodos utilizados são: find, persist e remove. 
- As principais anotações utilizadas junto com o annotation `@Entity` são:
- `@Table`. É opcional, por padrão o nome da entidade é usado para realizar o mapeamento com o nome da tabela no banco de dados. Ela é necessária caso o nome da entidade seja diferente do nome da tabela no banco de dados. 
- `Column`. É opcional, por padrão o atributo da entidade é usado para realizar o mapeamento com o nome da coluna de banco de dados. Ela é necessária caso os atributos da entidade sejam diferentes das colunas do banco de dados. 
- `@Id` é obrigatório especificar ao menos uma ID para a entidade. 

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

- <a href="https:"https://github.com/FernandaMakiHirose/jpa-basico/blob/main/src/main/java/part1/ExecutionPart1.java">ExecutionPart1.java.</a>
- <a href="https://github.com/danielkv7/jpa-basico/blob/master/src/main/java/part2/ExecutionPart2.java">ExecutionPart2.java.</a>
- <a href="https://github.com/danielkv7/jpa-basico/blob/master/src/main/java/part3/ExecutionPart3.java">ExecutionPart3.java.</a>
