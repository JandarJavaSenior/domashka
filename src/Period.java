import java.time.LocalDate;

public class Period {
    int ole;
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        java.time.Period period = java.time.Period.between(LocalDate.ofEpochDay(ole), currentDate);
        return period.getYears();
    }
}
