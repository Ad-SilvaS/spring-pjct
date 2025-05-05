🚀 Descrição: Projeto Web Serivices Spring Boot, com gerenciamento de usuários, produtos, categorias, pedidos e pagamentos.

🔧 Funcionalidades
✅ CRUD Completo (Create, Read, Update, Delete) para:

Usuários (/users)

Produtos (/products)

Categorias (/categories)

Pedidos (/orders)

✅ Relacionamentos entre entidades:

Um pedido pertence a um usuário (cliente).

Um produto pode ter várias categorias.

Um pedido pode conter vários itens (OrderItem).

✅ Tratamento de exceções personalizadas:

ResourceNotFoundException (404 - Recurso não encontrado).

DatabaseException (400 - Erro de integridade).

✅ Camada de serviços e repositórios seguindo o padrão JPA/Hibernate.

💻 Tecnologias Utilizadas
Java 17

Spring Boot 3

Spring Data JPA (Hibernate)

Maven (Gerenciamento de dependências)

H2 Database (Banco de dados em memória para testes)

Jakarta Persistence (JPA)

JSON (Respostas da API)

📌 Endpoints
Método	Rota	Descrição
GET	/users	Lista todos os usuários.
GET	/users/{id}	Busca um usuário por ID.
POST	/users	Cria um novo usuário.
PUT	/users/{id}	Atualiza um usuário existente.
DELETE	/users/{id}	Remove um usuário.
GET	/products	Lista todos os produtos.
GET	/products/{id}	Busca um produto por ID.
GET	/categories	Lista todas as categorias.
GET	/categories/{id}	Busca uma categoria por ID.
GET	/orders	Lista todos os pedidos.
GET	/orders/{id}	Busca um pedido por ID.

🛠️ Como Executar
Pré-requisitos
Java 17+
Maven
