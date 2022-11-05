package pl.sda.j133.zadania.zad_lista_zadan;

import pl.sda.j133.zadania.wzorzec_projektowy.factory.abstractfactory.FabrykaSamochodówMazdaMx5Impl;
import pl.sda.j133.zadania.wzorzec_projektowy.factory.abstractfactory.Samochód;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class MainTestAbstractFabryki {
    public static void main(String[] args) {
//        Samochód samochód = new Samochód("Moja", "Super hiper GTR Turbo Max Maszyna!", "Czerwony z czarnym paskiem przez środek turbo!", 0.1, 100000);
        Samochód samochód = FabrykaSamochodówMazdaMx5Impl.stwórzSamochód();
    }
}