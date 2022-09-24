package OOP2;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car();
        ladaGrande.brand = "Lada";
        ladaGrande.model = "Grande";
        ladaGrande.color = "Желтый";
        ladaGrande.productionYear = 2015;
        ladaGrande.productionCountry = "Россия";
        ladaGrande.engineVolume = 1.7;
        ladaGrande.car();

        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.color = "Черный";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Германия";
        audiA8.engineVolume = 3.0;
        audiA8.car();

        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.color = "Черный";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германия";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.car();

        Car kiaSportage = new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage 4 поколение";
        kiaSportage.color = "Красный";
        kiaSportage.productionYear = 2018;
        kiaSportage.productionCountry = "Южная Корея";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.car();

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.color = "Оранжевый";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южная Корея";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.car();
    }


}
