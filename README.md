# PROJETO: APIviaCEP

## 📖 Sobre o projeto

Este projeto foi realizado em sala de aula junto com o professor Willians Luiz Gomes. 

A aplicação realiza uma requisição HTTP para consultar informações de endereço a partir de um CEP informado, retornando os dados no formato JSON.

O projeto faz parte da atividade acadêmica de Programação Orientada a Objetos (POO).

## 🎯 Objetivo

Praticar conceitos de programação Java e integração com APIs externas, utilizando requisições HTTP para obter informações de endereços.

## 🌐 API utilizada

ViaCEP – Consulta de CEP

Exemplo de endereço utilizado na requisição:

https://viacep.com.br/ws/01001000/json/

## ⚙️ Funcionamento

O programa realiza as seguintes operações:

*Define um CEP para consulta.

*Verifica se o CEP possui oito dígitos numéricos.

*Monta a URL de acesso à API ViaCEP.

*Cria uma requisição HTTP do tipo GET.

*Envia a requisição utilizando o HttpClient.

*Recebe a resposta da API.

*Exibe o código de status e os dados retornados em JSON.

*Realiza o tratamento de possíveis erros.

## ▶️ Como executar o projeto

*Baixe ou clone este repositório.

*Abra o projeto no Eclipse IDE.

*Certifique-se de utilizar Java 11 ou superior.

*Abra a classe ConsumirCep.java.

*Execute utilizando a opção Run As → Java Application.
