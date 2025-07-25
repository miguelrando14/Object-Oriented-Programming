public class Member 
{
    private String name;
    private int phone;
    private String email;
    private Availablity availablity;
    private Headquarter headquarter;

    public Member (String n, int p, String e, Headquarter h)
    {
        name = n;
        phone = p;
        email = e;
        headquarter = h;
    }
    
    public void setAvailablity (Availablity a)
    {
        availablity = a;
    }

    public Headquarter getHeadquarter()
    {
        return headquarter;
    }

    public String toString()
    {
        return name;
    }
}
