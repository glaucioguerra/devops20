# Compilando e Gerando o Jar
Para compilar e gerar o Jar da aplicação, execute o seguinte comando na raiz do projeto (onde está o pom.xml):

bash
```
mvn clean package
```
Isso criará um arquivo Jar na pasta target.

# Executando a Aplicação
Para executar a aplicação, use o seguinte comando:

```
java -jar target/notes-1.0.0.jar
```
A aplicação estará disponível na porta 8080.

Certifique-se de ajustar your_username e your_password no arquivo application.properties com as credenciais corretas do seu banco de dados PostgreSQL. Além disso, crie o banco de dados notesdb no PostgreSQL antes de executar a aplicação.