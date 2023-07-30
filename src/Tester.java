/**
 * Questa classe è utilizzata per testare i metodi della classe WordGames.
 * Autore: [Maicol Cassarà]
 */

public class Tester {

    public static void main(String[] args) {
        WordGames wordGames = new WordGames();

            // Test del metodo addHelloWord
            String word = "wordHere";
            String helloWord = wordGames.addHelloWord(word);
            System.out.println(helloWord);

            // Test del metodo getFullName
            String name = "Maicol";
            String surname = "Cassarà";
            String fullName = wordGames.getFullName(name, surname);
            System.out.println(fullName);
    }
}

