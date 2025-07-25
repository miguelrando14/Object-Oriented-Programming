import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Headquarter
{
    //attributes
    private String name;
    private String email;
    private LinkedList<Member> members;
    private Delegate head;
    //private LinkedList<InfoAction> actionsParticipated;
    private Organization organization;
    private LinkedList<City> cities;

    public Headquarter(String n, String e, Organization o)
    {
        name = n;
        email = e;
        organization = o;
        //actionsParticipated = new LinkedList<InfoAction>();
        members = new LinkedList<Member>();
        cities = new LinkedList<City>();
    }

    public void addMember(Member m)
    {
        members.add(m);
    }

    public void addCity(City c)
    {
        cities.add(c);
    }

    public String toString()
    {
        return name;
    }

    /* 
    public void singUpAction(Action a, int nm, int nn, Boolean pc)
    {
        InfoAction infoAction = new InfoAction(a, this, nm, nn, pc);
    }
    */

    public Organization getOrganization()
    {
        return organization;
    }
    /* 
    public Action geAction(LocalDateTime d)
    {

    }
    */

    public void setHead(Delegate d)
    {
        head = d;
    }

    public Delegate getHead ()
    {
        return head;
    }

    public String getHeadName()
    {
        return head.toString();
    }

    public LinkedList<String> getMembers()
    {
        LinkedList<String> memList = new LinkedList<String>();
        memList = Utility.toString(members); 
        return memList;
    }
}