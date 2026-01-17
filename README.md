# 📝 Blogging API
***
API RESTful para uma plataforma de blog pessoal, desenvolvida como parte dos projetos sugeridos pelo [roadmap.sh para desenvolvedores backend](https://roadmap.sh/projects/blogging-platform-api).

## 🎯 Sobre o Projeto
***
Esta API permite realizar operações CRUD (Create, Read, Update, Delete) completas para gerenciar posts de blog. O projeto foi desenvolvido para praticar conceitos fundamentais de desenvolvimento backend, incluindo:

- Criação de APIs RESTful seguindo boas práticas e convenções
- Utilização de métodos HTTP (GET, POST, PUT, PATCH, DELETE)
- Implementação de códigos de status e tratamento de erros
- Operações CRUD com banco de dados
- Validação de dados de requisição

## 🚀 Tecnologias
***
- **Java** - Linguagem principal
- **Spring Boot** - Framework para desenvolvimento da API
- **Maven** - Gerenciador de dependências
- **Spring Validation** - Validação de dados

## 📋 Funcionalidades
***
A API oferece os seguintes endpoints para gerenciamento de posts:

### Posts
***
- `POST /posts` - Criar novo post
- `GET /posts` - Listar todos os posts
- `GET /posts/{id}` - Buscar post específico por ID
- `PUT /posts/{id}` - Atualizar post existente
- `DELETE /posts/{id}` - Deletar post

### Estrutura de um Post
***
```json
{
  "id": 1,
  "title": "Meu Primeiro Post",
  "content": "Este é o conteúdo do meu primeiro post.",
  "category": "Tecnologia",
  "tags": ["Tech", "Programação"],
  "createdAt": "2026-01-17T12:00:00Z",
  "updatedAt": "2026-01-17T12:00:00Z"
}
```

### 🎓 Aprendizados
***
Este projeto foi desenvolvido para consolidar conhecimentos em:
* Arquitetura REST
* Design de APIs
* Operações com banco de dados
* Validação e tratamento de erros
* Boas práticas de desenvolvimento backend