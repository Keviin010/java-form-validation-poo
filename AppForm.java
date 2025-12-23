package org.pooclasesabstractas.form;

import org.pooclasesabstractas.form.elementos.ElementoForm;
import org.pooclasesabstractas.form.elementos.InputForm;
import org.pooclasesabstractas.form.elementos.SelectForm;
import org.pooclasesabstractas.form.elementos.TextAreaForm;
import org.pooclasesabstractas.form.elementos.select.Opcion;
import org.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.List;

public class AppForm {
    public static void main(String[] args) {

        // --- Crear elementos y asignar validadores ---
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1", "Java");
        // Asumo que addopcion devuelve SelectForm para permitir encadenar
        lenguaje.addopcion(java)
                .addopcion(new Opcion("2", "Python"))
                .addopcion(new Opcion("3", "Javascript"))
                .addopcion(new Opcion("4", "Typescript"))
                .addopcion(new Opcion("5", "PHP"));

        // --- Asignar valores de prueba ---
        username.setValor("luis.kake");
        password.setValor("acb91fesr");
        email.setValor("juan.lo@correo.com");
        edad.setValor("22");
        experiencia.setValor("Tengo 2 años de experiencia en Java.");
        java.setSelected(true);

        // --- Colección de elementos ---
        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        // --- Imprimir formulario en consola ---
        System.out.println("===================================================");
        System.out.println("                     FORMULARIO                    ");
        System.out.println("===================================================\n");

        System.out.println("<form>");
        for (ElementoForm e : elementos) {
            // cada dibujarHtml() se imprime indentado y separado
            System.out.println("  " + e.dibujarHtml());
            System.out.println();
        }
        System.out.println("</form>\n");

        // --- Validaciones y salida de errores organizada ---
        System.out.println("---------------------------------------------------");
        System.out.println("                  RESULTADO VALIDACIÓN             ");
        System.out.println("---------------------------------------------------");

        int total = elementos.size();
        int validos = 0;
        int invalidos = 0;

        for (ElementoForm e : elementos) {
            boolean ok = e.esValido();
            if (ok) {
                validos++;
                System.out.printf("OK: %-12s -> válido%n", e.getNombre());
            } else {
                invalidos++;
                System.out.printf("ERROR: %-12s -> %d error(es)%n", e.getNombre(), e.getErrores().size());
                for (String err : e.getErrores()) {
                    System.out.println("    - " + err);
                }
            }
        }

        System.out.println("\nResumen:");
        System.out.println("  Total elementos: " + total);
        System.out.println("  Elementos válidos: " + validos);
        System.out.println("  Elementos con errores: " + invalidos);

        System.out.println("\n===================================================");
        System.out.println("                   FIN DEL FORMULARIO              ");
        System.out.println("===================================================\n");

        // clase anónima
        /*ElementoForm form = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "";
            }
        };*/
    }
}
