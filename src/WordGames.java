
/**
 * Questa classe rappresenta un gioco di parole.
 * Può aggiungere "Hello [wordHere]" a una parola data
 * e concatenare un nome e un cognome.
 * Autore: [Maicol Cassarà]
 */
public class WordGames {

    /**
     * Aggiunge "Hello [wordHere]" a una parola data.
     * @param word la parola a cui aggiungere "Hello"
     * @return una stringa contenente "Hello" seguito dalla parola data tra parentesi quadre
     */
    public String addHelloWord(String word) {
        return "Hello [" + word + "]";
    }

    /**
     * Concatena un nome e un cognome.
     * @param name il nome da concatenare
     * @param surname il cognome da concatenare
     * @return una stringa contenente il nome e il cognome concatenati
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }

}
