# Auto Assistant

Bem-vindo à documentação da **Auto Assistant API**! Esta API fornece informações de usuarios, fornecedores e produtos. Abaixo, você encontrará detalhes sobre as principais classes e endpoints disponíveis.

## Descrição do projeto
Encontrar um bom fornecedor e escolher os produtos e serviços certos no
mercado pode ser um verdadeiro desafio para quem faz compras em nome de
uma empresa. A tarefa exige cuidado e atenção, especialmente quando se trata
de compras de alto valor ou itens com necessidades específicas.
O mercado grande e vasto, com inúmeras opções disponíveis, possuí uma
gama de escolhas que pode tornar a decisão um pouco mais difícil. Além disso, os
preços variam significativamente entre os fornecedores, o que torna a busca pela
melhor oferta um desafio em si. É importante equilibrar qualidade e custo, o que
nem sempre é simples, especialmente quando a qualidade do que está sendo
comprado é incerta.
Se a empresa precisa de produtos ou serviços altamente específicos,
encontrar um fornecedor que atenda a essas necessidades pode ser uma tarefa
adicional. Por fim, a reputação dos fornecedores é uma preocupação constante,
pois é vital garantir que entreguem o que prometem.
Em resumo, realizar a cotação de compras é desafiador devido à ampla
variedade de escolhas, às diferenças de preço, à incerteza em relação à
qualidade, às necessidades específicas a serem atendidas e à necessidade de
verificar a confiabilidade dos fornecedores. É um processo que exige paciência e
uma avaliação cuidadosa para tomar decisões que beneficiem a empresa.

## Escopo do produto
Nosso projeto se chamará “Auto Assistant” e será um aplicativo
desenvolvido em React Native que tem como objetivo automatizar o processo de
cotação de compras para compradores. Com uma abordagem focada na
praticidade e eficiência, o aplicativo permite que os compradores encontrem
fornecedores de maneira rápida e eficaz, com base em suas especificações e
requisitos.


## Classes

### `Usuario`

A classe `Usuario` contém informações detalhadas sobre os usuario da plataforma.

**Atributos:**

- `id`: O identificador único do usuario.

- `cpf`: O CPF do usuario.
  
- `nome`: O nome completo da empresa usuario.

- `email`: O email completo do usuario.
  
- `cep`: O CEP (Código de Endereçamento Postal) do endereço do usuario.
  
- `numero`: O número do local da usuario.

- `complemento`: O complemento do local do usuario.

- `logradouro`: O logradouro do local do usuario.

- `telefone`: O telefone do usuario.

### `Fornecedor`

A classe `Fornecedor` contém informações detalhadas sobre os fornecedores associados a plataforma.

**Atributos:**

- `id`: O identificador único do fornecedor.
  
- `nome`: O nome completo do fornecedor.
  
- `cnpj`: O CNPJ do fornecedor.

- `telefone`: O telefone do fornecedor.

- `reputacao;`: A reputação do fornecedor;.

### `Produto`

A classe `Produto` contém informações detalhadas sobre os produtos disponíveis na sua plataforma.

**Atributos:**

- `id`: O identificador único do produto.
  
- `nome`: O nome do produto.
  
- `desc`: A descrição detalhada do produto.
  
- `valor`: O valor unitário do produto.
  
- `quantidade`: Quantidade disponível do produto.

- `qualidade`: Quantidade do produto.

- `codicao_entrega`: condição de entrega do produto.

### `compra`

A classe `compra` contém informações detalhadas sobre as compras dos items.

**Atributos:**

- `id`: O identificador único da compra.
  
- `valor_total`: O valor total da compra.
  
- `data_compra`: A data da compra.

- `cod_contrato`: O código de contrato da compra.

# Endpoints

## Métodos GET

- `GET /usuario`: Retorna uma lista de todos os usuario.
  
- `GET /usuario/{id}`: Retorna detalhes sobre um usuario específico com base no ID.

- `GET /fornecedores`: Retorna uma lista de todos os fornecedores.
  
- `GET /fornecedores/{id}`: Retorna detalhes sobre um fornecedor específico com base no ID.

- `GET /produto`: Retorna uma lista de todos os produtos disponíveis.
  
- `GET /produto/{id}`: Retorna detalhes sobre um produto específico com base no ID.

- `GET /compra`: Retorna uma lista de todas as compras realizadas.

- `GET /compra/{id}`: Retorna uma lista de uma compra especifica com base no ID.

## Métodos Post
  
- `POST /usuario`: Cria um novo usuario com base nos dados fornecidos.

- `POST /fornecedores`: Cria um novo fornecedor com base nos dados fornecidos.

- `POST /produto`: Cria um novo produto com base nos dados fornecidos.

- `POST /compra`: Cria uma nova compra com base nos dados fornecidos.

## Métodos PUT
  
- `PUT /usuario/{id}`: Atualiza os detalhes de um usuario existente com base no ID.

- `PUT /fornecedores/{id}`: Atualiza os detalhes de um fornecedor existente com base no ID.

- `PUT /produto/{id}`: Atualiza os detalhes de um produto existente com base no ID.

- `PUT /compra/{id}`: Atualiza os detalhes de cada compra existente com base no ID.

## Métodos DELETE
  
- `DELETE /usuario/{id}`: Exclui um usuario com base no ID.
  
- `DELETE /fornecedores/{id}`: Exclui um fornecedor com base no ID.
  
- `DELETE /produto/{id}`: Exclui um produto com base no ID.

- `DELETE /compra/{id}`: Exclui uma compra com base no ID.

Lembre-se de incluir os parâmetros necessários na sua solicitação para obter os resultados desejados.

## Exemplo JSON

Aqui está um exemplo da estrutura JSON representando as informações do `usuario`:

```json
{
    "id": "Long",
    "cpf": "String",
    "nome": "String",
    "email": "String",
    "cep": "String",
    "numero": "Int",
    "complemento": "String",
    "logradouro": "String",
    "telefone": "String"
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `Fornecedor`:

```json
{
    "id": "Long",
    "nome": "String",
    "cnpj": "String",
    "telefone": "String",
    "reputacao": "String"
}
```

Aqui está um exemplo da estrutura JSON representando as informações do `produto`:

```json
{
    "id": "long",
    "nome": "string",
    "desc": "string",
    "valor": "double",
    "quantidade": "int",
    "qualidade": "string",
    "condicao_entrega": "string"
}

Aqui está um exemplo da estrutura JSON representando as informações da `compra`:

```json
{
    "id": "long",
    "valor_total": "double",
    "Data": "LocalDate(YYYY-MM-DD)",
    "cod_contrato": "int"
}

```

## Códigos de retorno(usuario, fornecedor, produto, item e compra)

- 200: Conexão e resposta bem-sucedidas.
- 201: Registrado com sucesso.
- 400: Dados inválidos ou ausentes fornecidos.
- 404: Página ou recurso não encontrado.
- 405: Acesso restrito ao recurso.
- 500: Erro interno do servidor.

## Diagrama de arquitetura macro

![Arquitetura](https://raw.githubusercontent.com/GustavoFIAP96687/Challenge-Digital-Business/master/img/Arquitetura.png)
