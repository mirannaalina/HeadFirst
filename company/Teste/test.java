class Aa
{
    public Aa(int x){}
}

class Bb extends Aa {
    public Bb(){
        super(1);
    } }

public class test
{
    public static void main (String args [])
    {
        Aa a = new Bb();
        System.out.println("complete");
    }
}
