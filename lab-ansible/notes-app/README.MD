# Estrutura do Projeto
```
notes-app/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── academy/
│   │   │       └── guerra/
│   │   │           └── notes/
│   │   │               ├── NotesApplication.java
│   │   │               ├── controller/
│   │   │               │   └── NoteController.java
│   │   │               ├── model/
│   │   │               │   └── Note.java
│   │   │               └── repository/
│   │   │                   └── NoteRepository.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── templates/
│   │   │       └── index.html
```
# Tecnologias Utilizadas
Java
Spring Boot
Maven
# Como Executar
## Pré-requisitos

Java 11 ou superior
Maven

## Passos
1. Clone o repositório:
```
git clone https://github.com/seu-usuario/notes-app.git
cd notes-app
```

2. Compile e empacote a aplicação usando Maven:
```
mvn package
```

3. Execute o arquivo .jar gerado:

```
java -jar target/notes-app-0.0.1-SNAPSHOT.jar
```
4. Acesse a aplicação no navegador:

http://<IP Server>:8080

## Arquivo de configuração

Certifique-se de ajustar your_username e your_password no arquivo application.properties com as credenciais corretas do seu banco de dados PostgreSQL. Além disso, crie o banco de dados notesdb no PostgreSQL antes de executar a aplicação.


# Estrutura do Código
NotesApplication.java: Classe principal que inicializa a aplicação Spring Boot.
NoteController.java: Controlador que gerencia as requisições HTTP.
Note.java: Modelo que representa uma nota.
NoteRepository.java: Repositório que interage com o banco de dados.
application.properties: Arquivo de configuração da aplicação.
index.html: Template HTML para a interface do usuário.

## Funcionalidades
Criar, ler, atualizar e deletar notas.