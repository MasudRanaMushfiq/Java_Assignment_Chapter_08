package E8_18;

import java.util.Random;


public class Die
{
    private static Random generator;
    private int sides;
    public Die(int s)
    {
        sides = s;
        generator = new Random();
    }
    public int cast()
    {
        return 1 + generator.nextInt(sides);
    }
}
