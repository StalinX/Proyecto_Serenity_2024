Por: Stalin Patricio Riofrío Terrazas
# Ejercicio
Automatización de página web "http://opencart.abstracta.us/"
Objetivo Añadir 2 productos al carrito de compras


## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:

  - Maquina local con el sistema operativo Debian 11.0 - Windows 10 - Linux
  - JDK versión 1.8 +  (debe estar en la variable de entorno o en ide de intellij)
  - Intellij-Idea Comunity o Ultimate version 2024 - ultima version
  - Gradle 8.0 (debe estar en la variable de entorno)



## Ejecucion
- Para ejecutar el proyecto
        1. Abrir el IDE IntellijIdea
        2. Ingresar en la opción File -> Open y ubicarse en el proyecto (abrir)
        3. Esperar unos minutos para que se descargen las despendencias (gradle)
        4. Ubicarse y ejecutar la clase buyRunner.java (src/test/java/co/com.ejercicio.software/runners/buyRunner.java.
            - La clase ejecutara los features de forma ordenada según el ejercicio realizado
            - ## Reporte Serenity: Una vez finalizada la ejecución se crea el informe propio de Serenety (se añadio capturas de pantalla de cada paso)
            para visualizarlo ubicarse en la ruta target/serenity/index.html
        5. Adicional, se puede cambiar la configuración del archivo serenity para que se ejecute en otro navegador (firefox)

        Otra forma de ejecutar el proyecto es desde el terminal mediante:

        ```bash/cmd
       -Generar la carpeta build/libs con el JAR del proyecto
       gradle build
       -Opcional: Genera los archivos para eclipse (.classpath, .project, .settings).
       gradle eclipse
       Ejecutar el proyecto
       gradle run
        ```
## Información adicional
Referencia Serenity: https://serenity-bdd.info/
Repositorio Serenity: https://github.com/serenity-bdd
Repositorio Stalin Riofrío: https://github.com/StalinX

## Ejemplos de Automatizaciones con Cypress
Repositorio Cypress: https://github.com/StalinX/AutomatizacionesWeb_Cypress.git