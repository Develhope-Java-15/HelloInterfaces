import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Martian implements Person {
    public long identificationCode;
    public String tribe;
    public LocalDate dateOfBirth;

    public Martian(long identificationCode, String tribe, LocalDate dateOfBirth) {
        this.identificationCode = identificationCode;
        this.tribe = tribe;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getFullName() {
        return tribe + " " + identificationCode;
    }

    @Override
    public String getTaxCode() {
        return tribe + "-" + tribe.length() + "-" + identificationCode * 1000;
    }

    @Override
    public int getAge() {
        return (int) ChronoUnit.CENTURIES.between(dateOfBirth, LocalDate.now());
    }
    
}
