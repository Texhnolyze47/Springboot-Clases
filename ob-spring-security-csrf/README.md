

## Medidas de seguridad en Spring

## CSRF

* Cross-Site Request Forgery

Falsificación de solicitudes entre sitios

Es una ataque que hace que el usuario final ejecute acciones no deseadas 
en una aplicación web en la que están autenticados actualmente.

Mediante ingeniería social un atacante puede engañar a los usuarios de una aplicación
web para que se ejecuten acciones que elija el atacante

## XSS

Secuencias de comandos entre sitios

Se inyecta una secuencia de comandos malintencionados en un sitio web por lo general
a través de un input para enviar código malicioso.

* Control de caché
* Opciones de tipo de contenido
* Seguridad de transporte estricta de HTTP
* Opciones X-Frame
* Protección X-XSS

Spring habilita por defecto todo este tipo de medidas.

## SQL Injection

```sql 
"select * from table where name='" + name + "';"
```

```sql 
"select * from table where name='" + 'Pepito or 1=1;delete * from users;'
```

Sanitizar la entrada a través de parámetros:

```
Query query = em.createQuery("SELECT * FROM table where username = :username");
query.setParameter("username", "Pepito");
```

## Más información

https://owasp.org/www-project-top-ten/

## Backend: Configuración Heroku

1. Fichero system.properties especificando la version de java
2. Subir proyecto a Github
3. Conectar con Heroku para realizar despligue
4. Añadir addon de PostegreSQL en Heroku
5. Actualizar applicaction.properties

## Frontend Vercel

1. Subir proyecto Github
2. Ajustar URL al backend
3. Subir a Vercel
