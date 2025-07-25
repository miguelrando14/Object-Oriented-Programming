import java.util.LinkedList;
public class Region 
{
    private String name;
    private LinkedList<City> cities;
    
    public Region(String n)
    {
        name = n;
        cities = new LinkedList<City>();
    }

    public void setCities(LinkedList<City> c)
    {
        cities = c;
    }
}
