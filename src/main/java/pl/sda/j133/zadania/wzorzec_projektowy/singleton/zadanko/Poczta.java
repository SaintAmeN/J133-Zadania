package pl.sda.j133.zadania.wzorzec_projektowy.singleton.zadanko;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class Poczta {
    private Rejestracja rejestracja = new Rejestracja();
    private PortalInternetowy portalInternetowy = new PortalInternetowy();
    private Automat automat = new Automat();


    public int getNumerekPortalInternetowy(){
        return portalInternetowy.nextNumerek();
    }

    public int getNumerekAutomat(){

        return automat.nextNumerek();
    }

    public int getNumerekRejestracja(){
        return rejestracja.nextNumerek();
    }

}
