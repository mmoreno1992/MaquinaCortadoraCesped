package gt.edu.umg.wgarcia;

import java.util.ArrayList;
import java.util.List;

public class MaquinaCortadora {

    List<Nodo> recorrido = new ArrayList<>();
    Nodo estadoActual;

    public MaquinaCortadora(Nodo estadoInicial) {
        agregaEstadoRecorrido(estadoInicial);
    }

    public void iniciaRecorrido() {
        do {
            Nodo nodo = getEstado();
            // imprimeEstado(nodo);
            agregaEstadoRecorrido(nodo);
        } while (!esEstadoFinal());
        //imprimeEstado(estadoActual);
    }

    private boolean esEstadoFinal() {
        var nodoEstadoFinal = Constantes.estadosFinales.stream().filter(
                item -> item.equals(estadoActual)
        ).findFirst();
        return nodoEstadoFinal.isPresent();
    }

    private Nodo getEstado() {
        Nodo nodo = null;

        switch (estadoActual.lado) {
            case IZQUIERDO:
                nodo = new Nodo(Lado.DERECHO, estadoActual.estadoIzquierdo, Estado.LIMPIO);
                break;
            case DERECHO:
                nodo = new Nodo(Lado.IZQUIERDO, Estado.LIMPIO, estadoActual.estadoDerecho);
        }
        return nodo;
    }

    private void imprimeEstado(Nodo nodo) {
        System.out.printf("Lado -> %s", estadoActual.lado);
        System.out.println();
        System.out.printf("Lado Izquierdo [%s], Lado Derecho [%s] ", estadoActual.estadoIzquierdo, estadoActual.estadoDerecho);
        System.out.println();
        System.out.println("------------------");
        System.out.println("Mover hacia -> " + nodo.lado);
        System.out.println("Limpiar");
        System.out.println("------------------");
    }

    private void agregaEstadoRecorrido(Nodo estado) {

        estadoActual = estado;
        if (estadoActual != null)
            imprimeEstado(estado);
        recorrido.add(estado);
    }

}
