package pl.sda.j133.zadania.wzorzec_projektowy.strategia.dzidzia.original;

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
        // ta metoda wypisuje to, czego potrzebuje dziecko:
        //      -    jedzenie,
        //      -    spać,
        //      -    przewinąć

        // Zrób to prosto głuptasie
        // KISS - Keep it simple, stupid
        // Jeśli coś działa, to nie zmieniaj!

        if(uczucie == Uczucie.GŁÓD){
            System.out.println("mamo mamo, papu papu (jedzenie)");
        }
        if(uczucie == Uczucie.SENNOŚĆ){
            System.out.println("loguje do śpiulkolota (spać)");
        }
        if(uczucie == Uczucie.DYSKOMFORT){
            System.out.println("prrrrt (przewinąć)");
        }
        if(uczucie == Uczucie.MILOSC){
            System.out.println("tulu tulu (przytulać)");
        }
    }

    public enum Uczucie {
        GŁÓD,
        SENNOŚĆ,
        DYSKOMFORT,
        MILOSC;
    }
}
