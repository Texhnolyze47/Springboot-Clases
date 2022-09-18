## Requesitos 
1. Instalar nodejs
2. Instalar Angular CLI 
   1. npm install -g @angular/cli

Preparar Entorno FRONTEND
1. Fork del repo angular: https://github.com/alansastre/angular-springboot1
2.	Ajustar URL backend (http://localhost:8080) en el frontend:
      a.	auth.service.ts
      b.	cars.service.ts
      c.	hello.service.ts
3.	Iniciar frontend: ejecutar el comando ng serve a través de terminal en el directorio raíz del proyecto angular
4.	Entrar al frontend a través del navegador poniendo
      a.	http://localhost:4200

FRONTEND - VERCEL (CLOUD):
1.	Ajustar URL backend (https://alansastre-springboot-psql.herokuapp.com/ ) en el frontend:
      a.	auth.service.ts
      b.	cars.service.ts
      c.	hello.service.ts
2.	Git push de frontend a GitHub
3.	En vercel.com desplegar el repositorio git
4.	Copiar URL generada del frontend de la aplicación angular, ejemplo: https://angular-springboot1-beta.vercel.app

BACKEND - HEROKU (CLOUD):
1.	En la clase SecurityConfig.java actualizar en configuración CORS las urls permitidas poniendo la generada en el paso anterior (https://angular-springboot1-beta.vercel.app)
2.	Asegurarse de que en application.properties se tienen las credenciales de PostgreSQL de Heroku
      a.	spring.datasource.url=jdbc:postgresql://ec2-54-74-14-109.eu-west-1.compute.amazonaws.com:5432/d1c2r62fpkdk34
      b.	spring.datasource.username=tboyqicofgsuyv
      c.	spring.datasource.password=7d7aa33e27c241efa92c341b184398356cd0f28853fc99592928ad9b63a9aec1
3.	Git Push de backend a GitHub
4.	Heroku desplegar (automático o manual)
5.	Heroku revisar logs y ver que la aplicación está en pie


CONEXIÓN FRONTEND – BACKEND
1.	Ya estaría todo conectado
2.	Verificar que desde angular se puede hacer login y registro
