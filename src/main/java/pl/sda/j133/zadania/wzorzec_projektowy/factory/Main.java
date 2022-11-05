package pl.sda.j133.zadania.wzorzec_projektowy.factory;

/**
 * @author Paweł Recław, AmeN
 * @project zadania
 * @created 05.11.2022
 */
public class Main {
    // Fabryka abstrakcyjna
    //
    // Definicja:
    //      [Fabryka] służy do tworzenia obiektów poprzez [z góry/pre] zdefiniowane metody. [Fabryka] przeważnie służy
    //      do tworzenia obiektów których chcemy ograniczyć możliwość "własnego tworzenia" (enkapsulacja).
    //
    // Jaki problem rozwiązuje:
    //      - Nie chcemy aby każdy [programista] mógł użyć konstruktora do stworzenia dowolneg obiektu
    //                      // Przykład: stwórz samochód który ma 100000 koni mechanicznych i spalanie 0.01 l/km
    //      - Chcemy zdefiniować obiekty które tworzymy często w projekcie i stworzyć prostszy sposób ich tworzenia.
    //
    // Kiedy używać:
    //      - kiedy chcemy ukryć możliwość tworzenia "dowolnych obiektów"
    //      - kiedy bardzo często używamy konstruktora z pewnymi parametrami i jest sens stworzyć [Fabryke]
    //              zamiast używać wielokrotnie konstrukotra (DRY)


}
