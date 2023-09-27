import java.util.Arrays;

public class MetodiStringhe {

    public static void main(String[] args) {
        String s = "Java developer";
        // il metodo lenght ritorna la lunghezza della stringa
        int lenght = s.length();
        System.out.println("La lunghezza della stringa è: " + lenght);
        // substring ritorna la sottostringa delimitata dai due parametri in input
        String subs = s.substring(5,14);
        System.out.println("La stringa affettata è: " + subs);
        // il metodo equals confronta due stringhe e torna true se sono uguali
        String new_s = "Java developer";
        boolean b = s.equals(new_s);
        System.out.println("Le stringhe sono uguali? " + b);
        // se io confrontassi con l'==
        boolean ugualeuguale = (s == new_s);
        System.out.println("Sono la stessa stringa? " + ugualeuguale);
        // il metodo charAt(n) ritorna il carattere in posizione n
        char lettera = s.charAt(8);
        System.out.println("La lettera in posizione 8 è: " + lettera);
        // il metodo startswith(prefisso) ritorna true se la stringa inizia con quel prefisso
        boolean startwith = s.startsWith("Java");
        boolean startwith2 = s.startsWith("java");
        System.out.println("Java è un prefisso di Java developer? " + startwith);
        System.out.println("java è un prefisso di Java developer? " + startwith2);
        System.out.println("-------------");
        // il metodo toUpperCase() rende la stringa tutta maiuscola
        s.toUpperCase();
        System.out.println("La stringa di partenza maiuscola è: " + s);
        // non ha funzionato perchè le stringhe sono immutabili!
        System.out.println("La stringa di partenza maiuscola è: " + s.toUpperCase());
        System.out.println("----------------");
        // il metodo indexOf ritorna il primo indice della stringa passata in input all'
        // interno di quella principale
        int index = s.indexOf("dev");
        System.out.println("La stringa dev inizia in posizione " + index);
        System.out.println("-------------------");
        // replace(old, new) consente di sostituire ogni occorrenza di old con una di new
        s = s.replace("Java", "Python");
        System.out.println("La stringa iniziale modificata è: " + s);
        // il metodo split divide la stringa in un array in base all'input
        String[] parole = s.split(" ");
        System.out.println("Le parole sono: " + Arrays.toString(parole));
        System.out.println("-------------------");
        s = "ciao";
        if (s.length() > 10) {
            System.out.println("Ammazza quanto è lunga questa stringa!");
        }
        else {
            System.out.println("Ammazza quanto è corta!");
        }
    }

}
