package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class Firma {
    private PrzelicznikInflacji przelicznikInflacji;
    private List<Restauracja> restauracjaList;

    public void dodajRestauracje(){
        restauracjaList.add(new Restauracja(przelicznikInflacji, new ArrayList<>(), new ArrayList<>()));
    }
}
