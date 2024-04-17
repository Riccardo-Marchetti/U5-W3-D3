package riccardo.U5W3D3.Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Componente{
    private List<Componente> componente = new ArrayList<>();

    @Override
    public void stampa() {
        System.out.println("Stampa della sezione");
        for (Componente componente : componente){
            componente.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int pagineTotali = 0;
        for (Componente componente : componente){
            pagineTotali += componente.getNumeroPagine();
        }
        return pagineTotali;
    }
}
