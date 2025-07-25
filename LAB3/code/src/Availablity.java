import java.util.LinkedList;
public class Availablity 
{
    private LinkedList<String> days;
    private LinkedList<Integer> hours;

    public Availablity(LinkedList<String> d, LinkedList<Integer> h)
    {
        days = d;
        hours = h;
    }
}