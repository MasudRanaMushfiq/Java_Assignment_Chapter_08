package E8_1;


public class Coin{
        String name;
        Double nameValue;

    public Coin(Double nameValue, String type) {
        this.name = type;
        this.nameValue = nameValue;
    }

    public double getaValue() {
        return nameValue;
    }

}
