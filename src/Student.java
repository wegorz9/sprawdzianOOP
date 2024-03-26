import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String imie;
    private String nazwisko;
    private long id;
    private int rokStudiow;
    private ArrayList<Przedmiot> przedmioty = new ArrayList<>();

    public Student(String imie, String nazwisko, long id, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
        this.rokStudiow = rokStudiow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public long getId() {
        return id;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public ArrayList<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                ", rokStudiow=" + rokStudiow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && rokStudiow == student.rokStudiow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(przedmioty, student.przedmioty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, id, rokStudiow, przedmioty);
    }
    public void dodajPrzedmiot(Przedmiot p){
        przedmioty.add(p);
    }
}
