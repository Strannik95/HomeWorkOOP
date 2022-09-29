package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;
    private Float engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final Integer numberOfSeats;
    private String tires;
    private final Key key;
    private final Insurance insurance;

    public Car(String brand, String model, String color, Integer productionYear, String productionCountry, Float engineVolume,
               String transmission, String bodyType, String regNumber, Integer numberOfSeats, String tires, String wirelessAccess,
               String remoteStart, String date, Float cost, String number) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.color = Objects.requireNonNullElse(color, "белый");
        if (productionYear == null || productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "transmission";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "bodyType";
        } else {
            this.bodyType = bodyType;
        }
        if (regNumber == null || regNumber.isBlank() || regNumber.isEmpty()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        this.numberOfSeats = Objects.requireNonNullElse(numberOfSeats, 4);
        if (tires == null || tires.isBlank() || tires.isEmpty()) {
            this.tires = "tires";
        } else {
            this.tires = tires;
        }
        key = new Key(wirelessAccess, remoteStart);
        insurance = new Insurance(date, cost, number);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "transmission";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank() || regNumber.isEmpty()) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setTires(String tires) {
        if (tires == null || tires.isBlank() || tires.isEmpty()) {
            this.tires = "tires";
        } else {
            this.tires = tires;
        }
    }

    public boolean isRegNumberValid() {
        return this.regNumber.matches("[AВЕКМНОРСТУХавекмнорстух]{2}\\d{3}[AВЕКМНОРСТУХавекмнорстух]\\d{3}");
    }

    public void isInvalidNumberInsurance() {
        if (insurance.number.length() != 9 ) {
            System.out.println("Некорректный номер страховки!");
        }
    }

    public void isExpiredInsurance() {
        if (insurance.validity.isBefore(LocalDate.now())) {
            System.out.println("Страховка просрочена");
        }
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + ' ' + model + ", цвет " + color + ", год выпуска " + productionYear +
                ", страна-производитель " + productionCountry + ", объем двигателя " + engineVolume + " л, коробка передач "
                + transmission + '\n' + ", тип кузова " + bodyType + ", номер " + regNumber + ", количество мест " +
                numberOfSeats + ", резина " + tires + ", " + key + ", " + insurance;
    }

    private class Key {
        private final boolean isWirelessAccess;
        private final boolean isRemoteStart;

        private Key(String wirelessAccess, String remoteStart) {
            if (wirelessAccess == null) {
                isWirelessAccess = false;
            } else {
                isWirelessAccess = wirelessAccess.equalsIgnoreCase("Есть");
            }
            if (remoteStart == null) {
                isRemoteStart = false;
            } else {
                isRemoteStart = remoteStart.equalsIgnoreCase("Есть");
            }
        }

        @Override
        public String toString() {
            String access, start;
            if (isWirelessAccess) {
                access = "есть";
            } else access = "нет";
            if (isRemoteStart) {
                start = "есть";
            } else start = "нет";
            return String.format("бесключевой доступ: %s, удаленный запуск: %s", access, start);
        }
    }

    private class Insurance {
        private LocalDate validity;
        private final Float cost;
        private String number;

        private Insurance(String date, Float cost, String number) {
            if (date == null || date.isEmpty() || date.isBlank() || date.length() != 10) {
                validity = LocalDate.parse("1900-01-01");
                System.out.println("Некорректная дата");
            } else {
                validity = LocalDate.parse(date.replace('.', '-'));
            }
            if (cost == null || cost < 0) {
                this.cost = 0f;
            } else {
                this.cost = cost;
            }
            if (number == null || number.isBlank() || number.isEmpty()) {
                this.number = "Не указано";
            } else if (number.length() != 9) {
                this.number = "Не указано";
                System.out.println("Номер страховки некорректный!");
            } else {
                this.number = number;
            }
        }

        @Override
        public String toString() {
            return "Страховка до  " + validity + ", стоимость " + cost + ", номер " + number;
        }
    }
}