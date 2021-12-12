# mundo-de-suenos-java

En el archivo src/menu.java, se debe buscar la función conexionDB y agregar las credenciales de conexión de su base de datos local en las variables correspondietes.

## Sentencias SQL

Las sentencias iniciales para la creación de la base de datos y la tabla:

```
CREATE SCHEMA libreriaMundodeSuenos;
USE libreriaMundodeSuenos;
CREATE TABLE libros(
	isbn INTEGER PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    autor VARCHAR(30) NOT NULL,
    precio DOUBLE NOT NULL,
    cantidad INT NOT NULL,
    editorial VARCHAR(30) NOT NULL
);
```
