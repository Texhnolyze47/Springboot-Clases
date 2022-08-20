## Despliegue de apps Spring Boot en Heroku

1. Crear cuenta en heroku.com y github.com
2. Tener configurando git en el pc
    1. git config --global user.name "user".
    2. git config --global user.email "user@ejemplo.com".
3. Crear el archivo system.properties con version de java que utilizas
````
java.runtime.version=17
````

4. Subir el proyecto desde con git
    1. git init
    2. git add .
    3. git commit "deploy"
    4. git remote add origin URL del repositorio
    5. git push origin main
5. Desde Heroku, crear app y elegir método Github y buscar el repositorio subido
6. Habilitar deploy automático y ejecutar el Deploy