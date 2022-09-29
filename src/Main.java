import Flowers.Bouquet;
import Flowers.Flower;
import Human.Human;
import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Human max = new Human(null, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", 28, null);
        Human artyom = new Human("Артем", "Москва", 27, "мамкин директор");
        Human volodya = new Human("Владимир", "Казань", 21, null);
        System.out.println(max);
        System.out.println(ann);
        System.out.println(kate);
        System.out.println(artyom);
        System.out.println(volodya);
        Car lada = new Car("Lada", null, "желтый", 2015, "Россия", 1.7f,
                "Механика", "Хэчбек", "рр011н077", 5, "Летняя", null,
                null, "2023.07.11", 11_453.20f, "235685126");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", null, null, "Германия",
                3.0f, "Автомат", "Седан", "", 5, null, "есть",
                "нет", null, null, null);
        Car bmw = new Car("BMW", "Z8", "черный", 2021, "Германия", -2f,
                "", "   ", "рl022а023", 5, "Зимняя", "есть",
                "", "  ", 23_000f, "  ");
        Car kia = new Car(null, "Sportage 4 поколение", "красный", 2018, null, 2.4f,
                "  ", "Универсал", "", 6, "  ", "есть",
                "есть", "2023-11.23", 22_500f, "1256");
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый", null, "Южная Корея", null,
                "Автомат", "Седан", "ан222с072", null, null, "нет",
                "ЕСТЬ", "2023.04.05", 16_899f, "133456789");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        audi.setColor("Красный");
        audi.setTires("Зимняя");
        audi.setRegNumber("аа222а072");
        kia.setRegNumber("аа8к072");
        kia.setTires("Зима");
        hyundai.setTires("Лето");
        System.out.println("_____________");
        System.out.println("hyundai.isRegNumberValid() = " + hyundai.isRegNumberValid());
        System.out.println("bmw.isRegNumberValid() = " + bmw.isRegNumberValid());
        System.out.println("kia.isRegNumberValid() = " + kia.isRegNumberValid());
        System.out.println("_____________");
        kia.isInvalidNumberInsurance();
        bmw.isExpiredInsurance();
        hyundai.isExpiredInsurance();


        Flower rose = new Flower("Роза", null, "Голландия", 35.59f, null);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15f, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5f, 10);
        System.out.println(rose);

        Bouquet bouquet = new Bouquet(new Flower[]{rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum,
                chrysanthemum, chrysanthemum, gypsophila});
        System.out.println("bouquet.bouquetLifeSpan() = " + bouquet.bouquetLifeSpan());
        System.out.println("bouquet.getCost() = " + bouquet.getCost());

    }

}