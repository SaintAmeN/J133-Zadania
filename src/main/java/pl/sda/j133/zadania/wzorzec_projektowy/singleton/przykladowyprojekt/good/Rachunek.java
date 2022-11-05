package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.good;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
@AllArgsConstructor
public class Rachunek {
    private List<Produkt> produktList;

    public void dodajProdukt(){
        produktList.add(new Produkt(new ArrayList<>(), 0.1));
    }
}
