import java.util.Objects;

public class Przedmiot {
    private String nazwa;
    private int punktyECTS;

    public Przedmiot(String nazwa) {
        this.nazwa = nazwa;
    }
    public Przedmiot() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPunktyECTS() {
        return punktyECTS;
    }

    public void setPunktyECTS(int punktyECTS) {
        this.punktyECTS = punktyECTS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return punktyECTS == przedmiot.punktyECTS && Objects.equals(nazwa, przedmiot.nazwa);
    }

    @Override
    public String toString() {
        return String.format("%s - %d", nazwa, punktyECTS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, punktyECTS);
    }
}
