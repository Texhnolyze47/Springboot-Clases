## JWT

https://jwt.io/introduction

Es un estandar abierto que permite transmitir información entre dos partes:

## Funcionamiento Session
1. Cliente envia una petición a un servidor (/api/login)
2. Servidor valida el username y password, sí no son válidos devolverá una respuesta un 401 unauthorized
3. Servidor valida el username y password, sí es válido entonces se almacena el usuario en session
4. Se genera una cookie en el Cliente
5. En próximas peticiones se comprueba que el cliente esta en session

Desventajas:

*  La información de la session se almacena en el servidor, lo cual consume recursos

## Funcionamiento

1. Cliente envia una petición a un servidor (/api/login)
2. Servidor valida el username y password, sí no son válidos devolverá una respuesta un 401 unauthorized
3. Servidor valida el username y password, sí es válido, genera un token JWT utilizando una secret key
4. Servidor devuelve el token JWT generado al Cliente
5. Cliente envia peticiones a los endpoints REST del servidor utilizando el token JWT en las cabeceras.
6. Servidor valida el token JWT en cada petición y si es correcto el acceso a los datos

Ventajas:

* El token se almacena en el Cliente, de manera que consume menos recursos en el Servidor, lo cual permite mejor escalabilidad

Desventajas:

* El token esta en el navegador, no podríamos invalidarlo antes de la fecha de expiración asignada cuando se creó
  * Lo que se realiza es dar la opción de logout, lo cual simplemente borra el token

## Estructura del token JWT

3 partes separadas por un punto (.) y codificadas en base 64 cada una:

1. Header
```json
{
  "alg":"HS512",
  "typ": "JWT"
}
```
2. Payload (informacion, datos del usuario, no sensibles)
```json
{
  "name":"John",
  "admin": true
}
```

3. Signature 

```
HMACKSHA256(
base64UrlEncode(header) + "." + base64UrlEncode(payload), secret
)
```

El User-Agent envia el token JWT en las cabeceras:

```
Authorization: Bearer <token>

```

## Configuración Spring

Crear proyecto Spring Boot con:

* Spring Security
* Spring Web
* Spring boot dev tools
* Spring Data JPA
* PostgreSQL
* Dependencia jwt

```
<!-- https://mvnrepository.com/artifact/com.auth0/java-jwt -->
<dependency>
    <groupId>com.auth0</groupId>
    <artifactId>java-jwt</artifactId>
    <version>4.0.0</version>
</dependency>

```