public class Main {
    public static void main(String[] args) {
        Przedmiot historia = new Przedmiot("historia");
        Przedmiot polski = new Przedmiot("Polski");

        Student rochard = new Student("Roch", "Drgas", 0, 2006);
        Student kajetan = new Student("Kajetan", "Kafka", 1, 1995);

        rochard.dodajPrzedmiot(historia);
        rochard.dodajPrzedmiot(polski);

        kajetan.dodajPrzedmiot(polski);
    }
}