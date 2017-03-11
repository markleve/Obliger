import java.util.concurrent.atomic.AtomicInteger;

public class BlaaResept extends Resept {

  private static final AtomicInteger idGenerator = new AtomicInteger();

  public BlaaResept(Legemiddel legemiddel, Lege lege, int pasientId, int reit) {
    super(legemiddel, lege, pasientId, reit);
    id = idGenerator.getAndIncrement();
  }
  /**
  * Returnerer reseptens farge. Enten "blaa" eller "hvit".
  * @return      reseptens farge
  */
  public String farge() { return "blaa"; }

  @Override
  public String toString() {
    return "Blå resept " + super.toString();
  }
}
