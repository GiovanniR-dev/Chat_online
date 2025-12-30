💬 Chat em Tempo Real com Spring Boot e WebSocket

Este projeto é uma aplicação de chat em tempo real desenvolvida com Spring Boot, utilizando WebSocket + STOMP no backend e HTML, CSS e JavaScript no frontend.

A aplicação permite que múltiplos usuários, em computadores diferentes, se conectem simultaneamente e troquem mensagens em tempo real através do navegador.

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring WebSocket

STOMP

SockJS

HTML5

CSS3

JavaScript (Vanilla)

⚙️ Como funciona

O backend utiliza Spring WebSocket para gerenciar conexões em tempo real.

As mensagens são enviadas para o endpoint /app/chatmessage.

O servidor redistribui as mensagens para todos os clientes conectados através do tópico /chat.

No frontend, o usuário informa um nome antes de entrar no chat.

As mensagens são exibidas dinamicamente na tela sem necessidade de recarregar a página.

📌 Funcionalidades

Conexão em tempo real entre vários usuários

Identificação de usuário nas mensagens

Interface simples e funcional

Popup inicial para escolha do nome

Atualização instantânea das mensagens

🧠 Objetivo do Projeto

Projeto desenvolvido com foco em aprendizado de comunicação em tempo real, WebSockets, arquitetura cliente-servidor e integração entre Java (Spring Boot) e JavaScript.

Ideal para estudos, portfólio e base para projetos mais avançados como chats privados, salas ou notificações em tempo real.
