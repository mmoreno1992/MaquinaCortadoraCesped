package gt.edu.umg.wgarcia;

import java.util.Objects;

public class Nodo {

    Lado lado;
    Estado estadoIzquierdo;
    Estado estadoDerecho;

    public Nodo(Lado lado,
                Estado estadoIzquierdo,
                Estado estadoDerecho) {
        this.lado = lado;
        this.estadoIzquierdo = estadoIzquierdo;
        this.estadoDerecho = estadoDerecho;
    }

    public Lado getLado() {
        return lado;
    }

    public void setLado(Lado lado) {
        this.lado = lado;
    }

    public Estado getEstadoIzquierdo() {
        return estadoIzquierdo;
    }

    public void setEstadoIzquierdo(Estado estadoIzquierdo) {
        this.estadoIzquierdo = estadoIzquierdo;
    }

    public Estado getEstadoDerecho() {
        return estadoDerecho;
    }

    public void setEstadoDerecho(Estado estadoDerecho) {
        this.estadoDerecho = estadoDerecho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return lado == nodo.lado && estadoIzquierdo == nodo.estadoIzquierdo && estadoDerecho == nodo.estadoDerecho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado, estadoIzquierdo, estadoDerecho);
    }

    @Override
    public String toString() {
        return "Estado {" +
                " En lado = " + lado +
                ", estadoIzquierdo=" + estadoIzquierdo +
                ", estadoDerecho =" + estadoDerecho +
                '}';
    }
}
