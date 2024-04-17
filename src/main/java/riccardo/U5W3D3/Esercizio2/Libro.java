package riccardo.U5W3D3.Esercizio2;


import java.util.ArrayList;
import java.util.List;

public class Libro implements Componente{
    private List<Componente> componente = new ArrayList<>();
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    @Override
    public void stampa() {
        System.out.println("Stampa del libro");
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
