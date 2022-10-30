package pl.sda.j133.zadania.wzorzec_projektowy.strategia.dzidzia.good;

import lombok.AllArgsConstructor;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
@AllArgsConstructor
public class Dziecko {
    private String imie;
    private Uczucie uczucie;

    public void setUczucie(Uczucie uczucie){
        this.uczucie = uczucie;
    }

    public void czegoPotrzebuje() {
        System.out.println(uczucie.czegoPotrzebuje());
    }

}
