import java.util.concurrent.atomic.AtomicInteger;

public class Pasient {
  private String navn;
  private long fodselsNr;
  private String adresse;
  private int postnummer;
  private Stabel<Resept> reseptliste;
  private static final AtomicInteger idGenerator = new AtomicInteger();
  private int id;    // skal dene gjores finale?? Slik at den ikke kan endre?

  public Pasient(String navn, long fodselsNr, String adresse, int postnummer) {
    this.navn = navn;
    this.fodselsNr = fodselsNr;
    this.adresse = adresse;
    this.postnummer = postnummer;
    id = idGenerator.getAndIncrement();
    reseptliste = new Stabel<Resept>();
  }

  // hvordan skal man skrive javadoc til get metoder ??
  public int hentId() { return id; }
  public String hentNavn() { return navn; }
  public long hentFodselsnummer() { return fodselsNr; }
  public String hentGateadresse() { return adresse; }
  public int hentPostnummer() { return postnummer; }
  public Stabel<Resept> hentReseptliste() { return reseptliste; }

  // skal man kalle paa metoden for aa faa reseptlisten, eller kan
  // man bare bruke variablenavnet: reseptliste
  public void leggTilResept(Resept resept) {
    reseptliste.settInn(resept);
  }

  @Override
  public String toString() {
    return "\nPassient " + "[" + id + "]: " + navn + " (" +
    fodselsNr + ")\n" + "Adresse: " + adresse +
    "\nPostnummer: " + postnummer;
  }
}
