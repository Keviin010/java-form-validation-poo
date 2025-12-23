package org.pooclasesabstractas.form.elementos;

import org.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addopcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select>");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion: this.opciones){
            sb.append("<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append("Selected");
                this.valor = opcion.getValor();
            }
            sb.append(">").append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();

    }
}
