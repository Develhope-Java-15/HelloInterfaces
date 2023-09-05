import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person[] population = new Person[]{
            new Italian("Giuseppe", "Covelli", LocalDate.of(1980, 8, 2)),
            new Italian("Emanuele", "Venuti", LocalDate.of(1992, 5, 13)),
            new German("Joseph", "Schwarz", LocalDate.of(1950, 2, 10)),
            new Martian(0, "Valhalla", LocalDate.of(1500, 10, 3)),
            new Martian(2, "Valhalla", LocalDate.of(1800, 12, 3)),
        };

        printPopulationDetails(population); 
    }

    public static void printPopulationDetails(Person[] array) {
        for(Person person : array) {
            System.out.println(" --- ");
            System.out.println(person.getFullName());
            System.out.println(person.getTaxCode());
            System.out.println(person.getAge());
        }
    }
}
