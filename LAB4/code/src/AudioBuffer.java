public class AudioBuffer extends Vector 
{
    public AudioBuffer (int d)
    {
        super(d);
    }

    public void changeVolume(double delta)
    {
        if(delta>0)
        {
            multiply(delta);
        }
        else System.out.print("Your delta isn't greater than 0");
    }   
}
