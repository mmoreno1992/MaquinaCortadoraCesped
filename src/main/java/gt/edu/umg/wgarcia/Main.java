package gt.edu.umg.wgarcia;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Maquina Cortadora -----");

        MaquinaCortadora maquina = new MaquinaCortadora(new Nodo(Lado.IZQUIERDO,
                Estado.SUCIO,
                Estado.SUCIO));
        maquina.iniciaRecorrido();

    }
}
