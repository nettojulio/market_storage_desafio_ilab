<h1>DESAFIO ILAB MAVEN (SEMANA 4)</h1>

<h2>ATIVIDADES</h2>

<h3>1. Construa um projeto do zero, utilizando Apache Maven. Pode ser um projeto simples da sua escolha, não há
pré-requisitos, apenas deve ser um projeto que utiliza o Maven.</h3>

<h3>2. Nesta aplicação construa a seguinte lógica:</h3>

<p>Seu Roberto é um comerciante e que precisa de um sistema para gerenciar os produtos de seu armazém.</p>
<p>Neste programa console, solicite a quantidade de produtos a cadastrar, depois cadastre estes produtos em um array list em memória.</p>
<p>Dentro do mesmo programa faça um item de menu que liste os produtos cadastrados e o valor total da soma de todos os produtos</p>

<h3>Para executar o projeto</h3>
Execute os comandos abaixo na pasta raíz do projeto

- Para compilar e criar o pacote:
  - mvn clean compile package
- Execute algum dos dois códigos para executar:
  - mvn exec:java -Dexec.mainClass="br.com.julioneto.market_storage.App"
  - java -jar target/market_storage-1.0-SNAPSHOT.jar
