import java.util.Objects;

public class Rechteck {
     int laenge;
     int breite;

    public Rechteck(int length, int width) {
        this.laenge = length;
        this.breite = width;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rechteck rechteck = (Rechteck) o;
        return laenge == rechteck.laenge && breite == rechteck.breite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(laenge, breite);
    }
}
