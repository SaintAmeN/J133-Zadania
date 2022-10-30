package pl.sda.j133.zadania.zad_lista_zadan;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
@Data
public class Zadanie {
    private String nazwa;
    private String tresc;
    private LocalDateTime dataCzasStworzenia;

    // konstruktor pusty
    public Zadanie() {
        this.dataCzasStworzenia = LocalDateTime.now();
    }

    // konstruktor z dwoma polami i datą/czasem przypisaną przy stworzeniu
    public Zadanie(String nazwa, String tresc) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.dataCzasStworzenia = LocalDateTime.now();
    }
}
