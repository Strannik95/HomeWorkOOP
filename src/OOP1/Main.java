package OOP1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human();
        maksim.yearOfBirth = 2022 - 35;
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.job = "бренд-менеджер";
        maksim.human();

        Human anya = new Human();
        anya.yearOfBirth = 2022 - 29;
        anya.name = "Аня";
        anya.town = "москва";
        anya.job = "методист образовательных программ";
        anya.human();

        Human katya = new Human();
        katya.yearOfBirth = 2022 - 28;
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.job = "продакт-менеджер";
        katya.human();

        Human artem = new Human();
        artem.yearOfBirth = 2022 - 27;
        artem.name = "Артем";
        artem.town = "Москва";
        artem.job = "директор по развитию бизнеса";
        artem.human();
    }
}
