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

6. Verificar la ejecución

La aplicación se ejecuta por defecto en:
http://localhost:8080 y luego agrega la tabla que estes usando por ejemplo /estudiantes


-Probar los endpoints usando Postman o el navegador
