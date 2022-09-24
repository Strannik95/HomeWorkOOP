package OOP1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(2022 - 35,"Максим","Минск","бренд-менеджер");
        maksim.human();

        Human anya = new Human(2022 - 29,"Аня","Москва","методист образовательных программ");
        anya.human();

        Human katya = new Human(2022 - 28,"Катя","Калининград","продакт-менеджер");
        katya.human();

        Human artem = new Human(2022 - 27,"Артем", "Москва", "директор по развитию бизнеса");
        artem.human();
    }
}
