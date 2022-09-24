package OOP2;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void car(){
        System.out.println(brand + " " + model + " " + productionYear + " год выпуска," +
                " сборка: " + productionCountry + ", " + color + " цвет," + " объем двигателя - " + engineVolume);

    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }
}
