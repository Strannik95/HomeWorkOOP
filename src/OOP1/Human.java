package OOP1;

public class Human {
    int yearOfBirth;
    String name;
    String town;

    String job;

    int currentYear = 2022;

    void human() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + (currentYear - yearOfBirth) +
                " году.  Я работаю на должности: " + job + ". Будем знакомы!");
    }

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0) {
            System.out.println("Год рождения не может быть отрицательным");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null){
            System.out.println( "Информация не указана");

        } else {
            this.name = name;
        } if (town == null){
            System.out.println("Информация не указана");
        } else {
            this.town = town;
        }
        if (job == null) {
            System.out.println("Информация не указана");

        } else {
            this.job = job;
        }
    }
}
