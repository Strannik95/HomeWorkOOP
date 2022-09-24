package OOP2;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada","Grande", 1.7,"Желтый",2015,"Россия");
        ladaGrande.car();

        Car audiA8 = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия");
        audiA8.car();

        Car bmwZ8 = new Car("BMW","Z8", 3.0,"Черный",2021, "Германия");
        bmwZ8.car();

        Car kiaSportage = new Car("Kia","Sportage 4 поколение", 2.4,"Красный",2018, "Южная Корея");
        kiaSportage.car();

        Car hyundaiAvante = new Car("Hyundai","Avante",1.6,"Оранжевый", 2016,"Южная Корея");
        hyundaiAvante.car();
    }


}
