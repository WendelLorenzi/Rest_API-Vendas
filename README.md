# Rest_API-Vendas
Rest API desenvolvida com Spring Boot utilizando banco de dados in-memory H2

<h4>Feitos: </h4>
  - Criado a API e modelado o banco de dados <br>
  - Implementado os métodos de Post e Get para Vendedor e Vendas<br>
  - Criado Vendas e Vendedores através do dados inseridos<br>
  - Código para desenvolvimento do relatório de vendas por vendedor finalizado<br>


<h4>Erro/ Impedimento:</h4>
  - JSON com as datas não são aceitos em localhost:8080/relatorio pois aponta erro no método relatorio() quando passado os parametros no ControllerRelatorioVendedor.java o mesmo cai em uma Exception <br>
  - Na classe ServiceVendedorVenda.java o método Contadia(Date, Date) aponta erro no .parse() que converteria a data passada para um Date formatado <br>
  - Não foi implementado testes automatizados <br>
  

<h4>Dados inseridos para teste: </h4> (Usando o Postman)

<h5>Vendedor: </h5>  ---> localhost:8080/vendedor <br>
{"nome": "Rafael Souza"}, <br>
{"nome": "Julio Cesar"}, <br>
{"nome": "Jaqueline Amaral"} <br>

<h5>Vendas: </h5> --> localhost:8080/venda<br>
{"data": "2020-09-10", "valor": "550.5", "vendedor_id": "2"},<br>
{"data": "2020-05-12", "valor": "200.5", "vendedor_id": "1"},<br>
{"data": "2020-10-10", "valor": "300.0", "vendedor_id": "2"},<br>
{"data": "2020-10-15", "valor": "100.0", "vendedor_id": "3"},<br>
{"data": "2020-11-12", "valor": "50.0", "vendedor_id": "1"},<br>
{"data": "2020-12-10", "valor": "550.5", "vendedor_id": "2"},<br>
{"data": "2020-12-15", "valor": "120.2", "vendedor_id": "3"},<br>
{"data": "2021-01-05", "valor": "15.0", "vendedor_id": "1"},<br>
{"data": "2021-01-12", "valor": "300.0", "vendedor_id": "3"},<br>
{"data": "2021-01-15", "valor": "500.0", "vendedor_id": "1"}<br>

<h5>JSON que passa o intervalo de datas: </h5> --> localhost:8080/relatorio<br>
{"data_inicio": "2020-10-15", "data_fim": "2021-01-12"}<br>

