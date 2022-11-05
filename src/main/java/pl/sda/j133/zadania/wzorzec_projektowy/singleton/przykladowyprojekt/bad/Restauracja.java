package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.bad;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
@AllArgsConstructor
public class Restauracja {
    private PrzelicznikInflacji przelicznikInflacji;

    private List<Kasa> kasaList;
    private List<Zamowienie> zamowienies;

    public void dodajZamowienie(){
        zamowienies.add(new Zamowienie(przelicznikInflacji, new ArrayList<>()));
    }
}
