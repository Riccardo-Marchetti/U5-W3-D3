package riccardo.U5W3D3.Esercizio1;

import java.time.LocalDate;
import java.util.Date;

public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    public String getNomeCompleto(){
        String result;
        result = info.getNome() + " " +  info.getCognome();
        System.out.println("il nome completo è: " + result );
        return result;
    }

    public int getEta(){
        LocalDate oggi = LocalDate.now();
        int result;
        result = oggi.getYear() - info.getDataDiNascita().getYear();
        System.out.println("Età: " + result + " anni");
        return result;
    }
}
