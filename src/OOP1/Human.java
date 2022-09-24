package OOP1;

public class Human {
    int yearOfBirth;
    String name;
    String town;

    String job;

    void human() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году.  Я работаю на должности: " + job + ". Будем знакомы!");
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }
}
