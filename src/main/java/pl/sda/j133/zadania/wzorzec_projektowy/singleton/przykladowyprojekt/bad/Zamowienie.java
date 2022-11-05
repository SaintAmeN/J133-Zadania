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
public class Zamowienie {
    private PrzelicznikInflacji przelicznikInflacji;
    private List<Rachunek> rachunekList;

    public void dodajRachunek(){
        rachunekList.add(new Rachunek(przelicznikInflacji, new ArrayList<>()));
    }
}
