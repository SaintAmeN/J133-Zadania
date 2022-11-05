package pl.sda.j133.zadania.wzorzec_projektowy;

import pl.sda.j133.zadania.wzorzec_projektowy.singleton.lazy.SingletonPrzelicznikInflacji;
import pl.sda.j133.zadania.wzorzec_projektowy.singleton.przykladowyprojekt.bad.PrzelicznikInflacji;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class MainOgolnieWzorce {
    public static void main(String[] args) {
        /**
         * Wzorce projektowe - praktyczne sposoby na rozwiązywanie [trudnych] problemów programistycznych.
         *
         * Kryteria wyboru wzorców:
         *  - zauważalność (częstość używania) w naturze
         *  - łatwość implementacji
         *  - praktyczność rozwiązywania problemu (jak niewiele trzeba zrobić żeby przyniosło dużo [pozytywnego] wpływu)
         *
         *
         *  Kategorie wzroców projektowych:
         *      - stworzeniowe - pomagają w sposobie tworzenia klas i obiektów
         *      - strukturalne - pomagają w odpowiednim ustrukturyzowaniu projektu
         *      - behawioralne - pomagają w ustrukturyzowaniu wzajemnego zachowania między obiektami
         *
         *      - JavaEE - Java Enterprise Edition
         *          - Korzystamy z JavaSE - Java Standard Edition
         */

        double inflacja = SingletonPrzelicznikInflacji.getInstance().getInflacja();
    }
}
