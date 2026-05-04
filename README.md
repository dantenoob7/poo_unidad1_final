 Proyecto POO – Contenidos Audiovisuales

 Descripción del Proyecto

Este proyecto consiste en la ampliación de un sistema desarrollado en Java para la gestión de contenidos audiovisuales, aplicando conceptos avanzados de Programación Orientada a Objetos (POO).

A partir de una base inicial que incluye clases como ContenidoAudiovisual, Película, SerieDeTV y Documental, se han incorporado nuevas funcionalidades, clases y relaciones para enriquecer el modelo del sistema.

El objetivo principal es demostrar el uso de principios como herencia, asociación, agregación y composición, además del manejo de proyectos mediante GitHub.


 Objetivos

- Aplicar conceptos avanzados de POO en Java
- Extender un sistema existente con nuevas clases y funcionalidades
- Modelar relaciones entre clases (asociación, agregación, composición)
- Crear un sistema funcional y estructurado
- Gestionar versiones del proyecto con GitHub


Clases Implementadas

 Clases originales

ContenidoAudiovisual
Película
SerieDeTV
Documental

Nuevas clases añadidas

Actor - Relacionado con Película (asociación)
Temporada - Relacionada con SerieDeTV (composición)
Investigador - Relacionado con Documental (asociación)


Nuevas Subclases

Se añadieron nuevas subclases que heredan de "ContenidoAudiovisual":

Podcast
Audiolibro

Cada una incluye:

Atributos propios
Constructores
Métodos personalizados


Relaciones entre Clases

Herencia:

Película, SerieDeTV, Documental, VideoYouTube y Cortometraje heredan de ContenidoAudiovisual

Asociación:

Película - Actor
Documental - Investigador

Composición:

SerieDeTV - Temporada



Funcionalidades

El sistema permite:

Crear objetos de todas las clases
Gestionar información de contenidos audiovisuales
Relacionar actores, temporadas e investigadores
Ejecutar el sistema sin errores


Tecnologías utilizadas

Java
Programación Orientada a Objetos (POO)
Git y GitHub
Eclipse IDE


 Instrucciones de uso

1. Clonar el repositorio:

git clone https://github.com/dantenoob7/poo_unidad1_final.git

2. Abrir el proyecto en Eclipse

3. Ejecutar la clase principal del proyecto


Estructura del Proyecto


src
 -main/java/
     -clases principales
      -nuevas clases
      -subclases




Mejoras implementadas

-Ampliación del modelo con nuevas clases
-Implementación de relaciones POO completas
-Código organizado y modular
-Proyecto funcional y listo para ejecución


Autor

Geovanny Sanchez

