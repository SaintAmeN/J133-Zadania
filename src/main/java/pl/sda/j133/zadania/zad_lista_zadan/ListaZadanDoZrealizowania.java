package pl.sda.j133.zadania.zad_lista_zadan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 30.10.2022
 */
public class ListaZadanDoZrealizowania {
    private final List<Zadanie> listaZadan = new ArrayList<>();

    public void dodajZadanie(Zadanie zadanie) {
        listaZadan.add(zadanie);
    }

    // [ 5, 3, 12 ]
    // index of 5  =>  0
    // index of 12 =>  2
    // index of 17 => null
//    public Zadanie znajdzZadanie(String pelnaNazwa) {
//        for (Zadanie zadanie : listaZadan) {
//            if(zadanie.getNazwa().equals(pelnaNazwa)){
//                return zadanie;
//            }
//        }
//        return null;
//    }

    public Optional<Zadanie> znajdzZadanie(String pelnaNazwa) {
        for (Zadanie zadanie : listaZadan) {
            if(zadanie.getNazwa().equals(pelnaNazwa)){
                return Optional.of(zadanie);
            }
        }
        return Optional.empty();
    }
}
