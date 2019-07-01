public abstract class AbstractTest
{
    public int getNum()
    {
        return 45;
    }
    public abstract class Bar
    {
        public int getNum()
        {
            return 38;
        }
    }
    public static void main (String [] args)
    {
       Luty l= new Luty() {
        @Override
        public String hello() {
            return "luty";
        }
    };

       Long nr = null;
       Luty t =new LutyTest();

       //t.

       l.hello();
    }
}

