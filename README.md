# API REST de Productos - Trabajo Práctico UTN

Este proyecto es una API REST desarrollada con Spring Boot 3 para la gestión de productos de un e-commerce.

## Tecnologías

- Java 17
- Spring Boot 3.x
- H2 Database (Base de datos en memoria)
- Spring Data JPA
- Lombok
- Hibernate Validator
- SpringDoc OpenAPI (Swagger)

## Ejecución

Para ejecutar la aplicación, utiliza Maven:

```bash
mvn spring-boot:run
```

La aplicación iniciará en `http://localhost:8080`.

## Documentación de la API (Swagger)

Una vez iniciada la aplicación, puedes acceder a la documentación interactiva en:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Base de Datos (H2 Console)

Para acceder a la consola de H2:

- **URL**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:productosdb;DB_CLOSE_DELAY=-1`
- **User**: `sa`
- **Password**: (dejar vacío)

## Pruebas con cURL

### 1. Crear un producto
```bash
curl -X POST http://localhost:8080/api/productos \
-H "Content-Type: application/json" \
-d '{
  "nombre": "Notebook Gamer",
  "descripcion": "Potente notebook para juegos",
  "precio": 1500.00,
  "stock": 10,
  "categoria": "ELECTRONICA"
}'
```

### 2. Listar todos los productos
```bash
curl -X GET http://localhost:8080/api/productos
```

### 3. Buscar por ID
```bash
curl -X GET http://localhost:8080/api/productos/1
```

### 4. Actualizar Stock (PATCH)
```bash
curl -X PATCH http://localhost:8080/api/productos/1/stock \
-H "Content-Type: application/json" \
-d '{
  "stock": 20
}'
```

### 5. Eliminar Producto
```bash
curl -X DELETE http://localhost:8080/api/productos/1
```
