package Human;

import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private final String name;
    private String town;
    private int yearOfBirth;
    private final String job;

    public Human(String name, String town, int age, String job) {
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        if (age >= 0) {
            yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            yearOfBirth = LocalDate.now().getYear() - Math.abs(age);
        }
        this.job = Objects.requireNonNullElse(job, "Информация не указана");
    }

    public Human(String name, String town, String job) {
        this(name, town, 0, job);
    }


    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public void setYearOfBirth(int age) {
        if (age >= 0) {
            yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            yearOfBirth = LocalDate.now().getYear();
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                ". Я работаю на должности " + job + ". Будем знакомы!";
    }
}