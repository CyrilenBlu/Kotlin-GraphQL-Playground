# Kotlin-GraphQL Playground
### Technologies learning:
- Language: Kotlin
- GraphQL
- Apache Camel
- RabbitMQ integration (simple queue, todo in-depth)

### Docker RabbitMQ setup:
- Docker command (or - docker-compose up):
  > docker run --name blurabbit --hostname localhost -p 5672:5672 -p 15672:15672 -e RABBITMQ_DEFAULT_USER=blurabbit -e RABBITMQ_DEFAULT_PASS=blurabbit -d rabbitmq:3-management
- If access denied add guest user at http://localhost:15672/#/users with all permissions.
