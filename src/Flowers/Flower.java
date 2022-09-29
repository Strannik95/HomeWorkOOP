package Flowers;


public class Flower {
    private String name;
    private String color;
    private String country;
    private float cost;
    private Integer lifeSpan;

    public Flower(String name, String color, String country, float cost, Integer lifeSpan) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Без имени";
        } else {
            this.name = name;
        }

        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1f;
        } else {
            this.cost = cost;
        }
        if (lifeSpan == null || lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public float getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "Без имени";
        } else {
            this.name = name;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1f;
        } else {
            this.cost = cost;
        }
    }

    public void setLifeSpan(Integer lifeSpan) {
        if (lifeSpan == null || lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return name + ", цвет " + color + ", страна " + country + ", цена " + cost + ", дней жизни " + lifeSpan;
    }
}