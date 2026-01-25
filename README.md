👉Pasos para la ejecución

1. Clonar el repositorio del proyecto

git clone https://github.com/diegod25122/GestionEstudiantes_Poo_Maigua_Camacho.git

2. Abrir el proyecto en el IDE

-Abrir el IDE de preferencia
-Seleccionar la opción Open Project
-Cargar la carpeta del proyecto clonado
-Crear la base de datos en PostgreSQL
-Abrir PostgreSQL

3.Crear una base de datos con el nombre definido en el proyecto
(por ejemplo: gestion_estudiantes)

-Configurar el archivo application.properties
-Ubicar el archivo en src/main/resources

4.Configurar los datos de conexión:
-URL de la base de datos
-Usuario
-Contraseña

5.Ejecutar el proyecto
-Ejecutar la clase principal del proyecto (la que tiene main)
O ejecutar desde la terminal con:
mvn spring-boot:run
- Para la ejecucion usaremos VisualStudioCode
- primero descargamos una extencion llamada REST CLIENT la cual nos ayduara a realizar los post, los put y los delete segun el id
- y para hacer post realizamos estos requerimientos <img width="559" height="304" alt="image" src="https://github.com/user-attachments/assets/2fb1dade-539e-4e6b-8685-aac28b055b9e" />
- lo mismo para editar y borrar
<img width="544" height="360" alt="image" src="https://github.com/user-attachments/assets/6d4548c2-0171-4389-ad22-202d2f9c4848" />

6. Verificar la ejecución

La aplicación se ejecuta por defecto en:
http://localhost:8080/api/estudiantes <img width="356" height="511" alt="image" src="https://github.com/user-attachments/assets/d6dd747f-f167-4820-82d8-8e7fe65814d5" />
y para verlo mas presentado con este url http://localhost:8080/index.html
<img width="1383" height="391" alt="image" src="https://github.com/user-attachments/assets/c3f37f67-d84b-4c9e-a4a5-2da3f05642dd" />




-Probar los endpoints usando Postman o el navegador
