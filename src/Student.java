import java.time.LocalDate;


class Student {
    String name;
    LocalDate birthDate;
    long phoneNumber;
    String nationality;

    public Student(String name, LocalDate birthDate, long phoneNumber, String nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        java.time.Period period = java.time.Period.between(birthDate, currentDate);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + birthDate + ", Номер телефона: " + phoneNumber + ", Нация: " + nationality;
    }
}

