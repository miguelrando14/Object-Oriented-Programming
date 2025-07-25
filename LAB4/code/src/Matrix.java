public class Matrix 
{
    //Attributes
    private Vector [] values;
    private int rows;
    private int cols;

    //Constructor
    public Matrix(int n, int m)
    {
        //rows=n;
        setRows(n);
        //cols=m;
        setCols(m);

        values = new Vector[rows];
        int i = 0;
        while(i<rows)
        {
            values[i] = new Vector(cols);
            i++;
        }
    }

    //Methods
    public double get(int i, int j)
    {
        return values[i].get(j);
    }

    public void setCols(int c)
    {
        cols = c;
    }
    public int getCols()
    {
        return cols;
    }
    public void setRows(int r)
    {
        rows = r;
    }
    public int getRows()
    {
        return rows;
    }

    public void set(int i, int j, double val)
    {
        values[i].set(j, val);
    }

    public void set_0()
    {
        int i = 0;
        while(i<rows)
        {
            values[i].set_0();
            i++;
        }
    }

    public void create3DRotationMat(double alpha)
    {
        if(cols == 3 && rows == 3)
        {
        values[0].set(0, Math.round(Math.cos(alpha)));
        values[0].set(1, Math.round(-Math.sin(alpha)));
        values[0].set(2, 0);

        values[1].set(0, Math.round(Math.sin(alpha)));
        values[1].set(1, Math.round(Math.cos(alpha)));
        values[1].set(2, 0);

        values[2].set(0, 0);
        values[2].set(1, 0);
        values[2].set(2, 1);
        }
        else System.out.println("Error with the dim of matrix are not cols == 3 or rows == 3");

    }

    public Vector getColVector(int i)
    {
        return values[i];
    }

    public void multiply (double s)
    {
        int i = 0;
        while(i<rows)
        {
            values[i].multiply(s);
            i++;
        }
    }

    public void print ( )
    {
        int i = 0;
        while(i<rows)
        {
            values[i].print();
            i++;
        }
    }
}
