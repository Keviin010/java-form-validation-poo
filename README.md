# Java Form Validation con POO

Proyecto académico desarrollado en Java para practicar Programación Orientada a Objetos avanzada.

## Descripción
Este proyecto implementa un sistema de formularios en Java que permite:
- Crear distintos tipos de campos (Input, TextArea, Select)
- Renderizar los campos como HTML
- Validar los datos usando validadores reutilizables
- Aplicar herencia, clases abstractas y polimorfismo

## Conceptos aplicados
- Clases abstractas
- Herencia
- Polimorfismo
- Clases anónimas
- Composición
- Encadenamiento de métodos (Fluent API)
- Validaciones desacopladas
- Colecciones y expresiones lambda

## Estructura del proyecto
- `ElementoForm`: clase abstracta base
- `InputForm`, `TextAreaForm`, `SelectForm`: implementaciones concretas
- `Validador`: clase abstracta para validaciones
- Validadores concretos como `Requerido`, `Email`, `Largo`, `Número`.

## Ejecución
Ejecutar la clase `AppForm` para ver la generación del formulario y las validaciones en consola.

## Objetivo
Proyecto de aprendizaje enfocado en fortalecer fundamentos de Java y POO.
