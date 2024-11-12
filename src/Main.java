import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //Aggiungi un anno
        OffsetDateTime annoAggiunto = data.plusYears(1);
        //Sottrai un mese
        OffsetDateTime sottraiUnMese = data.minusMonths(1);
        //Aggiungi 7 giorni
        OffsetDateTime aggiungiGiorni = data.plusDays(7);

        //Stampa il risultato localizzato per L'Italia
        DateTimeFormatter formattaData = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);

        System.out.println("La data con un anno aggiunto:  " + annoAggiunto);
        System.out.println("La data iniziale con un mese sottratto: " + sottraiUnMese);
        System.out.println("La data iniziale con sette giorni aggiunti: " + aggiungiGiorni);
        System.out.println("La data iniziale formattata per l'Italia: " + data.format(formattaData));
    }
}
