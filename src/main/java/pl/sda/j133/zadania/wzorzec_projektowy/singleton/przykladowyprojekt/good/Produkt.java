package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.good;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
@AllArgsConstructor
public class Produkt {
    private List<Składnik> składnikList;
    private double margines; // zysk z produktu

    public void dodajSkładnik() {
        składnikList.add(new Składnik(2.50));
    }

    public double zwrocCene() {
        return składnikList.stream().mapToDouble(value -> value.getCena()).sum() + (margines * PrzelicznikInflacji.INSTANCE.getInflacja());
    }
}
