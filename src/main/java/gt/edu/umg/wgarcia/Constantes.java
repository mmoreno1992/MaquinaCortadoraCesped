package gt.edu.umg.wgarcia;

import java.util.Arrays;
import java.util.List;

public class Constantes {
    public static final List<Nodo> estadosFinales = Arrays.asList(
            new Nodo(Lado.IZQUIERDO, Estado.LIMPIO, Estado.LIMPIO),
            new Nodo(Lado.DERECHO, Estado.LIMPIO, Estado.LIMPIO)
    );
}
