## Open Authorization (OAuth)

Es un framework de autorizacion, abierto y esta construido estandares IETF y licenciado bajo OpenWeb Foundation.

Es un porotocolo de delegacion:

Permite que alguien que controla un recurso permita a una apliacacion de software acceder a ese recurso en su propio nombre si pasar oir ello.

Flujo de trabajo con OAuth:

1. Una aplicación solicitada autenticación
2. Se realiza login mediante Google
3. La aplicación se comunica con Google donde utilizan las credenciales de google sin que la aplicacion pueda verlas.
4. El servidor de Google pregunta al usuario si desea conceder X permisos
5. El usuario acepta los permisos
6. Google genera un token de acceso como respuesta
7. La aplicación utiliza ese token

## Escenarios para utilizar OAth

