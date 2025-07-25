import java.util.LinkedList;
public class Regular 
{
    private Member person;
    private Delegate responsible;
    private LinkedList<Vehicle> vehicles;

    public Regular(String n, int p, String e, Headquarter h, Delegate r)
    {
        person = new Member(n, p, e, h);
        responsible = r;
        vehicles = new LinkedList<Vehicle>();
    }

    public void addVehicle(Vehicle v)
    {
        vehicles.add(v);
    }

    /* 
    public Boolean participate(Action a)
    {

    }
    */
    public String getName()
    {   
        return person.toString();
    }
}
