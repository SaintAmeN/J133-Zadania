package pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.good;

import lombok.AllArgsConstructor;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
@AllArgsConstructor
public class Składnik {
    private double cena;

    public double getCena(){
        return cena * PrzelicznikInflacji.INSTANCE.getInflacja();
    }
}
