| [./media/image1.png](./media/image1.png)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | **FORMATO DE INFORME DE PRÁCTICA DE LABORATORIO / TALLERES / CENTROS DE SIMULACIÓN – PARA ESTUDIANTES** |                                                                                                                                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                                         |                                                                                                                                                                                                  |
| **CARRERA**: Computación                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | **ASIGNATURA**: Plataformas Web                                                                         |                                                                                                                                                                                                  |
| **NRO. PRÁCTICA**:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | 2                                                                                                       | **TÍTULO PRÁCTICA**: Desarrollo de una aplicación JEE basado en Servlets, JSP y JDBC para el intercambio de datos en un modelo de tres capas aplicando los patrones diseño de software MVC y DAO |
| **OBJETIVO ALCANZADO:**  Diseñar y desarrollar modelos de software en diferentes niveles de abstracción y modelos de datos a nivel transaccional y analítico con entornos de desarrollo actuales. Persistencia de datos mediante DAO y JPA manipulación de estos, ya sea buscando por medio de código o enlistándolos en una tabla                                                                                                                                                                                      |                                                                                                         |                                                                                                                                                                                                  |
| **ACTIVIDADES DESARROLLADAS**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                                         |                                                                                                                                                                                                  |
| **Creación del repositorio en GitHub**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                                                                                         |                                                                                                                                                                                                  |
| **RESULTADO(S) OBTENIDO(S)**: Se ha desarrollado una aplicación con tecnología JEE para gestionar una agenda telefónica en la web,se ha aplicado patrones de diseño de software MVC y DAO, en donde, los modelos fueron clases POJOs de Java, la vista fue JSP + JSTL y los controladores a través de DAOs y Servlets.                                                                                                                                                                                                  |                                                                                                         |                                                                                                                                                                                                  |
| **CONCLUSIONES**: La implementación de tecnologías actuales en el desarrollo web es muy importante, porque la tecnología avanza muy rápido y no nos podemos quedar atrás, una de estas tecnologías es JEE, que toma mas tiempo que otras herramientas, pero se puede decir que ofrece mayor seguridad con filtros y sesiones, así también mediante el uso de patrón de diseño se puede conseguir una mejor organización a nuestra aplicación, sabiendo que tener buenas practicas es importante al momento de programar |                                                                                                         |                                                                                                                                                                                                  |
| **RECOMENDACIONES**: Aplicar conceptos de interacción humano máquina para el desarrollo de la GUI.                                                                                                                                                                                                                                                                                                                                                                                                                      |                                                                                                         |                                                                                                                                                                                                  |

![](media/13790f59ba2b119cbe382338a76c0a9a.png)

**Arquitectura del Modelo**

![](media/2db7171a8c9e99481e1680c42758653d.png)

**Requisitos aplicación Web**

**Los usuarios pueden registrarse en la aplicación a través de un formulario de
creación de cuentas**

**Persistencia**

![](media/3dc91bc293d61ffc914490ac06ef4c99.png)

**Servlets**

![](media/9651e0747779c5edfcfc30be86759f29.png)

**JSP**

**Un usuario puede iniciar sesión usando su correo y contraseña**

**Servlet**

![](media/6fde9d50739848d5a3c2a18c3bf2a5b8.png)

**JSP**

Se ha creado diferentes formularios p[ara la creación de la práctica, conforme
se ha pedidpo el docente para realizar la práctica.

**Formulario de log in**

![](media/6fde9d50739848d5a3c2a18c3bf2a5b8.png)

**Validación formularios**

![](media/708ed1638aea131b2e9d68bc442de77c.png)

Luego de un inicio correcto de sesión redirige hacia la página principal del
usuario

**Una vez iniciado sesión el usuario podrá:**

-   **Registrar, modificar, eliminar, buscar y listar sus teléfonos**

![](media/b7ebfd600d866c478cb3b13ad5adbbd0.png)

![](media/f2f20c5e25f6506c514669085e5f5749.png)

>   **JSP**

>   Envia de parámetro **acción=crear_telefono,** puesto que todas las acciones
>   se encuentran en el mismo controlado y es necesario identificarlas

>   **Actualizar y Eliminar**

>   El usuario tiene una lista de números que pueden ser eliminados o
>   actualizados, ingresa el numero en la caja de texto indicada y puede
>   realizar cualquiera de las dos acciones

>   **Listar los números de teléfono de un usuario usando su número de cédula o
>   correo electrónico**

>   Para esto se ha creado dos métodos en la persistencia

>   **Buscar por cedula**

![](media/3fd04849cd8808ceb4e2bbcc1d1d28bf.png)

>   **Buscar por correo**

![](media/3fd04849cd8808ceb4e2bbcc1d1d28bf.png)

>   Es un correo valido por lo tanto devuelve la siguiente tabla, ocurre lo
>   mismo con la cedula

>   Al dar click en el enlace de correo, automáticamente se abre la aplicación
>   predeterminado para correo

>   Así mismo ocurre cuando se da click a uno de los teléfonos de la lista, se
>   abre la aplicación predeterminada para hacer llamadas

>   **Filtros**

![](media/2f4e15bf64d3dd4c80f46894bbd05d37.png)

>   Se ha creado dos filtros, uno para redireccion de JSPs y otro para la
>   redireccion de los Servlets, los dos dirigen hacia la ventana llamada
>   **IniciarSesion.html**

>   **FiltroServlet**

![](media/6fde9d50739848d5a3c2a18c3bf2a5b8.png)

>   **Filtro JSPs**

![](media/2f4e15bf64d3dd4c80f46894bbd05d37.png)

>   **Funcionamiento Filtro**

>   Estoy en mi cuenta

>   Al momento de aplastar en el icono de teléfono, me dirigió hacia la parte
>   publica de la pagina web

>   Ahora quiero volver a mi cuenta personal, entonces como la sesión sigue
>   iniciada, me va a permitir regresar.

>   Ahora voy a cerrar sesion en mi cuenta

>   Y me encuentro nuevamente en la parte del inicio

>   Al momento de hacer click en **Mi cuenta**, el filtro va a activarse, pues
>   no encuentra ninguna sesión activa, me redirige hacia la página de login.

>   **Parte publica**

>   Pagina propuesta por el docente:

![](media/41dbe3d7e5fcbe0a847c07b05e35ed4b.png)

>   Se ha diseñado una pagina muy similar a la propuesta por el docente:

![](media/c081f6dc5b3083345041cb9d2b1227ad.png)

**Nombre de estudiante: \_____________________Adrian Tene______\_**

**Firma de estudiante: \___________\_**

![](media/2ec841d0a20ae7b43ea6a984574711a2.png)

**\__________________\_**
