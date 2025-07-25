import java.util.LinkedList;
public class City 
{
    private String name;
    private int population;
    private LinkedList<Headquarter> hqs;
    
    public City (String n, int p)
    {
        name = n;
        population = p;
        hqs = new LinkedList<Headquarter>();
    }

    public void addHQ(Headquarter h)
    {
        hqs.add(h);
    }

    public String toString()
    {
        return name;
    }
}
