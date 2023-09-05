import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class German implements Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public German(String firstName, String lastName, LocalDate dateOfBirth) {
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
        return firstName.substring(3, 4) + lastName.substring(0, 1);
    }

    @Override
    public int getAge() {
        LocalDate now = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.dateOfBirth, now);
    }
}
