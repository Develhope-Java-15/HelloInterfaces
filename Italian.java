import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Italian implements Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Italian(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getTaxCode() {
        return firstName.substring(0, 1) + firstName.substring(2, 3) + lastName.substring(3, 4);
    }

    @Override
    public int getAge() {
        LocalDate now = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.dateOfBirth, now);
    }
}
