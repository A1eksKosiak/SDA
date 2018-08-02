package week6.day4;

public class VodkaBottle extends ExplainingStatic.Bottle {

    private int alcoholPercentage;

    public VodkaBottle(String name, int alcoholPercentage) {
        super(name);
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String getName() {
        return "VODKA!" + super.getName();
    }

}
