
public class ColorFrame extends Frame 
{
    public ColorFrame(int n, int m)
    {
        super(n,m);
    }

    private double RGBToVal( int r , int g , int b ) 
    {
        double ret = (r<<16)|(g<<8)|b;
        return ret;
    }

    private int[] valToRGB (double rgb ) 
    {
        int [] ret = new int [3] ;
        ret [0] = (( int ) rgb >> 16) & 255;
        ret [1] = (( int ) rgb >> 8) & 255;
        ret [2] = (( int ) rgb ) & 255;
        return ret;
    }
       
    public void set(int i, int j, int r, int g, int b)
    {   
        double ret = RGBToVal(r, g, b);
        set(i, j, ret);
        
    }

    public int[] getRGB(int i, int j)
    {
        return valToRGB(get(i, j));
    }

    public double auxChangeBrigthness(int[] rest, double delta)
    {
        int r,g,b;
        if(rest.length==3)
        {
            r= (int) (rest[0] * delta);
            g= (int) (rest[1] * delta);
            b= (int) (rest[2] * delta);
            if(r>255 || r<0 || g>255 || g<0 || b>255 || b<0 )
            {
                System.out.print("Error, with rgb one or more is gretear than 255 or lower than 0");
                return -1;
            }
            else
            {
                return RGBToVal(r, g, b);
            } 

        }
        else 
        {
            System.out.print("Error, length greater or lower than 3");
            return -1;
        }
    }

    public void changeBrigthness(double delta)
    {
        int i = 0, j = 0;
        while(i<getRows())
        {
            while(j<getCols())
            {
                set(i, j, auxChangeBrigthness(getRGB(i, j), delta));
                j++;
            }
            i++;
            j=0;
        }
    }

    public double auxChangeRGB(int[] rest, int dR, int dB, int dG)
    {
        int r,g,b;
        if(rest.length==3)
        {
            r= rest[0]+dR;
            g= rest[1]+dB;
            b= rest[2]+dG;            
            System.out.print(r);
            if(r>255 || r<0 || g>255 || g<0 || b>255 || b<0 )
            {
                System.out.print("Error, with rgb one or more is gretear than 255 or lower than 0");
                return -1;
            }
            else
            {
                return RGBToVal(r, g, b);
            } 

        }
        else 
        {
            System.out.print("Error, length greater or lower than 3");
            return -1;
        }
    }

    public void changeRGB(int dR, int dG, int dB)
    {
        int i = 0, j = 0;
        while(i<getRows())
        {
            while(j<getCols())
            {
                set(i, j, auxChangeRGB(getRGB(i, j),dR,dG,dB));
                j++;
            }
            i++;
            j=0;
        }
    }


 
}
