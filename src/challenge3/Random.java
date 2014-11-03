package challenge3;

/**
 * Random number generator using LCG algorithm
 * @author ossama
 */
public class Random
{
    private final long m = (long)Math.pow(2, 32);
    private final long a = 1664525;
    private final long c = 1013904223;
    private long seed, xn;
    
    public Random()
    {
        seed = System.nanoTime() % m;
        xn = seed;
    }
    
    public double Next()
    {
        return (xn = (a * xn + c) % m) / (double)m; // div m --> [0 - 1]
    }
}
