import java.util.LinkedList;

import com.google.zxing.common.BitMatrix;
public class Delegate 
{
    private Member person;
    private LinkedList<Regular> dependents;
    private Headquarter headOf;

    public Delegate(String n, int p, String e, Headquarter h)
    {
        person = new Member(n, p, e, h);
        dependents = new LinkedList<Regular>();
    }

    public void SetAvailablity (Availablity a)
    {
        person.setAvailablity(a);
    }

    public void setHeadOf(Headquarter h)
    {
        headOf = h;
    }

    public void addDependents (Regular r)
    {
        dependents.add(r);
    }

    //funcions QR
    public Image genDelegatesQr(QRLib q)
    {   
        Image image = new Image("/DelegateImage", 20, 20);
        BitMatrix b = q.generateQRCodeImage("This is a Qr for a Delegate Member. You dont have to care about rising sea levels if you live on a mega yatch.",image.getWidth(), image.getHeight());
        image.setBitMatrix(b);
        image.setBitmap(image.getBitmap());
        return image;
    }

    public Image genRegularQr(QRLib q)
    {
        Image image = new Image("/RegularImage",20,20);
        BitMatrix b = q.generateQRCodeImage("This is a Qr for a Regular Member. Climate change doesnt matter if you stay indoors", image.getWidth(), image.getHeight());
        image.setBitMatrix(b);
        image.setBitmap(image.getBitmap());
        return image;
    }

    public Boolean singUpDelegate(Delegate d,QRLib q,Image i)
    {
        String text = q.decodeQRCodeImage(i.getBitmap());
        String text_g = "This is a Qr for a Delegate Member. You dont have to care about rising sea levels if you live on a mega yatch.";
        if (text.equals(text_g))
        {
            headOf.setHead(d);
            return true;
        }
        else return false;
    }

    public Boolean singUpRegular(Regular r, QRLib q, Image i)
    {
        String text = q.decodeQRCodeImage(i.getBitmap());
        String text_g = "This is a Qr for a Regular Member. Climate change doesnt matter if you stay indoors";
        if (text.equals(text_g))
        {
            addDependents(r);
            return true;
        }
        else return false;
    }

    public String toString()
    {
        return person.toString();
    }
    
}