package concepts;
public class ANewInstance
//Java program to illustrate creation of Object
//using new Instance
{
	int id =9;
    public static void main(String[] args)
    {
        try
        {
            Class cls = Class.forName("concepts.ANewInstance");
            ANewInstance obj =
                    (ANewInstance) cls.newInstance();
            System.out.println(obj.id);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}