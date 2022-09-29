package Flowers;

public class Bouquet {
        private final Flower[] bouquet;


        public Bouquet(Flower[] bouquet) {
            this.bouquet = bouquet;
        }

        public float getCost() {
            float sum = 0;
            float margin = 1.1f;
            for (Flower flower : bouquet) {
                sum += flower.getCost();
            }
            return sum * margin;
        }

        public int bouquetLifeSpan() {
            int min = Integer.MAX_VALUE;
            for (Flower flower : bouquet) {
                if (flower.getLifeSpan() < min) {
                    min = flower.getLifeSpan();
                }
            }
            return min;
        }
    }
