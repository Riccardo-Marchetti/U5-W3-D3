package riccardo.U5W3D3.Esercizio2;

public class Pagina implements Componente{
    private int numeroDiPagine = 1;

    @Override
    public void stampa() {
        System.out.println("Stampa pagina");
    }

    @Override
    public int getNumeroPagine() {
        return numeroDiPagine;
    }
}
