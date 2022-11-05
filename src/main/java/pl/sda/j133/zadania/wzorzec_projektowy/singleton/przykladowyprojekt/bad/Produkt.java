package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.bad;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
@AllArgsConstructor
public class Produkt {
    private PrzelicznikInflacji przelicznikInflacji;

    private List<Składnik> składnikList;
    private double margines; // zysk z produktu

    public void dodajSkładnik(){
        składnikList.add(new Składnik(przelicznikInflacji, 2.50));
    }
}
