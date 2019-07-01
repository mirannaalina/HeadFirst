public class Buffer {

    //buffer e ca un cos de cumparaturi , strange mai multe date si usureaza executia
    public static void stringReplace (String text)
{
    text = text.replace ('j' , 'c'); /* Line 5 */
}
    public static void bufferReplace (StringBuffer text)
    {
        text = text.append ("c");  /* Line 9 */
    }
    public static void main (String args[])
    {
        String textString = new String ("java");
        StringBuffer textBuffer = new StringBuffer ("java"); /* Line 14 */
        stringReplace(textString);
        bufferReplace(textBuffer);
        System.out.println (textString + textBuffer);
    }
}

