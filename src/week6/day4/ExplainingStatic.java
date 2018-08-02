package week6.day4;

public class ExplainingStatic {

    public static void main(String[] args) {

        Bottle milkBottle = new Bottle("Milk");
        Bottle waterBottle = new Bottle("Water");
        Bottle beerBottle = new Bottle("Beer");
        Bottle vodkaBottle = new Bottle("Vodka");

        System.out.println(milkBottle.getName() + " - " + milkBottle.getCount());
        System.out.println(waterBottle.getName() + " - " + waterBottle.getCount());
        beerBottle.setCount(10);
        System.out.println(beerBottle.getName() + " - " + beerBottle.getCount());
        System.out.println(vodkaBottle.getName() + " - " + vodkaBottle.getCount());
        System.out.println(milkBottle.getName() + " - " + milkBottle.getCount());
        System.out.println(waterBottle.getName() + " - " + waterBottle.getCount());

        System.out.println(Bottle.getVolume());
        System.out.println(waterBottle.getVolume());


        String input1 = "what a time great to be alive";
        String input1CamelCased = StringUtil.toCamelCase(input1);
        String input2CamelCased = StringUtil.toCamelCase("hello world");

        System.out.println(input1CamelCased);
        System.out.println(input2CamelCased);
    }

    public static class Bottle {

        public static final int PRICE = 10;
        private static final int VOLUME = 1000;
        private String name;
        private static int count = 0;

        public void setCount(int count) {
            this.count = count;
        }

        public Bottle(String name) {
            this.name = StringUtil.toCamelCase(name);
            ;
            count++;
        }

        public String getName() {
            return name;
        }

        public int getCount() {
            return count;
        }

        public static int getVolume() {
            return VOLUME;
        }
    }
}
