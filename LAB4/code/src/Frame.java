public abstract class Frame extends Matrix 
{
    public Frame(int n, int m)
    {
        super(n, m);
    }
    
    abstract void changeBrigthness(double delta);

}
