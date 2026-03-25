# 🦷 ProteControl

Sistema de gestão de trabalhos de prótese dentária, desenvolvido para uso real em laboratório protético

O projeto conta com **backend em Spring Boot**, **frontend web (PWA)** e **aplicativo desktop (Electron)** — permitindo o controle completo de pedidos, dentistas, tipos de trabalho e financeiro.

---

## 📸 Preview

><img width="1320" height="616" alt="{644EB879-6C62-4E26-A419-8222DAD80E92}" src="https://github.com/user-attachments/assets/f36e526b-4990-4b0d-89c4-ee8a9bd0c505" />
<img width="1317" height="618" alt="{68571C89-95E4-476F-800E-0ECAD3349BC9}" src="https://github.com/user-attachments/assets/c140ccb8-8382-4acb-a750-657e94c2ff8e" />
<img width="1317" height="611" alt="{85EA10C7-D64A-4C5B-8535-824C582DB4D5}" src="https://github.com/user-attachments/assets/041671b8-31e7-4d85-8a80-83716e88894c" />


---

## 🚀 Funcionalidades

- ✅ Cadastro e gerenciamento de dentistas
- ✅ Cadastro de tipos de trabalho com preços
- ✅ Criação e acompanhamento de pedidos por status (Em produção → Pronto → Entregue → Recebido)
- ✅ Controle de pagamento por pedido
- ✅ Registro de cor/tonalidade e observações por pedido
- ✅ Emissão de nota fiscal em HTML
- ✅ API REST completa com autenticação JWT

---

## 🛠 Tecnologias

| Camada | Tecnologia |
|---|---|
| Linguagem | Java 17 |
| Framework | Spring Boot 3 |
| Segurança | Spring Security + JWT |
| Banco de Dados | PostgreSQL |
| ORM | Spring Data JPA / Hibernate |
| Build | Maven |
| Deploy | Railway |

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/protecontrol/
            ├── controller/    # Endpoints REST
            ├── service/       # Regras de negócio
            ├── repository/    # Acesso ao banco
            ├── model/         # Entidades JPA
            └── dto/           # Objetos de transferência
```

---

## ⚙️ Como rodar localmente

### Pré-requisitos
- Java 17+
- Maven
- PostgreSQL rodando localmente

### Configuração do banco

No arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/protecontrol
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Rodando

```bash
git clone https://github.com/Jeannfreitas/protecontrol-backend
cd protecontrol-backend
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📡 Endpoints principais

### Autenticação
| Método | Rota | Descrição |
|---|---|---|
| POST | `/api/auth/login` | Login e geração do token JWT |

### Pedidos
| Método | Rota | Descrição |
|---|---|---|
| GET | `/api/pedidos` | Lista todos os pedidos |
| POST | `/api/pedidos` | Cria novo pedido |
| PATCH | `/api/pedidos/{id}/status` | Atualiza status do pedido |
| DELETE | `/api/pedidos/{id}` | Remove pedido |

### Dentistas
| Método | Rota | Descrição |
|---|---|---|
| GET | `/api/dentistas` | Lista todos os dentistas |
| POST | `/api/dentistas` | Cadastra dentista |
| DELETE | `/api/dentistas/{id}` | Remove dentista |

### Trabalhos
| Método | Rota | Descrição |
|---|---|---|
| GET | `/api/trabalhos` | Lista tipos de trabalho |
| POST | `/api/trabalhos` | Cadastra tipo de trabalho |
| DELETE | `/api/trabalhos/{id}` | Remove tipo de trabalho |

---
