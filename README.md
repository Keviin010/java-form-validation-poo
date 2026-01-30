# Java Form Validation con POO

Proyecto desarrollado en Java que implementa un sistema de formularios con validaciones, utilizando principios avanzados de Programación Orientada a Objetos para modelar campos, reglas de validación y comportamiento reutilizable.

## Objetivo del proyecto
Diseñar un sistema extensible de formularios que permita crear distintos tipos de campos, aplicar validaciones desacopladas y renderizar la estructura del formulario, fortaleciendo el diseño orientado a objetos y la separación de responsabilidades.

## Descripción general
El sistema permite:
- Definir distintos tipos de campos de formulario (Input, TextArea, Select).
- Renderizar los campos como HTML.
- Aplicar validaciones reutilizables y desacopladas.
- Encadenar configuraciones mediante un estilo Fluent API.

## Arquitectura del proyecto
- ElementoForm: clase abstracta base para los campos.
- InputForm, TextAreaForm, SelectForm: implementaciones concretas.
- Validador: clase abstracta para las reglas de validación.
- Validadores concretos: Requerido, Email, Largo, Numero.

La arquitectura está orientada a facilitar la extensión del sistema sin modificar la lógica central.

## Conceptos aplicados
- Clases abstractas
- Herencia
- Polimorfismo
- Composición
- Clases anónimas
- Encadenamiento de métodos (Fluent API)
- Validaciones desacopladas
- Colecciones y expresiones lambda

## Ejecución
Ejecutar la clase `AppForm` para visualizar la generación del formulario y la aplicación de las validaciones en consola.

## Contexto
Este proyecto forma parte del proceso de aprendizaje de Java backend y está enfocado en fortalecer el diseño orientado a objetos, habilidades clave para frameworks backend como Spring Boot.

## Posibles mejoras
- Integrar el sistema en un contexto de aplicación web real
- Adaptar las validaciones a una arquitectura REST
- Conectar el sistema con persistencia de datos
