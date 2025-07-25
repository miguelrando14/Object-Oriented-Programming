public class BWFrame extends Frame
{
    public BWFrame(int n, int m)
    {
        super(n,m);
    }

    public void set(int i, int j, double val)
    {
        super.set(i, j, val);
    }

    public double getBW(int i, int j)
    {
        return get(i, j);
    }

    public void changeBrigthness(double delta)
    {
        multiply(delta);
    }
}