
# Backend REST com Spring Boot, Spring Security e JWT

Este projeto é um exemplo de backend REST usando **Spring Boot**, com autenticação e autorização implementadas usando **Spring Security** e **JWT (JSON Web Tokens)**.

## ⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (jjwt)
- Maven
- JPA / Hibernate
- H2 / PostgreSQL

## 🔐 Funcionalidades de Segurança

- Autenticação com e-mail e senha
- Geração e validação de tokens JWT
- Diferentes permissões por **role** (`ADMIN`, `USER`)
- Acesso controlado a endpoints de produto

## 🎟️ Fluxo de Autenticação

1. Usuário envia `POST /auth/login` com `email` e `senha`
2. Se válido, recebe um JWT no `Authorization: Bearer <token>`
3. Envia esse token nos headers para acessar endpoints protegidos


## ✅ Roles Suportadas

- **ADMIN**: pode criar, editar e deletar produtos
- **USER**: pode apenas visualizar produtos


## 🧪 Testes

Você pode usar o **Postman** ou **Insomnia** para testar o fluxo de autenticação e autorização.

## 📄 Licença

Este projeto é open-source e livre para uso educativo e comercial.
