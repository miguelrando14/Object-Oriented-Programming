import java.awt.Desktop.Action;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Organization 
{
    //attributes
    private String name;
    private LinkedList<Headquarter> places;
    //private LinkedList<Action> actions;

    //constructor
    public Organization (String n)
    {
        name = n;
        places = new LinkedList<Headquarter>();
       //actions = new LinkedList<Action>();
    }

    public LinkedList<String> getHList ()
    {
        LinkedList<String> headList = new LinkedList<String>();
        headList = Utility.toString(places); 
        return headList;
    }


    /* 
    public void addAction(Action a)
    {
        actions.add(a);
    }

    public Action getAction(LocalDateTime d) 
    {
        
    }
    */

    public void addPlace(Headquarter p)
    {
        places.add(p);
    }

    public Headquarter getHeadquarter(String name)
    {
        return Utility.getObject(name, places);
    }

    public LinkedList<Delegate> getHeadDelegates()
    {
        LinkedList<Delegate> l_Delegates = new LinkedList<Delegate>();
        int size = places.size(), i = 0;
        while(i<size)
        {
            l_Delegates.add(places.get(i).getHead());
            i++;
        }
        return l_Delegates;
    }

    public String toString()
    {
        return name;
    }

}
