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
        if (brand == null){
            this.brand = "default";
        } else {this.brand = brand;}

         if (model == null){
            this.model = "default";
        } else {
             this.model = model;}

         if (productionCountry == null){
            this.productionCountry = "default";
        } else {
             this.productionCountry = productionCountry;
         }
         if (engineVolume == 0){
             this.engineVolume = 1.5;
         } else {
        this.engineVolume = engineVolume;}

        if(color == null){
            this.color = "Белый";
        }else {
            this.color = color;
        }
        if (productionYear == 0){
            this.productionYear = 2000;
        } else {
        this.productionYear = productionYear;
        }

    }
}
