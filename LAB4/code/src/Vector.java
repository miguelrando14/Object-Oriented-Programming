import java.util.Arrays;

public class Vector
{
    //Attributes
    private double [] values;
    private int dim;

    //Constructure;
    public Vector (int d)
    {
        dim = d;
        values = new double[dim];
        set_0();

    }

    public Vector(Vector v)
    {
        dim = v.getDim();
        values = new double[dim];
        int i = 0;
        while(i<dim)
        {
            values[i]=v.get(i);
            i++;
        }
        
    }

    //Methods
    public int getDim()
    {
        return dim;
    }
    public void set(int i, double val)
    {
        if(i>dim)
        {
            System.out.println("Error cuase i>dim");
        }
        else 
        {
            values[i]=val;
        }
    }
    public void copy_vec (Vector v)
    {
        if(v.getDim()==dim)
        {
        int i = 0;
        while(i<dim)
        {
            values[i]=v.get(i);
            i++;
        }
        }
        else System.out.println("Error cuase dimensions are not equal");
        
    }

    public void set3D(double i, double j, double k)
    {
        if(dim==3)
        {
            values[0]=i;
            values[1]=j;
            values[2]=k;
        }
        else 
        {
            System.out.println("Error cuase dim != 3dimensions");
        }
    }

    public void multiplyMat(Matrix m)
    {
        if(m.getRows()==dim)
        {
            int i = 0;
            int j = 0;
            double v=0;
            Vector vector;
            Vector f_vector = new Vector(dim);
            while(i<dim)
            {   
                vector = m.getColVector(i);
                while(j<dim)
                {
                    v = v + multiplyValue(j, vector.get(j));
                    j++; 
                }
                f_vector.set(i, v);
                v = 0;
                j = 0;
                i++;
            }
            copy_vec(f_vector);
        }
        else 
        {
            System.out.println("Error cuase dim != 3dimensions");
        } 
    }

    public double multiplyValue(int i, double s)
    {
        return values[i]*s;
    }

    public void set_0()
    {
        int i = 0;
        while(i<dim)
        {
            set(i,0);
            i++;
        }
    }

    public double get(int i)
    {
        if(i>dim)
        {
            System.out.println("Error cause i>dim");
            return 0;
        }
        else
        {
            return values[i];
        }  
    }

    public void multiply (double s)
    {
        int i = 0;
        while(i<dim)
        {
            set(i, values[i]*s);
            i++;
        }
    }

    public void print()
    {
        // int i = 0;
        // while(i<dim)
        // {

        //     System.out.println(values[i]);
            
        //     i++;
        // }
        System.out.print(Arrays.toString(values)+"\n");
    }

}